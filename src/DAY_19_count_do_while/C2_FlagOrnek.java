package DAY_19_count_do_while;

import java.util.Scanner;

public class C2_FlagOrnek {

	public static void main(String[] args) {
		
		//kullan��cdan bir c�mle al�n
		//cumlede buyuk harfvar m� yok mu yazd�r�n
		//while loop ile yap�lacak
		
		
		Scanner scan= new Scanner (System.in);
		System.out.print("bir c�mle giriniz :");
		String cumle=scan.nextLine();
		
		//count dan farkl� olarak var m� yokmu anla�na gelen flag kullanaca��z
		String flag ="yok";
		
		int index=0;
		
		
		while(index<cumle.length()){
			
			if (cumle.charAt(index)>'A' && cumle.charAt(index)<='Z') {
				
				flag="var";
				
			}
			index++;
			
		}
			System.out.println("verdi�iniz cumlede buyuk harf"+" "+ flag);
			
//			bir c�mle giriniz :ali okula gel
//			verdi�iniz cumlede buyuk harfyok
			
//			bir c�mle giriniz :ali okula Ko�
//			verdi�iniz cumlede buyuk harfvar
			
			scan.close();
		}
			
			
		
		
		

	}

