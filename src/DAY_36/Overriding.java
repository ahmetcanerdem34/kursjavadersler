package DAY_36;

public class Overriding {
	
	/*
	 -overriding ne yapar
	 1-parent clasdaki bir methodu child class a göre ozelleþtirirek kulanmak isterseniz "overriding" yapabilirisiniz
	 2-overriding yaparken method signuture dokunulmaz method signuture(name+parametre), 
	 3-overriding yaparken acces modifierler belli kurallara göre dðiþtirilebilir
	 4- overriding yaparken bellli kurallara göre deðiþtirilebilir
	 5-overriding yaparken method body deðiþtirilir, zaten overriding in amacý budur, ama method body deðiþtirmeden kullanamk isterseniz CTE vermez java
	 -eðer kullanmayacaksan mantýksýz gelir, niçin kullanmaycaksýn o aman overriding yapma
	 6-0verriding child ve parent arasýnda olur-parent-child releationship(inheritance)gerkir, olmadan olmaz
	 7-override edilen method asýl olan edilendir yani parent deki dir, jada buna overriden method edilen demektir
	 -child class daki ise overriding olarak adlandýrýlan kýsýmdýr
	 
	 
	 8-ÖNMELÝ: overriding method child daki acces modifiri oaverridde ile ya ayný olur ya da daha geniþ olur
	 
	 9- return typ lar PRÝMÝTÝVE  ise overriding method un rturn typý overriden method ile ayný olmalýdýr 
	 10-overridden n return typý vois ise overidiining kide void olmalýdýr
	 
	 11-return type Wrapper Class ise overriding method unun return type  overrriden ile ayný olmalýdýr
	 
	 12-Retur type lar arasýnda parent-child relationship varsa
	 -overriding method un return typ ý ya overrididden method ile ayný yada overridden methodun child classý olmalý
	 
	 13-stattic methodlar override edilemezler, stat,c ler ortak kullanýlmýdýr, herkes için ortaktýr, deðiþtirisen herkes için deðiþir
	 
	 14-final methodlar da override edilemez
	 -bir method final sa zaten artýk en son kamil haldedir artýk onu deðiþtiremezsin animalda final dedin cocukta yapamazsýn
	 
	 15-private ler override edilemezler, çünkü private baþka class da kullanýlmaz
	 
	 12=Plymorphism nedir? çok biçimlilik tir
	    !!--->overloading ve overridding ten oluþur==farký nedir
	    overloading==> public void add(){}
	    			   public void add(int i){}
					   public void add(int i, String s){}
	    overriding==>  public void multply(){syso("3*4")}		   
	                   public void multply(){syso("1*4*3*4")}	
	    
	    
	    overlooading ve overrriding arasýnadaki farklar nelerdir
	    
	    1-overloading de method signature (name+parametre) paametre deðiþtirilirdeðiþtirilebilir
	    -overridding te method signature a dokunulmaz
	    
	    2- overlooading te method body genellikle deðiþtirilmez
	    -overriding de method body hemen hemn herzamn deðiþtrilir
	    
	    3-overloading de inheritance gerekmez,
	    -ovarridding de inheritance þartýr
	    
	    4-overlooading compile time polymorphism dir
	    -overriding run time polymorphisimdir
	    
	    5-private methodlar overload edilebilirler çünkü ayný class tayýz, overide de edilemez
	    -static methodlar overload edilebilirler ama override edilemezle
	    -final methodlar overload edilebilir çünkü yeni bir method oluþturuyorsun, 
	    --override edileemzler çünkü baþka class da final olan bir þeye yeni bir þey koyuyorsun
	
					   
	 */

}
