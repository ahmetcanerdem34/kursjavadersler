package DAY_24_array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_04Ornek {

	public static void main(String[] args) {
		
		//kullan�c�dan de�erler alarak bir int array olu�turun
		//ben kullan�c�n�n ka� de�er girece�ini bilmiyorum
		//ka� de�er girece�ini alal�m �nce
		//onun i�in de�erler almadan �nce uzunlu�unu almam laz�m
		//ona g�re for da yapal�m
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("ka� say�dan olu�an bir array istedi�inizi yaz�n�z :");
		int uzunluk=scan.nextInt();
		
		int arr[]=new int[uzunluk];//diyelimki 5 girdi, 5 kere al�p array e yerle�tirmeniz laz�m//5 kere almam�z laz�m, for , while, do while
							//uzunluk yani say�s�n� al�nca java yer a��yor
		
		System.out.println("L�tfen say�lar� giriniz");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();//arr ye atad�m, i yi surekli al�p uzunlu�a kadar yukar� al�p i�leyecek
		
		}
		System.out.println(Arrays.toString(arr));
//		ka� say�dan olu�an bir array istedi�inizi yaz�n�z :4
//		L�tfen say�lar� giriniz
//		5
//		3
//		5
//		7
//		[5, 3, 5, 7]

		

	}

}
