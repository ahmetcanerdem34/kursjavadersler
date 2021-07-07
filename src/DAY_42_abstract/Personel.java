package DAY_42_abstract;

public abstract class Personel {

	
		
		//bir clasý abstract yapmak için class keywordunden ance 
		//abctract yazmak yeterlidir
		
		//abstruct bir classýn içinde varaible olabilir mi?
		//olabilir
		public String isim ="Yasin";
		
		//variable ler abstruct olur mu?
		//olmaz
		//public abstruct int sayi=10;
		
		//abstruct class ýn tum concrete child larý abstruct class daki tum dinamic özellikleri yani methodlaarý
		//ovrride etmek zorundadýr
		
		//bir method abstruct olur mu ve nasýl yapýlýr?
		public abstract void maasHesapla();
		public abstract void mesaiHesapla();
		
		//bir abstruc class da concrete method yazýlabilir mi?
		//bir abstruct class ta abstruct ve concrete methodlar olabilir
		//concrete child class lar abstruct class larý override etmek zorundadýr ama
		//concrete methodlarý override etmek isteye baðlýdýr
		public void ozelSigorta() {
			System.out.println("bu personel ozel sigorta kapsamýndadýr");
		}
		 /*
	       - Abstract class, genellikle ortak özellikleri olan nesneleri tek bir çatý altýnda toplamak için kullanýlýr.
	       - Tum child class’larda olmasini istedigimiz dinamik ozellikleri (methods) abstract class’da abstract method olarak olustururuz.
	       - Abstract olmayan (concrete) tum child class’lar abstract method’lari override etmek zorundadir. 
	        Boylece tum child class’lar ayni dinamik ozelliklere (methods) sahip olurlar.
	        
	       - Abstract class nasil olusturulur ? Abstract class olusturmak icin class keyword’unden once abstract keyword’u yazilmalidir.
	        public abstract class Personel {
	     }
	       - Abstract method nasil olusturulur ? Abstract method olusturmak icin abstract keyword’u yazilmalidir. 
	       - Abstract method’un body’si OLMAZ (No implementation), body olusturursaniz CTE olusur.
	       - Abstract method private, final veya static olarak tanimlanamaz.
	        public abstract void maasHesapla();
	        
	       Not : Bir abstract class, abstract veya concrete method’lara sahip olabilir.
	       Not : Concrete class icinde Abstract method OLUSTURULAMAZ
	       
	       Kural 1) Concrete bir child class, parent’i olan abstract class’lardaki tum abstract method’lari implement etmelidir, diger turlu CTE olusur.
	       Kural 2) Abstract method’lari implement etmek icin oncelikle overriding yapilmalidir.
	       Kural 3) Abstract class, abstract olmayan (concrete) method’lara da sahip olabilir. Cocrete method’lar implement edilmek ZORUNDA DEGILDIR. 
	         Parent-child iliskisi ile kullanilabilirler veya istenirse override edilebilirler.
	       Kural 4) Abstract bir child class, parent’i olan abstract class’lardaki method’lari implement etmek ZORUNDA DEGILDIR. 
	         Parent-child iliskisi ile tum method’lara ulasabilir.
	       Kural 5) Abstract class’lar somutlastirilamaz (can not be instantiated) yani abstract class’larda obje olusturulamaz.
	       Kural 6) Abstract class’lar private veya final olarak tanimlanamaz.
	       
	       Not : Bir abstract class, abstract veya concrete method’lara sahip olabilir.
	       Not : Concrete class icinde Abstract method OLUSTURULAMAZ
	     
	     
	     */
		


}
