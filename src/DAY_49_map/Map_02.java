package DAY_49_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map_02 {

	public static void main(String[] args) {
		
	       // Verilen bir String�deki harfleri ve harflerin kacar kez kullanildigini 
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
	 * Verilen bir String�deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz
	 * Input : Hellooo output H=l, e=1, l=2, o=3	
	
		
		
		String input="Hellooo";
		
		Map<String, Integer> methoddanGelenMap= harfSayisiBul(input);//buras� method method call olu�turduk soru �yle isdi, parametre �nput
			              //method bize ne d�nd�rd�	//methoda �nput ne g�nderdik-- arkada ne yaz�yor
		System.out.println(methoddanGelenMap);
	}

	private static Map<String, Integer> harfSayisiBul(String input) {
		
		String harfler[]= input.split("");//String olan Hellooo yu array a �evirerek tek tek harfleri al�yoruz,hi�likle b�lebilirim
		System.out.println(Arrays.toString(harfler));//[H, e, l, l, o, o, o]
		
		//i�ine koyaca��m�z map ide olu�tural�m
		Map<String, Integer> harfKullanimSayisi = new HashMap<>();
		
		for (String each : harfler) {//her bir eleman� getririyortuz, each �nce H yi getirecek add de�il map de put kullan��l�r
			
			if(!harfKullanimSayisi.containsKey(each)) {//each ilk olarak H ona g�re d���nelim, key olarak H yi i�ermiyorsa diyor buras�
															//i�ermiyorsa ekle
				harfKullanimSayisi.put(each, 1);//H ve 1 ekle, zaten map oldu�u i�in araya = koyacak
				
				//i�eriyorsa else i�ler= buars� 2.le i�in i�le ��nk� yukar�s� i�ermiyorsa diyor
			}else {
				
				harfKullanimSayisi.put(each,harfKullanimSayisi.get(each+1) );//value i�in buras� 
													//buras� eski halinde o var m� anlam�nda, eski de�eri siler yenisini koyar
			}
		}
		
		return harfKullanimSayisi;
		
		 */
	}

}
