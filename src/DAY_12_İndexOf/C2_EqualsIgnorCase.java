package DAY_12_�ndexOf;

public class C2_EqualsIgnorCase {

	public static void main(String[] args) {
		
		
		//equalsIgnoreCase() methodu--->kar��la�t�rd��� stringlere case sensetive duyarl�l��� olmaks�z�n bakar
		//string ler ayn� ise true, ayn� de�ilse false d�ner.
		
		String str1="Ali Can";
		String str2="ali CAN";
		String str3="Ali can ";//burda bo�luk olmas� bir karakterdir, false verir
		
		System.out.println(str1.equals(str2));//false verir
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		/*
		 * false
		 * true
		 */
		
		System.out.println(str1.equals(str3));//false
		System.out.println(str1.equalsIgnoreCase(str3));//false, ��nk� sonras�nda bo�luk var
		/*
		 * false
		 * false
		 */
		

	}

}
