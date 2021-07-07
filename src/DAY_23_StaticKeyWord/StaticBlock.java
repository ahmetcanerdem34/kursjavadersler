package DAY_23_StaticKeyWord;

public class StaticBlock {
	
	
	static String isim;
	//stati block class calýþtýrýldýðýnda ilk olarak çalþýr(main method dan bile önce çalýþýr)
	//static bloclar ne için kullanýlýr= static variablelere deðer atamak için kullanýlýr
	//eðer 1 den fazla block varsa en üstteki en önce çalýþýr
	//mehmet block unu götürüp en aþaðý koysak yine sýralam deðiþmez
	
	static {//static block oluþturduk, main methodu içine gidelim
		isim="Mehmet";
		System.out.println(isim);

	}

	static {
		System.out.println("2. static block çalýþtý");
	}
	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);
		isim="tugrul";
		System.out.println(isim);
//		Mehmet
//		2. static block çalýþýt
//		Alican

		

	}

}
