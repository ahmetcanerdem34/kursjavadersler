package DAY_31_varrags;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		
		//toplama(list); varargs esnek olduðu için list e benzese de list deðildir
		
		int arr[]= {15,20,25};
		toplama(arr);//varargs array olarak calýþýr ve argument olarak array yollanabilir
		
		//kullanýcýdan deðer olarak varargs calýþtýrmak istiyorsak
		//7girilen deðerleri bir array e kaydetmelisiniz
		//bunun için kullanýcýdan aldýðýnýz deðerleri esnek olduðu için bir list e koyarýz
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