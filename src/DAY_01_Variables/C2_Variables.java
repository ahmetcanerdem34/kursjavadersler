package DAY_01_Variables;

public class C2_Variables {

	public static void main(String[] args) {
		
		//variable tan�mlamak i�in �nce ismini yazar�n
		
		int sayi;//noktal� virg�l, yaz�zm dilinde . nokta girbidir
		//java ; � g�r�nce o sat�rdaki kod yaz�l�m�n� bitti�ini anlar
		//�uan da kutuyu olu�turduk ama de�er atamam��t�k atayal�m
		
		sayi=27;
		
		System.out.print(sayi);//e�er println deki ln yi klad�r�rsak yan yana yazar
		
		//char olu�tural�m
		char ilkHarf='m';System.out.println(ilkHarf);
		
		//27m
		
		double sayiDouble=5.34;
		
		System.out.println(sayiDouble);
		//5.34
		
		System.out.println(sayi + sayiDouble);
		//32.34
		
		System.out.println(sayi + ilkHarf);
		//136----> sayi de�erim 27 idi. ilkHarf char ile toplad�k 136 verdi; nedeni aski kodlar�(M harfinin aski de�eri =77 dir)
		
		System.out.println("********************");

		int sayi1=10;
		int sayi2=45;
		int toplam=sayi1+sayi2+sayi;
		
		System.out.println(toplam);

	}

}
