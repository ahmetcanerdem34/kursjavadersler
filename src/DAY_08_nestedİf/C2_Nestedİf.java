package DAY_08_nested�f;

public class C2_Nested�f {

	public static void main(String[] args) {
		
		//ver�ilen yas ve cinsiyet i�in emekli olup olmayaca��n� yaz�n�z
		//soru: e�er �al��an kad�n 60 yas�ndan buyuk oldu�unda emekli olabilir 
		//�la��san erkekse 65 yas�ndan buyukse emekli olabilir
		
		
			String cinsiyet="erkek";
			int yas=65;
			//buray� de�i�tirip �al��t�rd�k�a ��kt� verecektir
			
			if(cinsiyet.equalsIgnoreCase("erkek") && yas>65) {
				System.out.println("emekli olabilirsin");
			}else if(cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
				System.out.println("emekli olamazs�n");
				
				//bitmedi kad�n olma ihtimali var
			} else if(cinsiyet.equalsIgnoreCase("kad�n") && yas>65) {
				System.out.println("emekli olabilirsin");
			}else if(cinsiyet.equalsIgnoreCase("kad�n") && yas<60) {
				System.out.println("emekli olamazs�n");
			}else {
				System.out.println("cinsiyet ve yas tan�ms�zz");
				
				
				System.out.println("nested if ile sonu�");
				

				
				if (cinsiyet.equalsIgnoreCase("erkek")) {
					
					
					if (yas<0) {
						System.out.println("ya� negatif olamaz");
					
					} else if (yas<65) {
						System.out.println("erkek olarak bu ya�ta emekli olamazs�n..");

					}else {
						System.out.println("emekli olabilirsin...");
					}
					
				} else if(cinsiyet.equalsIgnoreCase("kad�n")) {
					
					if (yas<0) {
						System.out.println("ya� negatif olamaz");
						
					} else if (yas<60){
						System.out.println("kad�n olarak bu ya�ta emekli olamazs�n..");

					}else {
						System.out.println("emekli olabilirisiniz");
					}

				}else {
					System.out.println("cinsiyet ve yas tan�m�nda sorun var");
					
					
					
//					nested if ile sonu�
//					emekli olabilirsin...
				}
			
			}
		
	}

}
