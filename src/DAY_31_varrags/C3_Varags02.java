package DAY_31_varrags;

public class C3_Varags02 {

	public static void main(String[] args) {//burdaki args varags tan geliyor
		
		
		//istedi�imiz kadar say�y� giedi�imizde tum say�lar� toplayan bir method yazal�m
		//Var--- variety �e�itlilik args--- arguments
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,34,544,3,5,4,-54);
		

	}

	public static void toplama(int ...var) {//bu �ekilde yap�nca yukar�s� istedi�iniz kadar yazabilirsiniz(...) �nemli olan �� nokta
		//data turunden sonra yazd���m�z �� nokta ..varags kullanaca��m�z java taraf�ndan anla��l�r
		//(ama sadece yukarda ayn� i�lem i�inler ge�erli, toplama
		//for each te bunu g�rebiliriz
		
		int toplam=0;
		for (int each : var) {//var a git her bir intiger � getir
			
			toplam+=each;//de�i�kenimiz j
			//for loop bitti�i yerde toplam� yazd�r
		}
		System.out.println("toplam :" +toplam);
		//gitti yukarda toplad�
		//hesap makinesinde filan yayg�n kullan�l�r
		
//		toplam :7
//		toplam :30
//		toplam :25
//		toplam :541
	}

}
