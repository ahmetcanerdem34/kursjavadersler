package DAY_43_interface;

public interface Interface02 {
	
	//buradaki default ve static bizim bildi�imiz default ve static mi--->
	//HAYIR
	
	public default void deneme() {
	System.out.println("default keyword lu method �a�l��t�");	
		
	}
	
	//bizim bildi�imiz default acces modifier d�
			//bir methodda birden fazla modifier olur mu?OLMAZ B�YLE B��EY OLAB�L�R M�
			//bizim interface de olu�turdu�umuz tum methodlar publictir
			//interface de defoult keyword kullanarak concrete method olu�turabiliriz.
			//bburadaki default keywordu acces modifier degil javan�n �zel bir ��z�m�d�r
	//buradaki keyword ba��na yaz�d��� methodun concrete oldu�unu belirtir
	
	public static void deneme2() {
		System.out.println("static keywordu lu method �al���r");
		
		//yukar�da  default keywordu i�in yazd�klar�m�z static i�in de ge�erlidir
		//static ve defauld keywordu kullanarak olu�turdu�umuz methodlar override edilmek zorunda de�il 
	}
}
