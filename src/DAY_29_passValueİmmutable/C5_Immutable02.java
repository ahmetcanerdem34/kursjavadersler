package DAY_29_passValue�mmutable;

public class C5_Immutable02 {

	public static void main(String[] args) {
		
		
		//de�iikli�i kal�c� k�lmak i�in atama yaparsak �mmutable class lar nas�l davran�r
		
		
		//String IMMUTABLE D�R
		
		String isim="Ali";
		
		isim=isim+"";//isim art� hi� yapt�k
		
		System.out.println(isim.equals("Ali"));
		System.out.println(isim=="Ali");
//		true
//		false
		
		
		String str1= new String("Mehmet");//string obje olu�turdum i�ine mehmet koydum java kabul etti
		String str2=new String("Mehmet");
		
		System.out.println(str1==str2);//false
		System.out.println(str1.equals(str2));//true
		
		
		
		String str3="Mehmet";
		String str4="Mehmet";
		
		System.out.println(str3==str4);//true---> obje olu�turulurken new keyword u kulland���m�zda 
		System.out.println(str3.equals(str4));//true
		
		/*
		 String str1 = new String("Mehmet"); // String bir obje oldugu icin new keyword'unu kullanabiliyorum cunku obje olusturuyorum
        String str2 = new String("Mehmet"); // new keyword oldugu icin once objeyi olusturur o yuzden referanslari farkli olur
        
        System.out.println(str1.equals(str2)); // True 
        System.out.println(str1==str2); // False 18.satirdaki aciklamadan dolayi false
        
        String str3 = "Mehmet"; // str3'u olusturduk. sonra str4'u olusturdugumuzda java diyorda str3'de aynisi var bir daha neden olusturayim
        String str4 = "Mehmet"; // diyor ve str4'un referansini str3'e atayip hafiza tasarrufu yapiyor .(String havuzunda ki ayni objeye atiyor)
		 */
		
	}

}
