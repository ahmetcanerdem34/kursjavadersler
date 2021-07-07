package DAY_31_varrags;

public class C4_Varargs03 {

	public static void main(String[] args) {
		
		//verilen int lerden ilki hariç tum sayýlarý toplayýn
		//bulduðunuz toplam ile ilk sayýyý carp sonuc yadýr
		//each loop hepsini alýrdý burda alacaðýmýz sayýyýyý ayrý yazýyoruz
		
		
		
		/* 
	        * - Varargs tek method’a istediðimiz kadar parametre yollayarak sonuç almamizi saðlar. Yani parametre sayýmiz deðiþken ancak method’un 
	        * yapacaðý iþ sabitse Varargs kullanarak tek method’la kodumuzu yazabiliriz.
	        * - Varargs ozellik olarak list gibi calisir (uzunlugu esnektir) fakat varargs’in arka planinda Java Array ile calisir.(List olarak degil)
	        * - Varargs’i declare etmek icin data type’dan sonra ... kullaniriz. (int... sayi vb..)
	        * - Bir method’da varargs disinda parametre varsa varargs parametre olarak en sona yazilmalidir.(aksidurumda varargs nerede duracagini bilemez)
	        * - Bir method’da sadece 1 varargs kullanilabilir
	        */
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,34,544,3,5,4,-54);
		
		
		
		/* (int...var, int sayi) yazdik Java hata vermeye basladi ? Usttekki toplama methodcall'larda sikayet etmeye basladi neden ? 
         * Varargs icine butun int'leri alir . Zaten butun int'ler varargs icine alacagim daha neden yaziyorsun diyor.
         * O yuzden eger boyle bir sey yapilacaksa once int'ler daha sonra varargs yazilmalidir . Peki hangileri sol tarafa hangileri varargs
         * icine dahil olacak ? Methodcall'daki sayilardan ilkini ayri tutar geriye kalan sayilarin hepsini varargs'in icine atar.
         * Mesela yukarda 5 10 15 methodcall'unu edusunlim . int sayi = 5; , int...var= 10 , 15'i alir. (int sayi, int...var) icin.
         * 
         * Eger (int sayi1, int sayi2, int...var) olursa olur mu ? Evet olur bu sefer methodcall'larda ki ilk iki degeri alir digerlerini
         * varargs icine atar . Ornek olarak ; toplama(4,5,9,7); dusunelim . sayi1=4 sayi2=5 olur 9 ve 7 sayisini int...var icine atar
         */
		
	}
		
		
									//ilkini java buna verir ayýracapýmýzý
		public static void toplama(int sayi, int... var) {//(, int ...var, int sayi) hata verdi deðiþtirdim düzeldi
									//detayý fotoda, ilk sayýyý ayýrmak istiyorum
			
			  System.out.println("varargs'a dahil olmayan argument: "+ sayi); 
			
			//yukardaki sarunun cevabý
		int toplam=0;
		for (int each : var) {
			
			toplam+=each;
		}
		System.out.println("toplam :" +toplam);
		System.out.println("toplam :" +toplam*sayi);

	}

}
