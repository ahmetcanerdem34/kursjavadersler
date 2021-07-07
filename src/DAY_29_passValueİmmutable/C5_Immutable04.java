package DAY_29_passValue›mmutable;

public class C5_Immutable04 {

	public static void main(String[] args) {
		
		
		
		String a = "";
        a+=2;
        a+='c';
        a+=false;
        if (a=="2cfalse") {
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }

	}

}
