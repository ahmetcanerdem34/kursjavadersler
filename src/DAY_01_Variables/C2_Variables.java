package DAY_01_Variables;

public class C2_Variables {

	public static void main(String[] args) {
		
		//variable tanýmlamak için önce ismini yazarýn
		
		int sayi;//noktalý virgül, yazýzm dilinde . nokta girbidir
		//java ; ü görünce o satýrdaki kod yazýlýmýný bittiðini anlar
		//þuan da kutuyu oluþturduk ama deðer atamamýþtýk atayalým
		
		sayi=27;
		
		System.out.print(sayi);//eðer println deki ln yi kladýrýrsak yan yana yazar
		
		//char oluþturalým
		char ilkHarf='m';System.out.println(ilkHarf);
		
		//27m
		
		double sayiDouble=5.34;
		
		System.out.println(sayiDouble);
		//5.34
		
		System.out.println(sayi + sayiDouble);
		//32.34
		
		System.out.println(sayi + ilkHarf);
		//136----> sayi deðerim 27 idi. ilkHarf char ile topladýk 136 verdi; nedeni aski kodlarý(M harfinin aski deðeri =77 dir)
		
		System.out.println("********************");

		int sayi1=10;
		int sayi2=45;
		int toplam=sayi1+sayi2+sayi;
		
		System.out.println(toplam);

	}

}
