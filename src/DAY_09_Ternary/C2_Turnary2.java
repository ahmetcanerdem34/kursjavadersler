package DAY_09_Ternary;

public class C2_Turnary2 {

	public static void main(String[] args) {
		
		
		int y =1;
		int z=1;
		
		int a =y<10? y++: z++;
		System.out.println(y+ "," + z + "," + a);
//		2,1,1
		
		// y þuanda 2 
		System.out.println(y++);//2
		System.out.println(++y);//4
		System.out.println(y);//4
	}

}
