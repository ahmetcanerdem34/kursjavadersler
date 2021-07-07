package DAY_33_encopsulation;

public class E01 {
	
	//BU CLASS TA AGE VE NAME ÝN GET VE DET LERÝ OLDUÐU ÝÇÝN FUL ENCAPSULATÝON CLASS DÝYEBÝLÝRÝZ
	
	/*
	 -Encapsulation kýsaca Data Hidding(veri saklama) demek
	 -baþarýlý bir encapsulation aþaðýdaki özelleiklere sahiptir
	 a- nasýl kullanýlaaðý belli olmalý
	 b- kodun karmaþýklýðý kullanýmýn karþamaþýklýðýna sebep olmalmalý
	 -kodlardan oluþan bir yapý basit bir þekilde kullanýlabilmeli
	 c-bir bölümün boýzaulmasý baþka bölümlerin bozxulmasýna sebep olmamalý
	 
	 **Encapsulation nasýl yapýlýr
	 *a- accec modifierleri "private" olarak kullanýýrýz
	 *b-getter ve setter methodlarý ile  encapsulatied datalara ulaþabilir 
	 *okuyabiliriz(getter), deðiþtirebiliriz(setter)
	 
	 1) SORU= encapsulation nedir= Data Hidding demektir
	 
	 2) SORU=encapsulatiounasýl kullanacaksýn? private acces modifier kullanarak yapacaðým
	 	SORU= private acces modifier kullanýnca diðer class lardan buraya ulaþamazsýn ki nasýl yapacaksýn
	 	CEVAP= getter methodlarla ulaþýrým
	 		   setter methodlarla deðiþiklik yaparým
	 		   
	 SORU= ENCAPSULATÝONUN FAYDALARI
	 1-esneklik flexbility= diðer clastan setAge ile bu clasdaki yaþý ve ismi setName ile deðiþtirdik
	 2-getter ve setter methodunu bir kere oluþturduktan sonra proje içindeki class larda istersen 1000 kere kullan = reusebility
	 3-istediðiniz dat yý okunabþlir, istediðiniz datayý okunamaz hale getirebilirsiniz
	 4-okunmasý için getter methodu oluþturu, okunmasýný istemiyorsan getter methodu oluþturma
	 5-geName yi koyarsam okurlar, set koymazsam deðiþtiremezler
	 
	 SORU: þöyle bir class oluþtursam tum variable ler private ve sadece getter() methodu oluþturdum= bu class için ne deriz
	  CEVAP= valuablenýn deðerlerini okurum ama deðiþtremem, okulda öðrencilernin ismini görebilirsin ama deðiþtiremezsin
	        -bu tarz class lara Inmutable class denir= deðiþtirilemez
	        
	  6- Encapsulation kullanýcnýn arksýnda kullandýðý karmaþýk yapýyý kullanýcýyua göstermez ve kullanýcý iþini daha rahat yapar
	  
	       **bir class da tum variable ler private ise ve tum getter() ve setter() lardan oluþuyorsa 
	       ** bu class a Full Encapsulation denir
	  
	  !!!getter() ve setter() methodlarýna ayný zamanda "Java Beans" fasulye taneleri de denir
	       
	  *
	 */
	
	//þuaraya valuable oluþturalým
	
	private int age=25;//bu veri encapsulation mý? HAYIR baþýnda private yok koyalým(encapsulatied) olsun
	private String name="Ali";
	
	//GETTER oluþturalým
	//getter nasýl oluþturcaðýz getter()
	//getter method oluþturuken baþýnda public olmalý 
	//baþta acces modifier public le beraber return taypý int se public get kýsýmda da ayný olmalý
	//String se string olmalý return typ ý
	//getAge = ayý buyuk yaptým= camel case meselesi
	//sonra method parantezi kouyuruz sonra
	//körly birds
	//döndersin diye return type yazýyoruz
	//ne döndürecek int in yanýnda age var valuable olarak yaþ
	//name getter ýnýda siz yapýn
	
	public int getAge() {//her zemanget yazýyoruz
		return age;
	}
	
	
	public String getName() {//get her zaman olmalý
		return name;
	}
	
	//SETTER() oluþturalým
	//acces modifier public olacak herzaman getter daki gibi
	//return type void olacak
	//düzelmek istedðimis deðiþkenin adýný set in yanýna yazýyoruz
	//() parantez içinede int age i yazýyoruz yani parametreli olacak
	//sonra da method badinin{} içine this.age yazacaðýz ve 
	//bu class taki ahe deðeri
	
	public void setAge(int age) {//kullanýrken burayý 33 yaptýðýmýzda,
		this.age= age;           //bu kahverengi age e verilen deðeri akttaki this age deki kahverengiye atayacak
								 //oda this. age deki mavi age o deðeri vermiþ olacak
		//setter methodunda istisnasý olmayan þudur
		//void olacak
		//parantez içinde parametre olacak
		//{} method body içinde de tis. kýsmý ve devamý olacak
		//2 side kahverengi oldu
		
	}
	//niçin void= Java ya ,ilk baþladýðýmýzda demþtimki;
	//bir method consola sadece yazý yazdýrdýðýnda return type ý void olur
	//bir method sacece action yapýyorsa(bir tuþa týklamak gibi)  return typý void olur
	//set de burda bir actoion yaptýðý iöçin return typý void olur
	public void setName(String name) {
		this.name=name;
	}
	
	
	
	
	
	
	
}
