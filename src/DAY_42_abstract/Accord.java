package DAY_42_abstract;

public class Accord extends Honda{//motor methodunu kullanmak zorundayýz--Source den override etmeliyiz, 
								//deri methodunauda bu arabaya eklemek ,sitiyorsak ovverride edeceðiz

	@Override
	public void motor() {
		
		System.out.println("2.o Turbo");
	
		
	}

	@Override
	public void deri() {
		System.out.println("Gerçek deeri koltuk");
	}
	
	
	

}
