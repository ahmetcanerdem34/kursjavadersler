package DAY_09_Ternary;

import java.util.Scanner;

public class C6NestedTuranary2 {

	public static void main(String[] args) {
		
		
		//kullan�c�dan bir harf isteyin kucuk harf ise konsola kucuk harf
		//buyuk harf ise BUYUK  de�ilse girdi�iniz karakter harf de�il yazd�r�n

		

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		
		char harf=scan.next().charAt(0);
		String sonuc = ((harf>='a' && harf<='z') || (harf>='A' && harf<='Z')) 
						? ((harf>='a' && harf<='z') )?"ilk harf kucuk harf" : "ilk harf buyuk harf"
						: "gecersiz karakter";
		System.out.println(sonuc);			
		scan.close();
		
	}

}
