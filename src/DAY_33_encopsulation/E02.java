package DAY_33_encopsulation;

public class E02 {
	
	
	public static void main(String[] args) {
		
		E01 obj1 = new E01(); //Iobje olu�turduk,, 
		//bu obj1. yaz�p bakt���mda  age valuable yi g�remem
		// neden ��NK� di�er class da private= ba�ka s�n�flar� jkullanamma
		//ama get age var onu yazd�r�sam 25 i g�r�r�rz
		//age valuable private idi getter methodu kullanrak ul�am�� olduk, okuyabildik
		System.out.println(obj1.getAge());//encapsula edilmi� k�sma ula�t�k 25	
		//name yide yapal�m
		System.out.println(obj1.getName());//Ali
		
		//de�i�tirelim setterla
		
		obj1.setAge(33);//burda age i 33 yap�nca di�er clastaki de�eri de�i�tirmez, 
		//o orada normaldir biz bu class i�in de�i�tirdik, buna hak verdi 33
		System.out.println(obj1.getAge());//33
		
		//name yide yapal�m
		
		obj1.setName("Ay�e");
		System.out.println(obj1.getName());//Ay�e= ismi ubdate ettim
	    
		E03 obj3 = new E03();//yeni bir obje olu�turdum
		//num � 38  yap�n ve yazd�r�n
		
		obj3.setNum(38);
		System.out.println(obj3.getNum());//38
		
		//name i ekrane yazd�r�n
		
		System.out.println(obj3.getName());//Emine
		
		//Initial valuable n� de�i�tirilemez haline getrin
		//E03 e gider public void setInitial k�sm�n� kald�rr�r�m
		
		//In�tial variable �n� okunamz hale getirin
		//E03 e gider get.In�tial k�sm�n� kald�r�r�m
		
		
		
		
		
		
		
		}
		
		
	}


