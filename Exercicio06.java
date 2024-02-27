package tarefaJava01;

import java.util.Scanner;

public class Exercicio06 {

	
	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		 
		 System.out.println("Digite um valor  :");
		 
		 float valor =sc.nextInt();
	     
         System.out.println("Digite outro valor  :");
		 
		 float valor2 =sc.nextInt();
		 
		 float resultado=valor/valor2;
		 
		 System.out.println("valor é :"+resultado);
		 sc.close();
	
		
	
	}
}
