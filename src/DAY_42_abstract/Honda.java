package DAY_42_abstract;

public abstract class Honda {
	
	//body si {} olmayan class a abstract denir., cinler melekler gibi body leri yok
	//bit methodu abstruct yaptýðýmýz zaman child lar onu mecbur kullanmak zorunda kalýrlar 
	//bir methoda body koymadýðýmýz zamn onu alan butun child lar onu kullnmak için body {} koymka zorundadýrlar
	
	
	/*
	 1- bazen child class lar parent clastaki methodlarýn body ler ideðiþteirere kkulanýrlar
	 -bu gibi durumlarda parent class taki method body i koymak anlamsýzdýr
	 -bu anlmasýzlýðý gidermek için Java bize body siz method uretme imkaný verir.
	 -Body siz methodlara abstruct method denir
	 
	 2-parent class taki body siz methodlarý(abstruclarý) child class lar override etmek zorundadýrlar(alýp kullnmak zorundadýrlar)
	 -biz bir application oluþtururken  child classlarý parent class daki bazý methodlarý override etmek zorunda býrakmak istersek
	 -o methodlarý abstruct method yaparýz
	 
	 3- aces modþfier den sonra abstract keywordunu koyunuz
	 
	 4-abstract methodlar sadece abstract class da oluþtrulur
	 
	 5-abstract class oluþturmak için acce modifierden sonra public ten sýonra abstrack keywordunu koyun
	 
	 6-abstruct keyword u ile method body bir arada kullanýlamaz
	 
	 7-abstruct class içerisinde hem abstract hem de abstruact(soyut) olmayan(concrete-somut-beton) methodlar da kullanýlabilir 
	 
	 8-bir concrete class abstract classs extend ettiðinde, abstruct class içindeki tum abstract  methodlarý ovverride etmek zorundadýr(motor)
	 -aksi takdirde CTE veriri Compile Time Error. fakat concrete methodlarý ovverride etmek istemesi isteðe baðlýdýr. (deri) meselesinde gördük
	 
	 9-bir abstract class baþka bir abstract class a extend edildiðinde override etmek zorunda deðildir, isterse ovveride etmer isterse etmez
	 
	 10-finall classlarýn child class ý olamaz. abstract class lar child class larar talimat vermek için oluþturulurlar
	 -eðer bir class final yaparsýnýz o class ýn child class ý olamayacaðýnda abstract olmasý mantýklý deðildir. 
	 -bu yuzden java abstract class larýn final olmasýna musade etmez
	 
	 11- abstract method uretmemýzýn sebebi child class larýn kullanýlabilmesidir. eðer mthodu finall yaparsak
	 -bu o method veeride edilemez demektir yani; child class lar kullanamz demektir. bu çeliþkiden dolayý
	 -Java abstract methodlarýn final olmasýna musade etmez
	 
	 12-abstract methodlar privite olmazlar cunkü, abstruct methodlar baþka class lardan kullanýlmak için üretilir
	 -halbuki private methodlar baþka class lar tarafýndan kullanýlmaz
	 
	 13- abstract methodlar static olamaz, çünkü staticler çünkü ovvrire edilemezler. halbuki biz abstruct methodlarý ovvride etmek için kullanýrýz
	
	 		ABSTRACT METHODLARDAN OBJE ÜRETÝLEMEZ!!!!!!!! 
	 */

	
	public abstract void motor();//abstruct method oluþtukturduk-- body koyamazsýn--abstract class içinde abstract olmayan body de kullanýlabilir
	//bu methodu static yapabilir miyim?
	
	public void deri() {
		System.out.println("Koltuklarý deri olsun");
		
	}
}
