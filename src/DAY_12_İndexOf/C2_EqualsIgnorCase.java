package DAY_12_ÝndexOf;

public class C2_EqualsIgnorCase {

	public static void main(String[] args) {
		
		
		//equalsIgnoreCase() methodu--->karþýlaþtýrdýðý stringlere case sensetive duyarlýlýðý olmaksýzýn bakar
		//string ler ayný ise true, ayný deðilse false döner.
		
		String str1="Ali Can";
		String str2="ali CAN";
		String str3="Ali can ";//burda boþluk olmasý bir karakterdir, false verir
		
		System.out.println(str1.equals(str2));//false verir
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		/*
		 * false
		 * true
		 */
		
		System.out.println(str1.equals(str3));//false
		System.out.println(str1.equalsIgnoreCase(str3));//false, çünkü sonrasýnda boþluk var
		/*
		 * false
		 * false
		 */
		

	}

}
