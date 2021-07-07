package DAY_43_interface;

public interface IcDonanim {
	
	/*
	 1-java ýntrerface ler içindeki tum methodlarýn abstract methodlar olamsý gerektiðini bilir
	 -siz yazsanýzda abstract yazmasanýzda sorun olamz
	 
	 public abstract void koltuk(); ,ile bu  public abstract void koltuk();--< tamýyle aynýdýr
	 
	 2-ýnterface lerde hersey otomotai olarak public dir. býu yuzden acces modifier oublic olarak yazsanýzda olur yazmasanýz da
	 -public abstract void koltuk();----ve public void koltuk();--- ve  void koltuk(); 3 de aynýdýr
	 
	 3-normalde acces modifier yazmaýnca access modifier "default"olur ama
	 -interface lerde access modifier her zamn public olduðundan, access modifierý yazmasanýda o public tir
	 
	 */
	
	/*
	 1-interface deki tum variable ler final dýr
	 -final variable oluþturduðunuzda bold olarak yazýlýr
	 
	 2-public + static + final String marka="Honda"; ile String marka="Honda"; tamamýyle aynýdýr, iter yaz ister yazma
	 
	 3-genel kullaným olarak final variablelerin isimleri Buyuk harfla yazýlýr
	 */
	int FÝYAT=20000;
	
	
	public static final String MARKA="Honda";
	
	
	
	public abstract void koltuk();
	
	public void direksiyon();
	
	void ayna();

}
