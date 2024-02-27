package tarefaJava01;

import java.util.Scanner;

public class Exercicio07 {

	
	public static void main(String[] args){

  Scanner objBase = new Scanner(System.in);

  Scanner objAltura = new Scanner(System.in);

     float retanguloBase = 0;

	 float retanguloAltura =0;

  System.out.println("Digite a altura:");

		      retanguloAltura = Float.parseFloat(objAltura.nextLine());

 System.out.println("Digite a base");

		       retanguloBase = Float.parseFloat(objBase.nextLine());

		       float area = calcula_area_retangulo(retanguloBase, retanguloAltura);

  System.out.print("A area do retangulo e: ");

  System.out.println(Float.toString(area));

		       objAltura.close();

		       objBase.close();

		   }

		   public static float calcula_area_retangulo(float base, float altura){

		       float area = (base*altura);

		       return area;

		   }

		}
