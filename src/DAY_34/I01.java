package DAY_34;

public class I01 {

	public static void main(String[] args) {
		
		//Inheritance miras demek
		//java da parent(aile)- child(�ocuk) relationship vard�r
		//Parent Class a super class da denir
		//child class a sub-class da denir
		//parent child relationship reusalibity, maintanence, less code(az kod) well organisation faydalar�d�r
		//ayn� �ey babadan o�ula ge�me gibi java da d avar
		//application yap�lmadan �nce structure si �izilir
		//inheritance methodunun faydas� ne, olu�turulan bir method istedi�in kadar kullan�rs�n
		//app de bir methodun her defas�nda yazmak istesek binlerce yazmak gerekir
		//inheritance buna fayda sa�lar
		//bir methodu d�zeltince kulland���n yerdekilerin hepsi d�zelir, binlerce olsa nas�l update edeceksin
		//ortak �zellikler parent a konur, hareket geneldir parent tedir=miyavlama child olan kedide, havlama child olan k�pektedir
		//child class lar parentlardaki her methodu ve valiable yi kullanabilir
		//ama parent class child lardakini kullanamz, miras ters tarafl� i�liyor
		
		//�nemli java da �oklu paraent yoktur, bir �ocu�un 2 babas� yada ailesi gib bir durum yoktur
		//�oklu parent �n ingilizcesi multiple inheritance denir
		//normal inheri�tance sistemine 1 parent class 1 den fazla child class sistemine "hierarchical inheritance denir
		
		//chil patrent-grandparent seklinde olu�turulan cok katl�
		//parent child relationship e multi-level inheritance denir
		
		//Object class butun class lar�n parent class �d�r
		//java da parent clas� olmayan tek class object clas d�r
		
		//olu�turdu�umuz her class �n bir default constructor � vard�r, 
		//nerdedir, en �st seviye olaan object clas�n i�ine java koymu�tur gider childlar oradan default al�r kullan�r
		//runner clas�nda a1, m1, d1, c1 gibi objeler olu�turuken sa�a obje sol k�s�mlara default constructorlar�n� koyuyyoruz
		
		//kendi construct�r�m�z� kendimizde olu�turabiliriz 
		//animal clas�na gidip en �stte public Animal(){ yaparak olu�turabiliriz mesela
		//peki contructor � methodlardan ayy�ran nedir
		//1- methodlarda return type olur, constructor larda olmaz
		//2- constructar lar�n ismi class ismi ile ayn� olmal�d�r, methodlar i�in �yle bir zorunluluk yok, istersen methodun ismini classla ayn�o yapars�n, ister farkl�

	}

}
