package tarefaJava01;

import java.util.Scanner;

public class Exercicio02 {

	
	public static void main(String[] args){
		
		System.out.println("Digite um valor para saber o antecessor :");
	    
	    Scanner sc =new Scanner(System.in);
		
		int numero =sc.nextInt();
		int resultado = numero-1;
		
		System.out.println("O número antecessor do " + numero + " é :"+ resultado);
		sc.close();
	}
}
