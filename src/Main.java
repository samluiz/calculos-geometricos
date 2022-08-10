import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Calculos calcular = new Calculos();

        int opcao = 10;
        char continuar;

        do {
            try {
                System.out.println("""
                               Bem vindo a calculadora geométrica! O que deseja calcular?
                               [1] A área de um quadrado
                               [2] A área de um retângulo
                               [3] A área de um triânulo
                               [4] A área de um losango
                               [5] A área de um trapézio
                               [6] O volume de um paralelepípedo
                               [7] O volume de um cubo
                               [8] O volume de um cilindro
                               [0] Sair""");
                opcao = reader.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Você deve informar um valor numérico de 0 a 8.");
                System.exit(0);
            }

            switch (opcao) {
                case 1 -> {
                    System.out.println("A área do quadrado corresponde a: " + calcular.quadrado());
                    opcao = 10;
                }
                case 2 -> {
                    System.out.println("A área do retângulo corresponde a: " + calcular.retangulo());
                    opcao = 10;
                }
                case 3 -> {
                    System.out.println("A área do triângulo corresponde a: " + calcular.triangulo());
                    opcao = 10;
                }
                case 4 -> {
                    System.out.println("A área do losango corresponde a: " + calcular.losango());
                    opcao = 10;
                }
                case 5 -> {
                    System.out.println("A área do trapézio corresponde a: " + calcular.trapezio());
                    opcao = 10;
                }
                case 6 -> {
                    System.out.println("O volume do paralelepípedo corresponde a: " + calcular.paralelepipedo());
                    opcao = 10;
                }
                case 7 -> {
                    System.out.println("O volume do cubo corresponde a: " + calcular.cubo());
                    opcao = 10;
                }
                case 8 -> {
                    System.out.println("O volume do cilindro corresponde a: " + calcular.cilindro());
                    opcao = 10;
                }
                case 0 -> {
                    System.out.println("Obrigado e volte sempre!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Informe uma opção válida.");
                    opcao = 10;
                }
            }

                System.out.println("Deseja calcular algo mais?\n[S] SIM\n[N] NÃO");
                continuar = reader.next(".").charAt(0);

                if (continuar == 'N' || continuar == 'n') {
                    System.out.println("Obrigado por me utilizar e volte sempre!");
                }


        } while((continuar == 'S') || (continuar == 's'));
    }
}
