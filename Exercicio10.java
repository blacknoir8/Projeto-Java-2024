package tarefaJava01;

import java.util.Scanner;
public class Exercicio10 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        //  diagonais do losango
	        System.out.println("Digite o valor da diagonal maior do losango:");
	        double diagonalMaior = scanner.nextDouble();

	        System.out.println("Digite o valor da diagonal menor do losango:");
	        double diagonalMenor = scanner.nextDouble();

	        // área do losango
	        double area = (diagonalMaior * diagonalMenor) / 2;

	        
	        System.out.println("A área do losango é: " + area);

	        scanner.close();
	    }
	}

