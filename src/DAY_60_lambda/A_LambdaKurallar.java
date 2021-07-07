package DAY_60_lambda;

import java.util.Arrays;
import java.util.List;

public class A_LambdaKurallar {

	public static void main(String[] args) {
		
		

		  //java da 1 den 10 a kadar say�lar�n toplam� a�a��daki �ekilde yap�l�yordu
        int toplam=0;

        for (int x = 0; x < 10; x++) {

            toplam+=x;
        }
        System.out.println(toplam);//45
        /*
        x-> Sysytem.out.println(x)

        public static void genName(Integer x){
        Sysytem.out.println(x)
         */

        List<Integer> sayilar = Arrays.asList(1,2,3);

        System.out.println(sayilar);//[1, 2, 3]
        sayilar.forEach(x-> System.out.print(x+" "));//1 2 3 
        
        System.out.println();
        sayilar.forEach(x->{//ifade say�s� birden fazla oldu�u i�in {} k�rly bird kullanmal�y�z
        	
        	x+=2;
        	System.out.print(x+" ");//3 4 5 
        });
        
        System.out.println();
        
        
        sayilar.forEach((Integer x)-> {//isterek parametrenin veri tipine belirtebililriz
        	x+=2;
        	System.out.print(x+" ");//3 4 5 
        });
        
        System.out.println();

        
        ///lambda ifadesi local de�i�ken kullanabilir
        
        sayilar.forEach(x->{
        	int y=x*2;
        	System.out.print(y+" ");//2 4 6 
        });
        
        System.out.println();
        
        //ifade d��� parametrede kullanambiliriz; ancak bu de�i�ken final gibi d���n�lebilir
        
        int disDegisken=5;
        
        sayilar.forEach(x-> System.out.println(x + disDegisken));
//        6
//        7
//        8
        
        System.out.println();
        
        //daha k�sa kullan�m i�in method referans� tercih edilebilir
        
        sayilar.forEach(System.out::println);
//        1
//        2
//        3
        
        List<Integer> liste= Arrays.asList(1,3,5,7,10);
        
        liste.forEach(x-> System.out.print(x+" "));//ba�taki list yazan collection-yan�ndaki foreach--kalan k�s�mda lamdda foksiyonu
        //1 3 5 7 10 
        
        System.out.println();
        //her bir leman� 2 artt�rarak yazma 
        liste.forEach(x-> System.out.print(x+2+" "));
        //3 5 7 9 12 
        
        System.out.println();
        
        //e�er sat�r say�s� 1 den fazla ise {} kullanmal�y�z
        
        liste.forEach(x-> {
        	int miktar=2;
        	System.out.print(x+2+" ");//3 5 7 9 12 
        });
       System.out.println();
       
       System.out.println("veri tipi kullan�l�rsa explicit(a��k), implicit(�rt�l�)");
       
      liste.forEach((Integer x)->System.out.print(x*2+" "));//her bir say�m�z� 2 ile �arpacak
//      veri tipi kullan�l�rsa explicit(a��k), implicit(�rt�l�)
//      2 6 10 14 20 
        
      System.out.println();
        System.out.println("bir d�� de�i�ken kullanal�m");
        
        int deger=5;
        liste.forEach(x->System.out.print(x+deger+" "));//her bir say�m�za 5 ekleyecek
//        bir d�� de�i�ken kullanal�m
//        6 8 10 12 15 
        
        
        System.out.println();
        
        liste.forEach(x-> System.out.print(x+" "));//buras� lambda fonksiyonu(methodu)
        //1 3 5 7 10 
        
        //bunun yerine method referaans� da kullanabiliriz
        //method referans� Class ad� : : Method ad�
        
        System.out.println("\nmethod refarans kullan�m�");
        
        liste.forEach(A_LambdaKurallar :: yazdir);
    

    }

	public static void yazdir(int x) {
		
		System.out.print(x+" ");
//		method refarans kullan�m�
//		1 3 5 7 10 
		
	
	}
		
		
	
}