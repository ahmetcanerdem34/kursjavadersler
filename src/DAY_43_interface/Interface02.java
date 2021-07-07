package DAY_43_interface;

public interface Interface02 {
	
	//buradaki default ve static bizim bildiðimiz default ve static mi--->
	//HAYIR
	
	public default void deneme() {
	System.out.println("default keyword lu method çaýlýþtý");	
		
	}
	
	//bizim bildiðimiz default acces modifier dý
			//bir methodda birden fazla modifier olur mu?OLMAZ BÖYLE BÝÞEY OLABÝLÝR MÝ
			//bizim interface de oluþturduðumuz tum methodlar publictir
			//interface de defoult keyword kullanarak concrete method oluþturabiliriz.
			//bburadaki default keywordu acces modifier degil javanýn özel bir çözümüdür
	//buradaki keyword baþýna yazýdýðý methodun concrete olduðunu belirtir
	
	public static void deneme2() {
		System.out.println("static keywordu lu method çalýþýr");
		
		//yukarýda  default keywordu için yazdýklarýmýz static için de geçerlidir
		//static ve defauld keywordu kullanarak oluþturduðumuz methodlar override edilmek zorunda deðil 
	}
}
