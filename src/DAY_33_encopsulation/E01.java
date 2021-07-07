package DAY_33_encopsulation;

public class E01 {
	
	//BU CLASS TA AGE VE NAME �N GET VE DET LER� OLDU�U ���N FUL ENCAPSULAT�ON CLASS D�YEB�L�R�Z
	
	/*
	 -Encapsulation k�saca Data Hidding(veri saklama) demek
	 -ba�ar�l� bir encapsulation a�a��daki �zelleiklere sahiptir
	 a- nas�l kullan�laa�� belli olmal�
	 b- kodun karma��kl��� kullan�m�n kar�ama��kl���na sebep olmalmal�
	 -kodlardan olu�an bir yap� basit bir �ekilde kullan�labilmeli
	 c-bir b�l�m�n bo�zaulmas� ba�ka b�l�mlerin bozxulmas�na sebep olmamal�
	 
	 **Encapsulation nas�l yap�l�r
	 *a- accec modifierleri "private" olarak kullan��r�z
	 *b-getter ve setter methodlar� ile  encapsulatied datalara ula�abilir 
	 *okuyabiliriz(getter), de�i�tirebiliriz(setter)
	 
	 1) SORU= encapsulation nedir= Data Hidding demektir
	 
	 2) SORU=encapsulatiounas�l kullanacaks�n? private acces modifier kullanarak yapaca��m
	 	SORU= private acces modifier kullan�nca di�er class lardan buraya ula�amazs�n ki nas�l yapacaks�n
	 	CEVAP= getter methodlarla ula��r�m
	 		   setter methodlarla de�i�iklik yapar�m
	 		   
	 SORU= ENCAPSULAT�ONUN FAYDALARI
	 1-esneklik flexbility= di�er clastan setAge ile bu clasdaki ya�� ve ismi setName ile de�i�tirdik
	 2-getter ve setter methodunu bir kere olu�turduktan sonra proje i�indeki class larda istersen 1000 kere kullan = reusebility
	 3-istedi�iniz dat y� okunab�lir, istedi�iniz datay� okunamaz hale getirebilirsiniz
	 4-okunmas� i�in getter methodu olu�turu, okunmas�n� istemiyorsan getter methodu olu�turma
	 5-geName yi koyarsam okurlar, set koymazsam de�i�tiremezler
	 
	 SORU: ��yle bir class olu�tursam tum variable ler private ve sadece getter() methodu olu�turdum= bu class i�in ne deriz
	  CEVAP= valuablen�n de�erlerini okurum ama de�i�tremem, okulda ��rencilernin ismini g�rebilirsin ama de�i�tiremezsin
	        -bu tarz class lara Inmutable class denir= de�i�tirilemez
	        
	  6- Encapsulation kullan�cn�n arks�nda kulland��� karma��k yap�y� kullan�c�yua g�stermez ve kullan�c� i�ini daha rahat yapar
	  
	       **bir class da tum variable ler private ise ve tum getter() ve setter() lardan olu�uyorsa 
	       ** bu class a Full Encapsulation denir
	  
	  !!!getter() ve setter() methodlar�na ayn� zamanda "Java Beans" fasulye taneleri de denir
	       
	  *
	 */
	
	//�uaraya valuable olu�tural�m
	
	private int age=25;//bu veri encapsulation m�? HAYIR ba��nda private yok koyal�m(encapsulatied) olsun
	private String name="Ali";
	
	//GETTER olu�tural�m
	//getter nas�l olu�turca��z getter()
	//getter method olu�turuken ba��nda public olmal� 
	//ba�ta acces modifier public le beraber return tayp� int se public get k�s�mda da ayn� olmal�
	//String se string olmal� return typ �
	//getAge = ay� buyuk yapt�m= camel case meselesi
	//sonra method parantezi kouyuruz sonra
	//k�rly birds
	//d�ndersin diye return type yaz�yoruz
	//ne d�nd�recek int in yan�nda age var valuable olarak ya�
	//name getter �n�da siz yap�n
	
	public int getAge() {//her zemanget yaz�yoruz
		return age;
	}
	
	
	public String getName() {//get her zaman olmal�
		return name;
	}
	
	//SETTER() olu�tural�m
	//acces modifier public olacak herzaman getter daki gibi
	//return type void olacak
	//d�zelmek isted�imis de�i�kenin ad�n� set in yan�na yaz�yoruz
	//() parantez i�inede int age i yaz�yoruz yani parametreli olacak
	//sonra da method badinin{} i�ine this.age yazaca��z ve 
	//bu class taki ahe de�eri
	
	public void setAge(int age) {//kullan�rken buray� 33 yapt���m�zda,
		this.age= age;           //bu kahverengi age e verilen de�eri akttaki this age deki kahverengiye atayacak
								 //oda this. age deki mavi age o de�eri vermi� olacak
		//setter methodunda istisnas� olmayan �udur
		//void olacak
		//parantez i�inde parametre olacak
		//{} method body i�inde de tis. k�sm� ve devam� olacak
		//2 side kahverengi oldu
		
	}
	//ni�in void= Java ya ,ilk ba�lad���m�zda dem�timki;
	//bir method consola sadece yaz� yazd�rd���nda return type � void olur
	//bir method sacece action yap�yorsa(bir tu�a t�klamak gibi)  return typ� void olur
	//set de burda bir actoion yapt��� i��in return typ� void olur
	public void setName(String name) {
		this.name=name;
	}
	
	
	
	
	
	
	
}
