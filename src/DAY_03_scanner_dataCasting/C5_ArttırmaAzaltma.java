package DAY_03_scanner_dataCasting;

public class C5_Artt�rmaAzaltma {

	public static void main(String[] args) {


		int num= 15;
		//bir say�y� 2 artt�rmak istersek 2 ile toplar�z
		//bunu kod na ne yapar�z
		//num + 2; dersek hata verir
		
		int num2=num+2;
		
		System.out.println("num2 = " + num2);
		System.out.println("num2 = " + num);
//		num2 = 17
//		num2 = 15
		
		
		num=num +5;
		//bura int num yazmaya gerek yok ��nk� yukarda tan�mlad�k
		//20--->>art�k de�i�kenimiz 20 oldu, num olan kutuma 5 daha ekledim
		//8. sat�rda 15 olan, 21.sat�rda 20 olacak, eski num �ld�, yenisi bu
		//bu sat�rdan sonra num=20 dir
		
		System.out.println("yeni num : "+num);
		//yeni num : 20
		
		System.out.println(num + 12);//32
		
		
		//ben bir say�y� art�rmam i�in /increment) o say�ya istedi�iniz say�y� ekler ve sonucu variable ye atar�z
		
		
		//8 ekleyelim num a
		
		num = num+8;
		System.out.println(num + 8);//28
		
		
		
		//java n�n bize kolayl��� var 2 defa num yazmaya gerek yok
		
		num+=5;
		
		System.out.println("java n�n pratik art�m�ndan sonra num :" + num);
		//java n�n pratik art�m�ndan sonra num :33
		
		//num � 10 artt�ral�m
		
		num+=10;//num 43 oldu
		
		//num 1 artt�ral�m
		num+=1;// 44 oldu
		
		//java bu daha da kolayla�t�rm��
		
		num++;
		
		System.out.println("num �n son hali :" + num);
		//num �n son hali :45
		
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
