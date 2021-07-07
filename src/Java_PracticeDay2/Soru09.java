package Java_PracticeDay2;

public class Soru09 {

	public static void main(String[] args) {
		/*
	
		 Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
		 * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
		 * olsun
		 */
		
		
		int fiyat=25;
		
		String sonuc=(fiyat>1 && fiyat<10 ? fiyat >10 && fiyat<20 ? "ucuz" : "normal" : "pahalı");
		
		String sonu=(fiyat>1 && fiyat<10) ? "ucuz" : fiyat<20 ? "normal" : "pahalı";
		
		System.out.println(sonuc);
		System.out.println(sonu);
//		pahalı
//		pahalı

		
	}

}
