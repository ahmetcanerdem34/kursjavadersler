package ODEVLER_5;

import java.util.Scanner;

public class Soru_04 {

	public static void main(String[] args) {
		
		/*
		Get numbers from the user and output that number consecutive fibonacci number sequence
		     	e.g : User enters 10
		outp
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int num=scan.nextInt();
		
		int num1=0;
		int num2=1;
		int num3;
		
		
		for (int i = 2; i < num; i++) {
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
			
		}

		System.out.println();

	}

}
