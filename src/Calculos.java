import java.util.Scanner;

public class Calculos {

    Scanner reader = new Scanner(System.in);

    public int quadrado() {
        System.out.println("Informe os lados do quadrado: ");
        int lados = reader.nextInt();
        return lados * 4;
    }

    public int retangulo() {
        System.out.println("Informe a altura do retângulo: ");
        int altura = reader.nextInt();
        System.out.println("Informe a base do retângulo: ");
        int base = reader.nextInt();
        return altura * base;
    }

    public int triangulo() {
        System.out.println("Informe a altura do triângulo: ");
        int altura = reader.nextInt();
        System.out.println("Informe a base do triângulo: ");
        int base = reader.nextInt();
        return (altura * base) / 2;
    }

    public int losango() {
        System.out.println("Informe a primeira diagonal do losango: ");
        int diagonal1 = reader.nextInt();
        System.out.println("Informe a segunda diagonal do losango: ");
        int diagonal2 = reader.nextInt();
        return (diagonal1 * diagonal2) / 2;
    }

    public int trapezio() {
        System.out.println("Informe a altura do trapézio: ");
        int altura = reader.nextInt();
        System.out.println("Informe a primeira base do trapézio: ");
        int base1 = reader.nextInt();
        System.out.println("Informe a segunda base do trapézio: ");
        int base2 = reader.nextInt();
        return (altura * (base1 + base2)) / 2;
    }

    public int paralelepipedo() {
        System.out.println("Informe a altura do paralelepípedo: ");
        int altura = reader.nextInt();
        System.out.println("Informe a base do paralelepípedo: ");
        int base = reader.nextInt();
        System.out.println("Informe a largura do paralelepípedo: ");
        int largura = reader.nextInt();
        return altura * base * largura;
    }

    public double cubo() {
        System.out.println("Informe os lados do quadrado: ");
        int lados = reader.nextInt();
        return Math.pow(lados, 3);
    }

    public double cilindro() {
        System.out.println("Informe a altura do cilindro: ");
        int altura = reader.nextInt();
        System.out.println("Informe o raio do cilindro: ");
        int raio = reader.nextInt();
        return Math.pow(raio, 2) * altura;
    }


}
