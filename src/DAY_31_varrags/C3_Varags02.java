package DAY_31_varrags;

public class C3_Varags02 {

	public static void main(String[] args) {//burdaki args varags tan geliyor
		
		
		//istediðimiz kadar sayýyý giediðimizde tum sayýlarý toplayan bir method yazalým
		//Var--- variety çeþitlilik args--- arguments
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,34,544,3,5,4,-54);
		

	}

	public static void toplama(int ...var) {//bu þekilde yapýnca yukarýsý istediðiniz kadar yazabilirsiniz(...) önemli olan üç nokta
		//data turunden sonra yazdýðýmýz üç nokta ..varags kullanacaðýmýz java tarafýndan anlaþýlýr
		//(ama sadece yukarda ayný iþlem içinler geçerli, toplama
		//for each te bunu görebiliriz
		
		int toplam=0;
		for (int each : var) {//var a git her bir intiger ý getir
			
			toplam+=each;//deðiþkenimiz j
			//for loop bittiði yerde toplamý yazdýr
		}
		System.out.println("toplam :" +toplam);
		//gitti yukarda topladý
		//hesap makinesinde filan yaygýn kullanýlýr
		
//		toplam :7
//		toplam :30
//		toplam :25
//		toplam :541
	}

}
