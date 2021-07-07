package DAY_03_scanner_dataCasting;

public class C5_ArttırmaAzaltma {

	public static void main(String[] args) {


		int num= 15;
		//bir sayıyı 2 arttırmak istersek 2 ile toplarız
		//bunu kod na ne yaparız
		//num + 2; dersek hata verir
		
		int num2=num+2;
		
		System.out.println("num2 = " + num2);
		System.out.println("num2 = " + num);
//		num2 = 17
//		num2 = 15
		
		
		num=num +5;
		//bura int num yazmaya gerek yok çünkü yukarda tanımladık
		//20--->>artık değişkenimiz 20 oldu, num olan kutuma 5 daha ekledim
		//8. satırda 15 olan, 21.satırda 20 olacak, eski num öldü, yenisi bu
		//bu satırdan sonra num=20 dir
		
		System.out.println("yeni num : "+num);
		//yeni num : 20
		
		System.out.println(num + 12);//32
		
		
		//ben bir sayıyı artırmam için /increment) o sayıya istediğiniz sayıyı ekler ve sonucu variable ye atarız
		
		
		//8 ekleyelim num a
		
		num = num+8;
		System.out.println(num + 8);//28
		
		
		
		//java nın bize kolaylığı var 2 defa num yazmaya gerek yok
		
		num+=5;
		
		System.out.println("java nın pratik artımından sonra num :" + num);
		//java nın pratik artımından sonra num :33
		
		//num ı 10 arttıralım
		
		num+=10;//num 43 oldu
		
		//num 1 arttıralım
		num+=1;// 44 oldu
		
		//java bu daha da kolaylaştırmış
		
		num++;
		
		System.out.println("num ın son hali :" + num);
		//num ın son hali :45
		
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
