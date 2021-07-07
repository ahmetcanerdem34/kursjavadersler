package DAY_43_interface;

public interface IcDonanim {
	
	/*
	 1-java �ntrerface ler i�indeki tum methodlar�n abstract methodlar olams� gerekti�ini bilir
	 -siz yazsan�zda abstract yazmasan�zda sorun olamz
	 
	 public abstract void koltuk(); ,ile bu  public abstract void koltuk();--< tam�yle ayn�d�r
	 
	 2-�nterface lerde hersey otomotai olarak public dir. b�u yuzden acces modifier oublic olarak yazsan�zda olur yazmasan�z da
	 -public abstract void koltuk();----ve public void koltuk();--- ve  void koltuk(); 3 de ayn�d�r
	 
	 3-normalde acces modifier yazma�nca access modifier "default"olur ama
	 -interface lerde access modifier her zamn public oldu�undan, access modifier� yazmasan�da o public tir
	 
	 */
	
	/*
	 1-interface deki tum variable ler final d�r
	 -final variable olu�turdu�unuzda bold olarak yaz�l�r
	 
	 2-public + static + final String marka="Honda"; ile String marka="Honda"; tamam�yle ayn�d�r, iter yaz ister yazma
	 
	 3-genel kullan�m olarak final variablelerin isimleri Buyuk harfla yaz�l�r
	 */
	int F�YAT=20000;
	
	
	public static final String MARKA="Honda";
	
	
	
	public abstract void koltuk();
	
	public void direksiyon();
	
	void ayna();

}
