package DAY_43_interface;

public class Civic extends Honda implements IcDonanim, Lastik{//claslarý parents yaparken extends, interface leri parents yaparken implements kullanýyoruz

		//claslarý bir clasýn parenti yaparken extends keyword u kullanýyoruz--
	    //interfaceleri bir classýn parents i yaparken implements keyword u kullanýyoruz
	
	@Override
	public void hareket() {
		System.out.println("hýzlý vee konomik hareket eder");
		
	}

	@Override
	public void koltuk() {
		System.out.println("0rtopedik koltuklarý var");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("deri hidrolik direksiyon");
		
	}

	@Override
	public void ayna() {
		System.out.println("otomatik kararma özelliði");
		
	}

	@Override
	public void far() {
		System.out.println("Led far");
		
	}

	@Override
	public void kaporta() {
		System.out.println("Psalanamz çelik");
		
	}

	@Override
	public void garanti() {
		System.out.println("100.000 km garanti");
		
	}

	@Override
	public void jant() {
		System.out.println("çelik jant");
		
	}

}
