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
		finally {//try catch ya da finally ile �al���r
			
			System.out.println("ne olursa olsun bu sat�r yaz�ls�n");
		}
		System.out.println("kod bloke olmam��");
		//finally blogu try-catch blogu ile veya sadece try blogu ile �al��abilir
		//finally blogu ile ongordu�um bir sorun oldu�unda �al��t��� gibi
		//�ng�rmedi�imiz bir exception da da �al���r
	}

}
