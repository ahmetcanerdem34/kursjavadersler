package DAY_13_ContainsReplace;

public class C3_StartsAnd�sEmpty {

	public static void main(String[] args) {

      
		String str="herg�n java olsa";
		
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
		
		String str3=null;//nal bir de�er de�ildir--->sadece str3 �n hi�bir �ey ifade etmedi�ini s�yler.POINTER d�r
		System.out.println(str3.isEmpty());//RTE verir


	}

}
