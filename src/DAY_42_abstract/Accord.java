package DAY_42_abstract;

public class Accord extends Honda{//motor methodunu kullanmak zorunday�z--Source den override etmeliyiz, 
								//deri methodunauda bu arabaya eklemek ,sitiyorsak ovverride edece�iz

	@Override
	public void motor() {
		
		System.out.println("2.o Turbo");
	
		
	}

	@Override
	public void deri() {
		System.out.println("Ger�ek deeri koltuk");
	}
	
	
	

}
