package DAY_43_interface;

public class Runner {

	public static void main(String[] args) {
		
		Civic c1=new Civic();
		c1.hareket();
		c1.benzin();
		c1.direksiyon();
		c1.ayna();
		c1.far();
		c1.kaporta();
		c1.garanti();
		c1.jant();
		
//		h�zl� vee konomik hareket eder
//		benzin kullan�r
//		deri hidrolik direksiyon
//		otomatik kararma �zelli�i
//		Led far
//		Psalanamz �elik
//		100.000 km garanti
//		�elik jant

		//c1.fiyat=30000;//The final field IcDonanim.fiyat cannot be assigned
		//CTE VER�R ��NK� �NTERFACE DE EN BA�TA VER�LEN F�YATLAR F�NAL DIR SONRK� OBJE OLU�UMLARINDA  DE���T�R�LMEZ
		
		
		//fiyat variable sine interface ismi ile ula�abiliriz, obje uretmeye gerek yok
		//demekki interface deki variable ler statictir
		System.out.println(IcDonanim.F�YAT);//20000

		
		//interfacedi tum class memberler public tir
		//oyleyese interface deki variabelelr public + static + final d�r
		
		
		//ayn� isimli ayn� datatipli variableler parent interface deolu�ruulur ancak
		//ama ayn� isimli variableleri obje kullanarak �a��r�rsan�z java hangidsini �a��raca��na karar veremez ve CTE verir
		//CTE alamamak i�in ayn� isimli variableeler interface isimleriyle �a��r�lmal�d�r
		//zaten �nterface lerdeki tum variable ler static oldu�undan do�rusu variableler INTERFACE ile �a��rmakt�r
		//java staticleri obje ile �al���nca hata verir
		
		//System.out.println(c1.MARKA;);
		
		
		System.out.println(IcDonanim.MARKA);//Honda
		System.out.println(DisDonanim.MARKA);//Mazda
		System.out.println(Lastik.MARKA);//Audi

		
		
	}

}
