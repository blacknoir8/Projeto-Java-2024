package tarefaJava01;

import java.util.Scanner;

public class Exercicio08 {

	
	public static void main(String[] args){

  Scanner objBase = new Scanner(System.in);

  Scanner objAltura = new Scanner(System.in);

     float trianguloBase = 0;

	 float trianguloAltura =0;

  System.out.println("Digite a altura:");

              trianguloAltura = Float.parseFloat(objAltura.nextLine());

 System.out.println("Digite a base");

             trianguloBase = Float.parseFloat(objBase.nextLine());

		       float area = calcula_area_triângulo(trianguloBase, trianguloAltura);

  System.out.print("A area do triângulo é: ");

  System.out.println(Float.toString(area));

		       objAltura.close();

		       objBase.close();

		   }

		   public static float calcula_area_triângulo(float base, float altura){

		       float area = (base/altura);

		       return area;

		   }

		}


