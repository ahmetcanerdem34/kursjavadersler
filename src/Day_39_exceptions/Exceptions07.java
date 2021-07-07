package Day_39_exceptions;

public class Exceptions07 {

	public static void main(String[] args) {
		
		//data türlerini casting yaparken uygun olmayan işlem yaparsanız
		//java classcastexception verir
		
		//eğer tamamen sayılardan oluşmayan bir stringi int a cevirmeye calışırsanız java numberformatexception verir
		
		int sayi=10;
		//String str=sayi;//CTE
		
		String str="123456";
		
		System.out.println(str+10);//12345610
		
		int strSayi=Integer.parseInt(str);//string i int e çevirdim
		
		System.out.println(strSayi+10);//123466
		
		String str2="123a45";
		//System.out.println(Integer.parseInt(str2));//NumberFormatException--->aradaki a yı java algılayamdı, böyle bir şeyi number a çeviremezsin dedi
	
		
		Object sayi2=40;
		String sayiStr=(String)sayi2;//Explicit narrowing casting
									//ClassCastException---> bu hatayı veiryor
	}

}
