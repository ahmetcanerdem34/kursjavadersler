package DAY_13_ContainsReplace;

public class C3_StartsAndÝsEmpty {

	public static void main(String[] args) {

      
		String str="hergün java olsa";
		
		System.out.println(str.startsWith("H"));//true
		
		System.out.println(str.startsWith("Her "));//false
		
		System.out.println(str.startsWith("g", 4));//false
		
		System.out.println(str.startsWith("java", 7));//false
//		false
//		false
//		false
//		true
		System.out.println("*********************************");
		
		System.out.println(str.isEmpty());//false
		
		String str2="";
		
		System.out.println(str2.isEmpty());//true
		
		String str3=null;//nal bir deðer deðildir--->sadece str3 ün hiçbir þey ifade etmediðini söyler.POINTER dýr
		System.out.println(str3.isEmpty());//RTE verir


	}

}
