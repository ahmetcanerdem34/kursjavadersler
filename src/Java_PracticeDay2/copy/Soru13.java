package Java_PracticeDay2.copy;

import java.util.Scanner;

public class Soru13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("String ve sayý karýþýmýgiriniz");
		String yazi=scan.nextLine();
		
		sumOfDigit(yazi);

	}
public static void sumOfDigit(String str) {
	
	int sum=0;
	
	for (int i = 0; i < str.length(); i++) {
		
		
		if(Character.isDigit(str.charAt(i))) {//string içindeki sayyýyý belirlediðinde if true oluor aþaðýya gönderiyor topluyor
			
			sum+=Integer.valueOf(""+str.charAt(i));//aski deðeri olarak almasýn iye týrnak koyduk
		}
		
	}
	System.out.println("girilen stringdeki sayýlarýn toplamý =" +sum);
	
//	String ve sayý karýþýmýgiriniz
//	ttu7665jtg
//	girilen stringdeki sayýlarýn toplamý =24
}
}
