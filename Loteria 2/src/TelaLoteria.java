import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

    public class TelaLoteria extends JFrame{
        private Random random = new Random();

        private JPanel TelaInicial;
        private JLabel TextoLoteria;
        private JLabel TextoLoteria2;
        private JLabel TextodoMenu;
        private JLabel Textomenu1;
        private JLabel Textomenu2;
        private JLabel Textomenu3;
        private JButton apostarButton1;
        private JButton apostarButton2;
        private JButton apostarButton3;
        private JButton apostarButton4;

        public TelaLoteria(){
            setTitle("LotoFácil");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(4, 1));

            JButton btnApostar0a100 = new JButton("Apostar de 0 a 100");
            JButton btnApostarAaZ = new JButton("Apostar de A a Z");
            JButton btnApostarParOuImpar = new JButton("Apostar em Par ou Ímpar");
            JButton btnSair = new JButton("Sair");

            btnApostar0a100.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int numeroEscolhido = Integer.parseInt(JOptionPane.showInputDialog("1) Apostar de 0 a 100"));
                    Apostarde0a100(numeroEscolhido);
                }
            });

            btnApostarAaZ.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    char letraEscolhida = JOptionPane.showInputDialog("2) Apostar de A à Z ").toUpperCase().charAt(0);
                    ApostardeAaZ(letraEscolhida);
                }
            });

            btnApostarParOuImpar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int numeroEscolhido = Integer.parseInt(JOptionPane.showInputDialog("3) Apostar em Par ou Ímpar "));
                    ApostaremParouimpar(numeroEscolhido);
                }
            });

            btnSair.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            add(btnApostar0a100);
            add(btnApostarAaZ);
            add(btnApostarParOuImpar);
            add(btnSair);
        }

        public void Apostarde0a100(int numeroEscolhido){
            int numeroSorteado = random.nextInt(101);

            if(numeroEscolhido < 0 || numeroEscolhido > 100) {
                JOptionPane.showMessageDialog(null,"Aposta Inválida.");
            } else {
                if (numeroEscolhido == numeroSorteado){
                    JOptionPane.showMessageDialog(null,"Você ganhou R$ 1.000,00 Reais");
                } else {
                    JOptionPane.showMessageDialog(null,"Que Pena! O número Sorteado foi:" +numeroSorteado+".");
                }
            }
        }

        public void ApostardeAaZ(char letraEscolhida){
            JOptionPane.showMessageDialog(null," Digite a Letra desejada de A à Z" );
            // char letraEscolhida = scanner.next().toUpperCase().charAt(0);

            if (!Character.isLetter(letraEscolhida) || letraEscolhida < 'A' || letraEscolhida > 'Z') {
                JOptionPane.showMessageDialog(null,"Aposta inválida.");
                return;
            }

            char letraSorteada = 'R';

            if (letraSorteada == letraEscolhida){
                JOptionPane.showMessageDialog(null,"Você ganhou R$ 500,00 Reais.");
            } else {
                JOptionPane.showMessageDialog(null,"Que pena ! A Letra Sorteada foi:\n" +letraSorteada+ ".");
            }
        }

        public void ApostaremParouimpar(int numeroEscolhido){
            JOptionPane.showMessageDialog(null," Digite um número inteiro");
            // int numeroEscolihdo = scanner.nextInt();
            if (numeroEscolhido % 2 ==0){
                JOptionPane.showMessageDialog(null,"Você ganhou R$ 100,00 reais.");
            } else{
                JOptionPane.showMessageDialog(null,"Que pena ! O número Digitado é Ímpar e a premiação foi para números Pares \n ");
            }
        }
        public void main(String[] args) {
            new TelaLoteria().setVisible(true);
        }
    }
