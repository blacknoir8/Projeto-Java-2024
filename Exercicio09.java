package tarefaJava01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado:");
        double lado = sc.nextDouble();

        double area = calcularAreaQuadrado(lado);

        System.out.println("A área do quadrado é: " + area);
        sc.close();
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
        
    }
}
