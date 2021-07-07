package Day_39_exceptions;

public class Exceptions05 {

	public static void main(String[] args) {
		
		
		//null olarak tanýmlanmýþ bir obje ile uygun olmayan bir iþlem yapmaya çalýþtýðýmýzda
		//java NullPointerException verir
		//unchecked exception dýr yani rte
		
		String str1=" ";
		String str2="";
		String str3=null;//null bir deðer deðildir, sadece str3 un hiçbir þeye eþit olmadýðýný
						//söyleyen bir iþaretçidir(pointer)
		
		System.out.println(str1.length());//1
		System.out.println(str2.length());//0
		System.out.println(str3.length());//NullPointerException:
		
		System.out.println(str3+"boþ");
		System.out.println(str3.concat("boþ"));//hata verir
		

	}

}
