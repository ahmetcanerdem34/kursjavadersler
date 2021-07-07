package DAY_14_metodCreation;

public class C1_MedotCreation {

	public static void main(String[] args) {
		
		//bir methodu main methodu içerisinden çaðýrmak için mutlaka static kelimesini kullanmalýyýz
		//methodun pamantezleri içerisindekilere parametre denir
		//method call un parantezi içerisindekilere de argument denir
		
		String str="java çok güzel";
		
		//java metodlarýn sadece ismine deði, isim + parametreye de  bakar
		//sadece parametre sayisi deðil parametrelerin data tiplerinede bakar
		
		
		str.endsWith("el");
		//1-bu metodun görevi gidip kelimenin son kýsmýný kontrol etmek
		//bu metodu kullanmak için, bu metodun kontrol ettiktensonra bana rapor olarak ne getirdiðini bilmem lazým(true/fasle)
		
		//2- bir method oluþtruduðumuzda metodun ne yapacaðýna ve görevi yaptýktan sonra bana ne döndüreceðine bastan karar vermeliyiz
		//3- bir metod oluþturulurken burdaki gibi---> //str.indexOf("String str", int fromIndex); 
		//dýþarýdan kabul edeceði parametreleri ve bu parametrelerin data tiplerini declare etmeliyiz
		
		// metodu çalýþtýrmak istediðimizde (metod u çaðýrmak) parametre olarak declare edilen data tiplerine uygun deðeri girmeliyiz
		//girilen bu deðerlere ARGUMENT denir(arguman)
		
		
		str.indexOf("va", 1);//

	}

}
