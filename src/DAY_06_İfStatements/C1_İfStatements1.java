package DAY_06_�fStatements;

public class C1_�fStatements1 {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=8;
		
		if(a>b) {//java bacaka �art true ise body devreye girer yani s�sl� i�i
			System.out.println("a b�y�kt�r b");
			//a b�y�kt�r b
		
		}
		
		if (a*b < 0) {//buras� false verir, �art sa�lanmaz--->bu if bana hi�bir �ey yazd�rmaz
			
			System.out.println("say�lar�n �arp�m� negatif");
			//bi�ey yazmaz
		}
		
		if(a<b || b>0) {//ilki false ikincisi true== �art sa�lad� or var
			
			System.out.println("or lu c�mle �al���r");
			//or lu c�mle �al���r
		
			
		}
		if(a-b>0 && a*b>0) {
			
			System.out.println("and c�mlesi �al��t�");
			//and c�mlesi �al��t�
		}
		

	}

}
