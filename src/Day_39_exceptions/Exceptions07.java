package Day_39_exceptions;

public class Exceptions07 {

	public static void main(String[] args) {
		
		//data t�rlerini casting yaparken uygun olmayan i�lem yaparsan�z
		//java classcastexception verir
		
		//e�er tamamen say�lardan olu�mayan bir stringi int a cevirmeye cal���rsan�z java numberformatexception verir
		
		int sayi=10;
		//String str=sayi;//CTE
		
		String str="123456";
		
		System.out.println(str+10);//12345610
		
		int strSayi=Integer.parseInt(str);//string i int e �evirdim
		
		System.out.println(strSayi+10);//123466
		
		String str2="123a45";
		//System.out.println(Integer.parseInt(str2));//NumberFormatException--->aradaki a y� java alg�layamd�, b�yle bir �eyi number a �eviremezsin dedi
	
		
		Object sayi2=40;
		String sayiStr=(String)sayi2;//Explicit narrowing casting
									//ClassCastException---> bu hatay� veiryor
	}

}
