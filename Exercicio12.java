package tarefaJava01;


import java.util.Scanner;

public class Exercicio12 {
	
	
	    public static void main(String[] args) {
	        // receber entrada do usuário
	        Scanner scanner = new Scanner(System.in);

	        // insira o raio do círculo
	        System.out.print("Digite o raio do círculo: ");
	        double raio = scanner.nextDouble();

	        // Calcula a área do círculo usando a fórmula A = π * r^2
	        double area = Math.PI * Math.pow(raio, 2);

	     
	        System.out.println("A área do círculo é: " + area);

	     
	        scanner.close();
	    }
	}



