package DAY_41_eror;

public class Errors {

	public static void main(String[] args) {

		System.out.println(20 / 0);// RTE de�il RunTimeException

		// String str="asd; //CTE D�R...�ift t�rnak eksiikli�i"
		// bu tur hatalardan kaynaklanan hatalar kolay d�xltilir

		
		//java a error dendi�inde onune ge�ilemeyen kod ile ��z�lemeyen sistemden kaynakl� buyuk hatalar kastedilir
		//errorlar unchecked dir ve java bunlar� on g�remezx  v eger�ekle�ti�inde kodun �al��mas� durduruluri sistem ��ker
		
		for (int i = 0; i < args.length; i++) {
			
			
		}
		
		
		/*
		* Garbage Collector : Garbage Collecto heap alaninda calisan ve heap alaninda new operatoru vb. methodlarla olusturulan ve referansi olmayan
        * nesneleri heap alanindan temizleyen mekanizmanin adidir. Garbage Collector islimini 3 adimda tamamlar.
        * 1) Isaretle : Kullanilan ve kullanilmayan nesneler isaretlenir.
        * 2) Silme : Referans olmayan nesneleri heap alanindan temizler.
        * 3) S�k��t�rma ve Silme : Silme islemine ek olarak daha buyuk nesnelere bos alan olusturmak icin kalan nesneleri bir araya getirir.
        * 
        */
	}

}
