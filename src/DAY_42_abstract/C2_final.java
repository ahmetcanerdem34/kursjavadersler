package DAY_42_abstract;

public class C2_final extends C1_final{

	public static void main(String[] args) {
		
		System.out.println(C1_final.SAY�);//10
		//static bier variable okul ismi gibi herkes i�in ayn�d�r
		
		//c1_final.sayi+=20;--->sayi variable si final olarak tan�mland��� i�in de�i�tirelemez

		
		C2_final obj1 = new C2_final();
		obj1.deneme();
	}

	public void deneme() {//bu klas� c1 in child� extend ile yapt�k ve overriding yap�yoruz 
		System.out.println("child klasdaki overriding method");
		
	}
	//public void deneme2() {//di�er clasta yani baba da bu method final ald��� i�in kullanam�yoruz
		//Cannot override the final method from c1_final
		
	//dolay�s�yla ba��nda final kelimesi belirteci olanlar inheritance olamazlar
		
	
	

}
