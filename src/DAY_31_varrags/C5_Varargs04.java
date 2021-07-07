package DAY_31_varrags;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		
		//toplama(list); varargs esnek oldu�u i�in list e benzese de list de�ildir
		
		int arr[]= {15,20,25};
		toplama(arr);//varargs array olarak cal���r ve argument olarak array yollanabilir
		
		//kullan�c�dan de�er olarak varargs cal��t�rmak istiyorsak
		//7girilen de�erleri bir array e kaydetmelisiniz
		//bunun i�in kullan�c�dan ald���n�z de�erleri esnek oldu�u i�in bir list e koyar�z
		//sonra listi array e ceviririz
		
		

	}
	public static void toplama(int ...var) {
		
	
	
	int toplam=0;
	for (int each : var) {
		
		toplam+=each;
	}
	System.out.println("toplam :" +toplam);

}
}