package DAY_20_scope;

public class Scope2 {

	public static void main(String[] args) {
		
		/*
		 
		 1.instance variable  class i�inde main method d���nda olu�turulur      
		 2.de�er atanmas� zorunlu de�ildir java default de�er atar              
		 3,static olmamal�d�r (edited) 
		 4. kullanmak i�in obje olu�turulmal�d�r (edited) 
		 
		 Instance variable default de�erler                                    
		 1.�nt = 0                                                  
		 2.char = space                                         
		 3,String= null                                            
		 4.boolean= true/false
		 
		 */
		
		
		
		
		//scope 2 clas�nday�m
		//istersem scope 1 klas�na ula�abilirim
		//ben farkl� claslardan da scope1 clas�na da object olu�turarak ula�abilirim
		
		//NASIL
		
		//�nce ula�mak istedi�imiz clas
		
		Scope1 obj4=new Scope1();//biz her ne kadarda scope2 clas�nda olsakta obje Scope1 clas�ndan--> sadece gidip ba�lar�na public koymal�y�z
		
		System.out.println(obj4.isim);
		System.out.println(obj4.soyisim);
		obj4.soyisim="Can";
		obj4.isim="Ahmet";
		
		System.out.println(obj4.isim+" "+obj4.soyisim);
//		mehmet
//		null
//		Ahmet Can

	}

}
