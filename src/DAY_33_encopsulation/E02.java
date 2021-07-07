package DAY_33_encopsulation;

public class E02 {
	
	
	public static void main(String[] args) {
		
		E01 obj1 = new E01(); //Iobje oluþturduk,, 
		//bu obj1. yazýp baktýðýmda  age valuable yi göremem
		// neden ÇÜNKÜ diðer class da private= baþka sýnýflarý jkullanamma
		//ama get age var onu yazdýrýsam 25 i görürürz
		//age valuable private idi getter methodu kullanrak ulþamýþ olduk, okuyabildik
		System.out.println(obj1.getAge());//encapsula edilmiþ kýsma ulaþtýk 25	
		//name yide yapalým
		System.out.println(obj1.getName());//Ali
		
		//deðiþtirelim setterla
		
		obj1.setAge(33);//burda age i 33 yapýnca diðer clastaki deðeri deðiþtirmez, 
		//o orada normaldir biz bu class için deðiþtirdik, buna hak verdi 33
		System.out.println(obj1.getAge());//33
		
		//name yide yapalým
		
		obj1.setName("Ayþe");
		System.out.println(obj1.getName());//Ayþe= ismi ubdate ettim
	    
		E03 obj3 = new E03();//yeni bir obje oluþturdum
		//num ý 38  yapýn ve yazdýrýn
		
		obj3.setNum(38);
		System.out.println(obj3.getNum());//38
		
		//name i ekrane yazdýrýn
		
		System.out.println(obj3.getName());//Emine
		
		//Initial valuable ný deðiþtirilemez haline getrin
		//E03 e gider public void setInitial kýsmýný kaldýrrýrým
		
		//Inýtial variable ýný okunamz hale getirin
		//E03 e gider get.Inýtial kýsmýný kaldýrýrým
		
		
		
		
		
		
		
		}
		
		
	}


