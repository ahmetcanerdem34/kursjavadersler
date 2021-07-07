package Java_PracticeDay2;

public class SoruArray02 {

	public static void main(String[] args) {
	/*	
		* Girilen Multidimensional arraydeki cift sayilari toplayan bir method
        * yaziniz
        *
        *
        * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
        *
        * OUTPUT : Arraydeki cift sayilarin toplami : 30
        *
        *
        */
		
		
		
		int multiArr [][]= {{1,3,6},{2,8},{5,7,9,14}};
		
		System.out.println("�ift elemanlar toplam� :"+ciftToplama(multiArr));
		
		//�ift elemanlar toplam� :30
		
		}

	private static int ciftToplama(int arr[][]) {
		
		
      int sum=0;
      
		for (int i = 0; i < arr.length; i++) {//bu d�� elemanlar
			
			for (int j = 0; j < arr [i].length; j++) {//buda i� elemanlar i�in
				
				if(arr[i][j]%2==0) {
					
					sum+=arr[i][j];
				}
				
			}
			
		}
		return sum;
	}
		

	}


