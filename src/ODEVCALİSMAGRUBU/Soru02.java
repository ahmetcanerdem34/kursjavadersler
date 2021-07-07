package ODEVCALÝSMAGRUBU;

public class Soru02 {

public static void main(String[] args) {
	
	 /*
	  Given a string, we'll say that the front is the first 3 chars of the string. 
	  If the string length is less than 3, 
	  the front is whatever is there. 
	  Return a new string which is 3 copies of the front
	  */

	  for (int i = 0; i < 3; i++) {
		  String front="Java";
		 System.out.print( front.substring(0,3));//JavJavJav
	}
	  
	  
}
}
