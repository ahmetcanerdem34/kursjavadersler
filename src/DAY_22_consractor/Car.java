package DAY_22_consractor;

public class Car {//bu car clas�nda istedi�im kadar car uretebilirim= scanner scan gibi
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	

	public static void main(String[] args) {
		
		/*
		  araba OBJES�  olu�trumak i�in
		  //evcil hayvan olu�turmak isterseniz onun i�inde ayr� siz bilirsiniz
		 
		 */
		Car car1=new Car();//BU KALIBI ��RENECE��Z=02. CAR ve YANINDAK� PARANTEZ CONSRUCTOR DIR=CLASS ADI �LE AYNI OLMALI
		//=>car1 objemiz=markalar olu�tural�, modeli y�l�, kazas� filan
		//=�nce class ad�=car //sonra obje adi=car1//new keyword kesin olacak/ sonra class ad� be parantez
		
		
		//KURALLAR
		/*
		 * ***bir obje olu�turulurken e�itli�in sa��nda mutlaka Constructor olmal� kullan�lmal�
		 * ***e�itli�in solu declaration, sa�� ise assign de�er di
		 1- Contructor ismi ile class ismi ayn� olmal�d�r
		 2-Constructor da mutlaka parantez olmal�d�r
		 3-peki parametre olmas� zorunlu mu? iste�e ba�l�d�r
		 */
		
		System.out.println(car1.marka + car1.model + car1.yil + car1.kazasiVarMi);
		//sonu� ne veriri null null 0 false
		car1.marka="toyota";
		car1.model="corrallo";
		car1.yil=2010;
		car1.kazasiVarMi=false;
		System.out.println(car1.marka +" "+ car1.model+" "+ car1.yil+" "+ car1.kazasiVarMi);
		//toyota corrallo 2010 false
		
		Car car2=new Car();//==>burda da yeni bir obje olu�turuyoruz obje=Car2
		car2.marka="opel";
		car2.model="astra";
		car2.yil=2010;
		car2.kazasiVarMi=true;//bunun kazas� yok tru diye de�i�tirdim==�nceki arabada false idi
		System.out.println(car2.marka +" "+ car2.model+" "+ car2.yil+" "+ car2.kazasiVarMi);
		//opel astra 2010 true
	}

}
