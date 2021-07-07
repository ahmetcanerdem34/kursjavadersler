package DAY_40_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// 
		
		int arr[]= {1,4,7,8};
		
		try {
		System.out.println(arr[20]);
		} /*catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}*/
		finally {//try catch ya da finally ile çalýþýr
			
			System.out.println("ne olursa olsun bu satýr yazýlsýn");
		}
		System.out.println("kod bloke olmamýþ");
		//finally blogu try-catch blogu ile veya sadece try blogu ile çalýþabilir
		//finally blogu ile ongorduðum bir sorun olduðunda çalýþtýðý gibi
		//öngörmediðimiz bir exception da da çalýþýr
	}

}
