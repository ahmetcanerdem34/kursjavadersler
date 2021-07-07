package DAY_24_array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_04Ornek {

	public static void main(String[] args) {
		
		//kullanýcýdan deðerler alarak bir int array oluþturun
		//ben kullanýcýnýn kaç deðer gireceðini bilmiyorum
		//kaç deðer gireceðini alalým önce
		//onun için deðerler almadan önce uzunluðunu almam lazým
		//ona göre for da yapalým
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("kaç sayýdan oluþan bir array istediðinizi yazýnýz :");
		int uzunluk=scan.nextInt();
		
		int arr[]=new int[uzunluk];//diyelimki 5 girdi, 5 kere alýp array e yerleþtirmeniz lazým//5 kere almamýz lazým, for , while, do while
							//uzunluk yani sayýsýný alýnca java yer açýyor
		
		System.out.println("Lütfen sayýlarý giriniz");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();//arr ye atadým, i yi surekli alýp uzunluða kadar yukarý alýp iþleyecek
		
		}
		System.out.println(Arrays.toString(arr));
//		kaç sayýdan oluþan bir array istediðinizi yazýnýz :4
//		Lütfen sayýlarý giriniz
//		5
//		3
//		5
//		7
//		[5, 3, 5, 7]

		

	}

}
