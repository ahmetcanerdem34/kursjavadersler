package DAY_42_abstract;

public class Civic extends Honda{// hondadaki motor methodunu kullanmadan izin vermez Source den override etmeliyiz

	
	
	@Override
	public void motor() {
		System.out.println("1.6 Eco");
		
	}

	//abstract yak�t methodunu olu�turun
	//olu�turanmay�z ��nk� abstruct method abstract class da olur
	
	
}
