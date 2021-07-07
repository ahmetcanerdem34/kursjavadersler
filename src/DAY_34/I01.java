package DAY_34;

public class I01 {

	public static void main(String[] args) {
		
		//Inheritance miras demek
		//java da parent(aile)- child(çocuk) relationship vardýr
		//Parent Class a super class da denir
		//child class a sub-class da denir
		//parent child relationship reusalibity, maintanence, less code(az kod) well organisation faydalarýdýr
		//ayný þey babadan oðula geçme gibi java da d avar
		//application yapýlmadan önce structure si çizilir
		//inheritance methodunun faydasý ne, oluþturulan bir method istediðin kadar kullanýrsýn
		//app de bir methodun her defasýnda yazmak istesek binlerce yazmak gerekir
		//inheritance buna fayda saðlar
		//bir methodu düzeltince kullandýðýn yerdekilerin hepsi düzelir, binlerce olsa nasýl update edeceksin
		//ortak özellikler parent a konur, hareket geneldir parent tedir=miyavlama child olan kedide, havlama child olan köpektedir
		//child class lar parentlardaki her methodu ve valiable yi kullanabilir
		//ama parent class child lardakini kullanamz, miras ters taraflý iþliyor
		
		//önemli java da çoklu paraent yoktur, bir çocuðun 2 babasý yada ailesi gib bir durum yoktur
		//çoklu parent ýn ingilizcesi multiple inheritance denir
		//normal inheriþtance sistemine 1 parent class 1 den fazla child class sistemine "hierarchical inheritance denir
		
		//chil patrent-grandparent seklinde oluþturulan cok katlý
		//parent child relationship e multi-level inheritance denir
		
		//Object class butun class larýn parent class ýdýr
		//java da parent clasý olmayan tek class object clas dýr
		
		//oluþturduðumuz her class ýn bir default constructor ý vardýr, 
		//nerdedir, en üst seviye olaan object clasýn içine java koymuþtur gider childlar oradan default alýr kullanýr
		//runner clasýnda a1, m1, d1, c1 gibi objeler oluþturuken saða obje sol kýsýmlara default constructorlarýný koyuyyoruz
		
		//kendi constructýrýmýzý kendimizde oluþturabiliriz 
		//animal clasýna gidip en üstte public Animal(){ yaparak oluþturabiliriz mesela
		//peki contructor ý methodlardan ayyýran nedir
		//1- methodlarda return type olur, constructor larda olmaz
		//2- constructar larýn ismi class ismi ile ayný olmalýdýr, methodlar için öyle bir zorunluluk yok, istersen methodun ismini classla aynýo yaparsýn, ister farklý

	}

}
