package DAY_32_stringBuilder;

import java.time.LocalTime;
import java.util.Iterator;

public class C2_StringBuilder02 {

	public static void main(String[] args) {
		
		//10000 kere dönecek bir loop yazalým
		//loop sa String ve StringBuildler kullanýp
		//öncesinde ve sonrasýnda zaman alalým
		//hýzlarýný karþýlaþtýralým
		
		String str=" ";
		StringBuilder sb=new StringBuilder("");
		
		LocalTime lt1 = LocalTime.now();
		System.out.println(lt1);//23:11:23.538139700
		
		for (int i = 0; i < 10000; i++) {
			str+=1;
			
		}
		LocalTime lt2 = LocalTime.now();
		System.out.println(lt2);
		
		LocalTime lt3 = LocalTime.now();
		System.out.println(lt3);

		
		for (int i = 0; i < 10000; i++) {
			sb.append(i);
	}
		LocalTime lt4 = LocalTime.now();
		System.out.println(lt4);
		
//		23:14:51.003174
//		23:14:51.363174200
//		23:14:51.364173600
//		23:14:51.412175800
	}
}
