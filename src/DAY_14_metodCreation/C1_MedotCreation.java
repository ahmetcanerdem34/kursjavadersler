package DAY_14_metodCreation;

public class C1_MedotCreation {

	public static void main(String[] args) {
		
		//bir methodu main methodu i�erisinden �a��rmak i�in mutlaka static kelimesini kullanmal�y�z
		//methodun pamantezleri i�erisindekilere parametre denir
		//method call un parantezi i�erisindekilere de argument denir
		
		String str="java �ok g�zel";
		
		//java metodlar�n sadece ismine de�i, isim + parametreye de  bakar
		//sadece parametre sayisi de�il parametrelerin data tiplerinede bakar
		
		
		str.endsWith("el");
		//1-bu metodun g�revi gidip kelimenin son k�sm�n� kontrol etmek
		//bu metodu kullanmak i�in, bu metodun kontrol ettiktensonra bana rapor olarak ne getirdi�ini bilmem laz�m(true/fasle)
		
		//2- bir method olu�trudu�umuzda metodun ne yapaca��na ve g�revi yapt�ktan sonra bana ne d�nd�rece�ine bastan karar vermeliyiz
		//3- bir metod olu�turulurken burdaki gibi---> //str.indexOf("String str", int fromIndex); 
		//d��ar�dan kabul edece�i parametreleri ve bu parametrelerin data tiplerini declare etmeliyiz
		
		// metodu �al��t�rmak istedi�imizde (metod u �a��rmak) parametre olarak declare edilen data tiplerine uygun de�eri girmeliyiz
		//girilen bu de�erlere ARGUMENT denir(arguman)
		
		
		str.indexOf("va", 1);//

	}

}
