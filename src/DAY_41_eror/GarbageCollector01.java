package DAY_41_eror;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {

	public static void main(String[] args) {
		
		
		String str="";
		for (int i = 0; i < 1000; i++) {
			
			str+=i;
			
			
		}
			//bu kod çalýþtýrðýnda kaçtane obje oluþturur
		//1001
		//1 tane baþta oluþtruduk=String str="";
		//sonra her dongude str a concatination yapýlacak
		//ama Strimg class ý ýmmutable olduðu için her yeni deðeri koymak için
		//yeni bir String objesi oluþturulur ve eski objeden pointersilinir
		
		//dolayýsýyla loop bittiðinde str için 1 tane pointer in iþaret ettiði obje
		//1000 tane de hiç bir pointer ýn iþaret etmediði heap memory de bulunur
		
		List<Integer> list = new ArrayList<>();//bu satýr javaya new kelimesiyle yeni bir obje(list) oluþturmasýný söyluyor
												//java new kelimesini görünce yeni obje için memoryi kontrrol eder ve
		//memory kritik seviyede ise Garbage collectoru devreye sokuyor
		//garbage collector finalize() methodunu çaýlýþtýrýr
		//finalize methodu silinecek objeleri iþaretler ve garbage colectorfinallize olan objeleri siler
		//geriye kalnlarýda ziple sýkýþtýrý depoda yer açar
		
	}

}
