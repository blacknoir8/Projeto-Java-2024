package tarefaJava01;

import java.util.Scanner;

public class Exercicio05 {

	
	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		 
		 System.out.println("Digite um valor  :");
		 
		 int valor =sc.nextInt();
	     
         System.out.println("Digite outro valor  :");
		 
		 int valor2 =sc.nextInt();
		 
		 int resultado=valor*valor2;
		 
		 System.out.println("A soma dos valor é :"+resultado);
		 sc.close();
	
		
	
	}
}
