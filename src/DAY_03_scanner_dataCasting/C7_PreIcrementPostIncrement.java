package DAY_03_scanner_dataCasting;

public class C7_PreIcrementPostIncrement {

	public static void main(String[] args) {
		
		
		int num =20;
		
		num++;//num 21
		System.out.println(num);//21
		
		System.out.println(num++);//21 ---postincrement oldu�unda �nce i�lem sonra arttma
		System.out.println(num);//22 =�nce yazd�r�yor sonra artt�r�yor, �nce num � okuyor artt�rmay� ; den sonra yap�p a�a��ya at�yo
		
		System.out.println(++num);//23--->preincrement oldu�unda �nce artt�r�yor sonra yazd�r�yor
		System.out.println(num);//23
	}

}
