package DAY_42_abstract;

public class C2_final extends C1_final{

	public static void main(String[] args) {
		
		System.out.println(C1_final.SAYÝ);//10
		//static bier variable okul ismi gibi herkes için aynýdýr
		
		//c1_final.sayi+=20;--->sayi variable si final olarak tanýmlandýðý için deðiþtirelemez

		
		C2_final obj1 = new C2_final();
		obj1.deneme();
	}

	public void deneme() {//bu klasý c1 in childý extend ile yaptýk ve overriding yapýyoruz 
		System.out.println("child klasdaki overriding method");
		
	}
	//public void deneme2() {//diðer clasta yani baba da bu method final aldýðý için kullanamýyoruz
		//Cannot override the final method from c1_final
		
	//dolayýsýyla baþýnda final kelimesi belirteci olanlar inheritance olamazlar
		
	
	

}
