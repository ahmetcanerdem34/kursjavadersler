package DAY_49_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map_02 {

	public static void main(String[] args) {
		
	       // Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini 
        // return eden bir method yaziniz
        //  Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3 
        
        
        String input="Hellooo";
        Map<String,Integer> methoddanGelenMap = harfSayisiBul(input);
        
        
        System.out.println(methoddanGelenMap);
        
        
    }
    public static Map<String, Integer> harfSayisiBul(String input) {
        
        String harfler[] = input.split("");
        System.out.println(Arrays.toString(harfler));
        Map<String,Integer> harfKullanimSayisi=new HashMap<>();
        
        for (String each : harfler) {
            
            if (!harfKullanimSayisi.containsKey(each)) {
                
                harfKullanimSayisi.put(each, 1);
            }else {
                
                harfKullanimSayisi.put(each, harfKullanimSayisi.get(each) + 1 );
                
            }       
        }
        
        return harfKullanimSayisi;
	/*
	 * Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz
	 * Input : Hellooo output H=l, e=1, l=2, o=3	
	
		
		
		String input="Hellooo";
		
		Map<String, Integer> methoddanGelenMap= harfSayisiBul(input);//burasý method method call oluþturduk soru öyle isdi, parametre ýnput
			              //method bize ne döndürdü	//methoda ýnput ne gönderdik-- arkada ne yazýyor
		System.out.println(methoddanGelenMap);
	}

	private static Map<String, Integer> harfSayisiBul(String input) {
		
		String harfler[]= input.split("");//String olan Hellooo yu array a çevirerek tek tek harfleri alýyoruz,hiçlikle bölebilirim
		System.out.println(Arrays.toString(harfler));//[H, e, l, l, o, o, o]
		
		//içine koyacaðýmýz map ide oluþturalým
		Map<String, Integer> harfKullanimSayisi = new HashMap<>();
		
		for (String each : harfler) {//her bir elemaný getririyortuz, each önce H yi getirecek add deðil map de put kullanýþlýr
			
			if(!harfKullanimSayisi.containsKey(each)) {//each ilk olarak H ona göre düþünelim, key olarak H yi içermiyorsa diyor burasý
															//içermiyorsa ekle
				harfKullanimSayisi.put(each, 1);//H ve 1 ekle, zaten map olduðu için araya = koyacak
				
				//içeriyorsa else iþler= buarsý 2.le için iþle çünkü yukarýsý içermiyorsa diyor
			}else {
				
				harfKullanimSayisi.put(each,harfKullanimSayisi.get(each+1) );//value için burasý 
													//burasý eski halinde o var mý anlamýnda, eski deðeri siler yenisini koyar
			}
		}
		
		return harfKullanimSayisi;
		
		 */
	}

}
