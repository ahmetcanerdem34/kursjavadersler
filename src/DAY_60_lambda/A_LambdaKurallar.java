package DAY_60_lambda;

import java.util.Arrays;
import java.util.List;

public class A_LambdaKurallar {

	public static void main(String[] args) {
		
		

		  //java da 1 den 10 a kadar sayýlarýn toplamý aþaðýdaki þekilde yapýlýyordu
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
        sayilar.forEach(x->{//ifade sayýsý birden fazla olduðu için {} körly bird kullanmalýyýz
        	
        	x+=2;
        	System.out.print(x+" ");//3 4 5 
        });
        
        System.out.println();
        
        
        sayilar.forEach((Integer x)-> {//isterek parametrenin veri tipine belirtebililriz
        	x+=2;
        	System.out.print(x+" ");//3 4 5 
        });
        
        System.out.println();

        
        ///lambda ifadesi local deðiþken kullanabilir
        
        sayilar.forEach(x->{
        	int y=x*2;
        	System.out.print(y+" ");//2 4 6 
        });
        
        System.out.println();
        
        //ifade dýþý parametrede kullanambiliriz; ancak bu deðiþken final gibi düþünülebilir
        
        int disDegisken=5;
        
        sayilar.forEach(x-> System.out.println(x + disDegisken));
//        6
//        7
//        8
        
        System.out.println();
        
        //daha kýsa kullaným için method referansý tercih edilebilir
        
        sayilar.forEach(System.out::println);
//        1
//        2
//        3
        
        List<Integer> liste= Arrays.asList(1,3,5,7,10);
        
        liste.forEach(x-> System.out.print(x+" "));//baþtaki list yazan collection-yanýndaki foreach--kalan kýsýmda lamdda foksiyonu
        //1 3 5 7 10 
        
        System.out.println();
        //her bir lemaný 2 arttýrarak yazma 
        liste.forEach(x-> System.out.print(x+2+" "));
        //3 5 7 9 12 
        
        System.out.println();
        
        //eðer satýr sayýsý 1 den fazla ise {} kullanmalýyýz
        
        liste.forEach(x-> {
        	int miktar=2;
        	System.out.print(x+2+" ");//3 5 7 9 12 
        });
       System.out.println();
       
       System.out.println("veri tipi kullanýlýrsa explicit(açýk), implicit(örtülü)");
       
      liste.forEach((Integer x)->System.out.print(x*2+" "));//her bir sayýmýzý 2 ile çarpacak
//      veri tipi kullanýlýrsa explicit(açýk), implicit(örtülü)
//      2 6 10 14 20 
        
      System.out.println();
        System.out.println("bir dýþ deðiþken kullanalým");
        
        int deger=5;
        liste.forEach(x->System.out.print(x+deger+" "));//her bir sayýmýza 5 ekleyecek
//        bir dýþ deðiþken kullanalým
//        6 8 10 12 15 
        
        
        System.out.println();
        
        liste.forEach(x-> System.out.print(x+" "));//burasý lambda fonksiyonu(methodu)
        //1 3 5 7 10 
        
        //bunun yerine method referaansý da kullanabiliriz
        //method referansý Class adý : : Method adý
        
        System.out.println("\nmethod refarans kullanýmý");
        
        liste.forEach(A_LambdaKurallar :: yazdir);
    

    }

	public static void yazdir(int x) {
		
		System.out.print(x+" ");
//		method refarans kullanýmý
//		1 3 5 7 10 
		
	
	}
		
		
	
}