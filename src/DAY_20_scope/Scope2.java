package DAY_20_scope;

public class Scope2 {

	public static void main(String[] args) {
		
		/*
		 
		 1.instance variable  class içinde main method dýþýnda oluþturulur      
		 2.deðer atanmasý zorunlu deðildir java default deðer atar              
		 3,static olmamalýdýr (edited) 
		 4. kullanmak için obje oluþturulmalýdýr (edited) 
		 
		 Instance variable default deðerler                                    
		 1.ýnt = 0                                                  
		 2.char = space                                         
		 3,String= null                                            
		 4.boolean= true/false
		 
		 */
		
		
		
		
		//scope 2 clasýndayým
		//istersem scope 1 klasýna ulaþabilirim
		//ben farklý claslardan da scope1 clasýna da object oluþturarak ulaþabilirim
		
		//NASIL
		
		//önce ulaþmak istediðimiz clas
		
		Scope1 obj4=new Scope1();//biz her ne kadarda scope2 clasýnda olsakta obje Scope1 clasýndan--> sadece gidip baþlarýna public koymalýyýz
		
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
