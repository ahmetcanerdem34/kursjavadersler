package DAY_43_interface;

public class Civic extends Honda implements IcDonanim, Lastik{//claslar� parents yaparken extends, interface leri parents yaparken implements kullan�yoruz

		//claslar� bir clas�n parenti yaparken extends keyword u kullan�yoruz--
	    //interfaceleri bir class�n parents i yaparken implements keyword u kullan�yoruz
	
	@Override
	public void hareket() {
		System.out.println("h�zl� vee konomik hareket eder");
		
	}

	@Override
	public void koltuk() {
		System.out.println("0rtopedik koltuklar� var");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("deri hidrolik direksiyon");
		
	}

	@Override
	public void ayna() {
		System.out.println("otomatik kararma �zelli�i");
		
	}

	@Override
	public void far() {
		System.out.println("Led far");
		
	}

	@Override
	public void kaporta() {
		System.out.println("Psalanamz �elik");
		
	}

	@Override
	public void garanti() {
		System.out.println("100.000 km garanti");
		
	}

	@Override
	public void jant() {
		System.out.println("�elik jant");
		
	}

}
