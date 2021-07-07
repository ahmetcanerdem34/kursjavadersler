package DAY_21_scopeDevam;



	public class Scope6 {
	    public  int num1;//publice çevir her yerden ulaþýlsýn
	    public String name = "Ali";//acces modifirer yazýlmadýðý için default acces modifies gecerlidir
	    					//sadece paket içinde kullanýlabilir
	    
	    public static void main(String args){ 
	      add();
	    // product (5); static olmayan bir method static olan main method icerisinden cagrilamaz
	    }
	    
	    public static void add(){
	    // num1++; // static olmayan (instance) num1, static bir method icinden kullanilamaz
	    int num2 = 6;
	    char letter;
	    System.out.println("Do addition ");
	    }
	    
	    
	    public void product(int num3){
	    name = "Veli";
	     // num2++; // num2 ustteki methodda olusturulmus Local bir variable'dir. 
	    System.out.println(num3 * num3);
	    
	    
	    
	    /*
         * Static Variables : Class ici, main method disi olusturulur. Deger atamadan da olusturulabilir (Default).
         * Variable declare edilirken basinda static keyword kullanilmalidir.
         * Static variables class level'da olusturuldugu icin class'in icinden her yerden ulasilabilir.
         * Static olan veya olmayan her method'lardan direkt kullanilabilir.
         * Static variable'lar herkes icin gecerlidir. Herhangi bir yerden static variable'in degeri degistirilirse 
         * tum object icin yeni deger gecerli olur
         * Baska class'lardan static variable'lari kullanmak istersek obje olusturmaya gerek yoktur. 
         * Direkt ClassIsmi.variableIsmi veya ClassIsmi.methodIsmi yazarak kullanabiliriz
         * Java Run Time calistigi icin baska Class'lardan static variable'i kullandigimizda alacagi deger icin kodu yazmaya gerek yoktur.
         * Local (Method)  Variable : Bir method icinde olusturulan variable'lar sadece o method icin gecerlidir.
         * Eger birden fazla method'u ilgilendiren bir variable varsa CLASS LEVEL'da olusturulmalidir. (Static ya da instance olmasi 
         * programa gore bizim verecegimiz karara baglidir)
         * Deger atanmadan da olusturulabilir ancak deger atanmadan kullanilamaz. 
         * Loop Variable : Sadece olusturuldugu loop icerisinde gecerli olur. Disarida kullanilamaz.
         
*/
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
