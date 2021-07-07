package DAY_03_scanner_dataCasting;

public class C7_PreIcrementPostIncrement {

	public static void main(String[] args) {
		
		
		int num =20;
		
		num++;//num 21
		System.out.println(num);//21
		
		System.out.println(num++);//21 ---postincrement olduðunda önce iþlem sonra arttma
		System.out.println(num);//22 =önce yazdýrýyor sonra arttýrýyor, önce num ý okuyor arttýrmayý ; den sonra yapýp aþaðýya atýyo
		
		System.out.println(++num);//23--->preincrement olduðunda önce arttýrýyor sonra yazdýrýyor
		System.out.println(num);//23
	}

}
