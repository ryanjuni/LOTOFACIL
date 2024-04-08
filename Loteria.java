import java.util.Scanner;
import java.util.Random;

public class Loteria {
    public static void menu () {
        System.out.println("**************************");
        System.out.println("Menu LOTOFÁCIL:\n");
        System.out.println("1) Apostar de 0 a 100 ");
        System.out.println("2) Apostar de A à Z ");
        System.out.println("3) Apostar em Par ou Ímpar ");
        System.out.println("0) Sair ");
        System.out.println("**************************");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int Possibilidades;
        do {
            menu();
            Possibilidades = scanner.nextInt();

            switch (Possibilidades) {
                case 1:
                    Apostarde0a100(scanner, random);
                    break;
                case 2:
                    ApostardeAaZ(scanner, random);
                    break;
                case 3:
                    ApostaremParouimpar(scanner);
                    break;
                case 0:
                    Sair(scanner);
                    break;
                default:
                    System.out.println("Aposta Inválida.");

            }
        } while (Possibilidades != 0);
    }

        public static void Apostarde0a100(Scanner scanner,Random random){
           int numeroEscolhido = scanner.nextInt();
           if(numeroEscolhido < 0 || numeroEscolhido > 100) {
               System.out.println("Aposta Inválida.");

           }
            int numeroSorteado = random.nextInt(101);
           if (numeroEscolhido == numeroSorteado){
               System.out.println("Você ganhou R$ 1.000,00 Reais");
           }
           else {
               System.out.println("Que Pena! O número Sorteado foi:" +numeroSorteado+".");
           }
        return;
        }
        public static void ApostardeAaZ(Scanner scanner,Random random){
            System.out.println(" Digite a Letra desejada de A à Z" );
            char letraEscolhida = scanner.next().toUpperCase().charAt(0);


            if (!Character.isLetter(letraEscolhida) || letraEscolhida< 'A' || letraEscolhida > 'Z') {
                System.out.println("Aposta inválida.");
                return;

            }
            char letraSorteada = 'R';

            if (letraSorteada == letraEscolhida){
                System.out.println("Você ganhou R$ 500,00 Reais.");
            }
            else {
                System.out.println("Que pena ! A Letra Sorteada foi:\n" +letraSorteada+ ".");
            }
        }
        public static void ApostaremParouimpar(Scanner scanner){
        System.out.println(" Digite um número inteiro");
        int numeroEscolihdo = scanner.nextInt();
        if (numeroEscolihdo % 2 ==0){
            System.out.println("Você ganhou R$ 100,00 reais.");
        }
        else{
            System.out.println("Que pena ! O número Digitado é Ímpar e a premiação foi para números Pares \n ");
        }
        }
        public static void Sair (Scanner scanner){

        }
}
