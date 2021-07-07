package DAY_37;

public class Isci extends Personel{
	
	public String bolum="Kaynak Atolyesi";
	public int maas=5000;
	public String isim="Mesut";
	//2 de method olu�tural�m
	
	
	  public int maasHesapla() {
	        return 30*8*15; // 30 gun sayisi, 8 gunluk mesai,15 saat ucreti
	    }
	    
	    public void mesai() {
	        System.out.println("isciler gunluk 8 saat calisir");
	    }
	    
	    // overloading : ayni isimde ama farkli method signature'larina sahip methodlar
	    public int maasHesapla(int gunSayisi) {
	        
	        return gunSayisi*8*15;
	    }
	    public int maasHesapla(int gunlukCalismaSaati,int gunSayisi) {
	        
	        return gunSayisi*gunlukCalismaSaati*15;
	    }
	    public int maasHesapla(int gunlukCalismaSaati,int gunSayisi,int saatUcreti) {
	        return gunSayisi*gunlukCalismaSaati*saatUcreti;
		/*
			     * Overloading icin signature degismelidir. Signature'in degismesi icin ne yapmaliyim ? Farkli parametreler girmeliyim .
			     * Birinin method'unun parametresi yok, birinde int gunSayisi var . Bir tane daha method olusturup parametlesini
			     * int gunlukCalismaSaati yazsam bile itiraz edecek cunku olusturamayiz, 2 tane tek parametreli method signature'i degistirmez.
			     * Extradan 1 tane daha parametre eklersek olur, bkz : int gunlukCalismaSaati,int gunSayisi.
			     * Ayni sekilde parametre sayisini arttirarak OverLoading yapabiliriz.
			     */	
		
}
	
	
	
	
	
	
	
	
	
}