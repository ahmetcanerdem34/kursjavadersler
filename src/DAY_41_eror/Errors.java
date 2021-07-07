package DAY_41_eror;

public class Errors {

	public static void main(String[] args) {

		System.out.println(20 / 0);// RTE deðil RunTimeException

		// String str="asd; //CTE DÝR...çift týrnak eksiikliði"
		// bu tur hatalardan kaynaklanan hatalar kolay düxltilir

		
		//java a error dendiðinde onune geçilemeyen kod ile çözülemeyen sistemden kaynaklý buyuk hatalar kastedilir
		//errorlar unchecked dir ve java bunlarý on göremezx  v egerçekleþtiðinde kodun çalýþmasý durduruluri sistem çöker
		
		for (int i = 0; i < args.length; i++) {
			
			
		}
		
		
		/*
		* Garbage Collector : Garbage Collecto heap alaninda calisan ve heap alaninda new operatoru vb. methodlarla olusturulan ve referansi olmayan
        * nesneleri heap alanindan temizleyen mekanizmanin adidir. Garbage Collector islimini 3 adimda tamamlar.
        * 1) Isaretle : Kullanilan ve kullanilmayan nesneler isaretlenir.
        * 2) Silme : Referans olmayan nesneleri heap alanindan temizler.
        * 3) Sýkýþtýrma ve Silme : Silme islemine ek olarak daha buyuk nesnelere bos alan olusturmak icin kalan nesneleri bir araya getirir.
        * 
        */
	}

}
