package DAY_12_İndexOf;

public class C1_EqualsEsitEsitFarki {

	public static void main(String[] args) {


		String str1="Ali Can";
		String str2=str1 + "";//Ali Can
		System.out.println(str1==str2);//false---->//== eşit eşit hem stringe bakar, hemde adrese bakar
		System.out.println(str1.equals(str2));//true---->	//equals sadece stringe bakar
		
		/*
		 * false
		 * true
		 */
		//neden böyle oldu ild dersin ilk konusu referenco of objects konusu
		
		//java da 2 hafıza vardır stack küçük---->nesleri tutar= primitive
		// heap büyük
		
		//== eşit eşit hem stringe bakar, hemde adrese bakar
		//equals sadece stringe bakar
		//str1 ile str2 yi == karşılaştırısak değerler aynı fakat adresleri farklı ollduğu için false dönder
		
		
		String str3="Ali Can";
		str3=str1;
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		

	}

}
