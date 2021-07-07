package DAY_22_consractor;

public class Car {//bu car clasýnda istediðim kadar car uretebilirim= scanner scan gibi
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	

	public static void main(String[] args) {
		
		/*
		  araba OBJESÝ  oluþtrumak için
		  //evcil hayvan oluþturmak isterseniz onun içinde ayrý siz bilirsiniz
		 
		 */
		Car car1=new Car();//BU KALIBI ÖÐRENECEÐÝZ=02. CAR ve YANINDAKÝ PARANTEZ CONSRUCTOR DIR=CLASS ADI ÝLE AYNI OLMALI
		//=>car1 objemiz=markalar oluþturalý, modeli yýlý, kazasý filan
		//=önce class adý=car //sonra obje adi=car1//new keyword kesin olacak/ sonra class adý be parantez
		
		
		//KURALLAR
		/*
		 * ***bir obje oluþturulurken eþitliðin saðýnda mutlaka Constructor olmalý kullanýlmalý
		 * ***eþitliðin solu declaration, saðý ise assign deðer di
		 1- Contructor ismi ile class ismi ayný olmalýdýr
		 2-Constructor da mutlaka parantez olmalýdýr
		 3-peki parametre olmasý zorunlu mu? isteðe baðlýdýr
		 */
		
		System.out.println(car1.marka + car1.model + car1.yil + car1.kazasiVarMi);
		//sonuç ne veriri null null 0 false
		car1.marka="toyota";
		car1.model="corrallo";
		car1.yil=2010;
		car1.kazasiVarMi=false;
		System.out.println(car1.marka +" "+ car1.model+" "+ car1.yil+" "+ car1.kazasiVarMi);
		//toyota corrallo 2010 false
		
		Car car2=new Car();//==>burda da yeni bir obje oluþturuyoruz obje=Car2
		car2.marka="opel";
		car2.model="astra";
		car2.yil=2010;
		car2.kazasiVarMi=true;//bunun kazasý yok tru diye deðiþtirdim==önceki arabada false idi
		System.out.println(car2.marka +" "+ car2.model+" "+ car2.yil+" "+ car2.kazasiVarMi);
		//opel astra 2010 true
	}

}
