package DAY_21_scopeDevam;

public class Scope5 {

	public static void main(String[] args) {
		
		
		//3 loop �rne�i
		
		
		for (int i = 0; i < 5 ; i++) {
			
			String isim="Ayse";
			System.out.println(i + " "+isim );
//			0 Ayse
//			1 Ayse
//			2 Ayse
//			3 Ayse
//			4 Ayse

		}
		//System.out.println(isim); loop i�inde olu�turulan variable ler loop a �zeldir
		//loop d���nda kullan�lamaz
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " ");
			
		}
		
		System.out.println("**********************************");
		//System.out.println(i); -->buda �al��maz for loop d���
		
		
		int count=0;//local variablee dir 0 s�f�r atamazsan�z �al��maz--->��nk� local
		while (count<5) {
			
			System.out.println(count);
			count++;
//			0
//			1
//			2
//			3
//			4
		}

	}

}
