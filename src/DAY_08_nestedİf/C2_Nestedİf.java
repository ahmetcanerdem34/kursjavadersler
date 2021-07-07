package DAY_08_nestedÝf;

public class C2_NestedÝf {

	public static void main(String[] args) {
		
		//verþilen yas ve cinsiyet için emekli olup olmayacaðýný yazýnýz
		//soru: eðer çalýþan kadýn 60 yasýndan buyuk olduðunda emekli olabilir 
		//çlaýþsan erkekse 65 yasýndan buyukse emekli olabilir
		
		
			String cinsiyet="erkek";
			int yas=65;
			//burayý deðiþtirip çalýþtýrdýkça çýktý verecektir
			
			if(cinsiyet.equalsIgnoreCase("erkek") && yas>65) {
				System.out.println("emekli olabilirsin");
			}else if(cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
				System.out.println("emekli olamazsýn");
				
				//bitmedi kadýn olma ihtimali var
			} else if(cinsiyet.equalsIgnoreCase("kadýn") && yas>65) {
				System.out.println("emekli olabilirsin");
			}else if(cinsiyet.equalsIgnoreCase("kadýn") && yas<60) {
				System.out.println("emekli olamazsýn");
			}else {
				System.out.println("cinsiyet ve yas tanýmsýzz");
				
				
				System.out.println("nested if ile sonuç");
				

				
				if (cinsiyet.equalsIgnoreCase("erkek")) {
					
					
					if (yas<0) {
						System.out.println("yaþ negatif olamaz");
					
					} else if (yas<65) {
						System.out.println("erkek olarak bu yaþta emekli olamazsýn..");

					}else {
						System.out.println("emekli olabilirsin...");
					}
					
				} else if(cinsiyet.equalsIgnoreCase("kadýn")) {
					
					if (yas<0) {
						System.out.println("yaþ negatif olamaz");
						
					} else if (yas<60){
						System.out.println("kadýn olarak bu yaþta emekli olamazsýn..");

					}else {
						System.out.println("emekli olabilirisiniz");
					}

				}else {
					System.out.println("cinsiyet ve yas tanýmýnda sorun var");
					
					
					
//					nested if ile sonuç
//					emekli olabilirsin...
				}
			
			}
		
	}

}
