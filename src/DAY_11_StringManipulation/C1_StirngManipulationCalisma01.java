package DAY_11_StringManipulation;

public class C1_StirngManipulationCalisma01 {

	public static void main(String[] args) {
		
		//isEmpty methodu=false true sonucu dönderir
		
		String str1="bugün hava güneþli";
		System.out.println(str1.isEmpty());//false
		
		System.out.println("********************");
		String str2="";
		System.out.println(str2.isEmpty());//true
		
		System.out.println("**********************");
		String str3=" ";
		System.out.println(str3.isEmpty());//false
		
		System.out.println("******************************");
		//charAt: 
		//istenen noktadaki karakteri verir
        //karakterlerin sýrasý 0 (sýfýr) dan baþlar buna index denir
		
		String str4="Merhaba dünya";
		System.out.println(str4.charAt(0));//M
		System.out.println(str4.charAt(str4.length()-1));//a
		
		System.out.println(str4.charAt(0)+str4.charAt(1));//178-buradaa ise 0=M ve 1=e deðerlerinin acsii lerini verir ve + ile onlarý toplar
		
		
		
	}

}
