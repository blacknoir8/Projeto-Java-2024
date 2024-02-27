package tarefaJava01;

import java.util.Scanner;
public class Exercicio11 {

	
	
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor da base maior do trapézio:");
	        double baseMaior = scanner.nextDouble();

	        System.out.println("Digite o valor da base menor do trapézio:");
	        double baseMenor = scanner.nextDouble();

	        System.out.println("Digite o valor da altura do trapézio:");
	        double altura = scanner.nextDouble();

	        // Calculo
	        double area = ((baseMaior + baseMenor) * altura) / 2;

	        System.out.println("A área do trapézio é: " + area);

	        scanner.close();
	    }
	}

