package Day_39_exceptions;

public class Exceptions05 {

	public static void main(String[] args) {
		
		
		//null olarak tan�mlanm�� bir obje ile uygun olmayan bir i�lem yapmaya �al��t���m�zda
		//java NullPointerException verir
		//unchecked exception d�r yani rte
		
		String str1=" ";
		String str2="";
		String str3=null;//null bir de�er de�ildir, sadece str3 un hi�bir �eye e�it olmad���n�
						//s�yleyen bir i�aret�idir(pointer)
		
		System.out.println(str1.length());//1
		System.out.println(str2.length());//0
		System.out.println(str3.length());//NullPointerException:
		
		System.out.println(str3+"bo�");
		System.out.println(str3.concat("bo�"));//hata verir
		

	}

}
