package DAY_36;

public class Overriding {
	
	/*
	 -overriding ne yapar
	 1-parent clasdaki bir methodu child class a g�re ozelle�tirirek kulanmak isterseniz "overriding" yapabilirisiniz
	 2-overriding yaparken method signuture dokunulmaz method signuture(name+parametre), 
	 3-overriding yaparken acces modifierler belli kurallara g�re d�i�tirilebilir
	 4- overriding yaparken bellli kurallara g�re de�i�tirilebilir
	 5-overriding yaparken method body de�i�tirilir, zaten overriding in amac� budur, ama method body de�i�tirmeden kullanamk isterseniz CTE vermez java
	 -e�er kullanmayacaksan mant�ks�z gelir, ni�in kullanmaycaks�n o aman overriding yapma
	 6-0verriding child ve parent aras�nda olur-parent-child releationship(inheritance)gerkir, olmadan olmaz
	 7-override edilen method as�l olan edilendir yani parent deki dir, jada buna overriden method edilen demektir
	 -child class daki ise overriding olarak adland�r�lan k�s�md�r
	 
	 
	 8-�NMEL�: overriding method child daki acces modifiri oaverridde ile ya ayn� olur ya da daha geni� olur
	 
	 9- return typ lar PR�M�T�VE  ise overriding method un rturn typ� overriden method ile ayn� olmal�d�r 
	 10-overridden n return typ� vois ise overidiining kide void olmal�d�r
	 
	 11-return type Wrapper Class ise overriding method unun return type  overrriden ile ayn� olmal�d�r
	 
	 12-Retur type lar aras�nda parent-child relationship varsa
	 -overriding method un return typ � ya overrididden method ile ayn� yada overridden methodun child class� olmal�
	 
	 13-stattic methodlar override edilemezler, stat,c ler ortak kullan�lm�d�r, herkes i�in ortakt�r, de�i�tirisen herkes i�in de�i�ir
	 
	 14-final methodlar da override edilemez
	 -bir method final sa zaten art�k en son kamil haldedir art�k onu de�i�tiremezsin animalda final dedin cocukta yapamazs�n
	 
	 15-private ler override edilemezler, ��nk� private ba�ka class da kullan�lmaz
	 
	 12=Plymorphism nedir? �ok bi�imlilik tir
	    !!--->overloading ve overridding ten olu�ur==fark� nedir
	    overloading==> public void add(){}
	    			   public void add(int i){}
					   public void add(int i, String s){}
	    overriding==>  public void multply(){syso("3*4")}		   
	                   public void multply(){syso("1*4*3*4")}	
	    
	    
	    overlooading ve overrriding aras�nadaki farklar nelerdir
	    
	    1-overloading de method signature (name+parametre) paametre de�i�tirilirde�i�tirilebilir
	    -overridding te method signature a dokunulmaz
	    
	    2- overlooading te method body genellikle de�i�tirilmez
	    -overriding de method body hemen hemn herzamn de�i�trilir
	    
	    3-overloading de inheritance gerekmez,
	    -ovarridding de inheritance �art�r
	    
	    4-overlooading compile time polymorphism dir
	    -overriding run time polymorphisimdir
	    
	    5-private methodlar overload edilebilirler ��nk� ayn� class tay�z, overide de edilemez
	    -static methodlar overload edilebilirler ama override edilemezle
	    -final methodlar overload edilebilir ��nk� yeni bir method olu�turuyorsun, 
	    --override edileemzler ��nk� ba�ka class da final olan bir �eye yeni bir �ey koyuyorsun
	
					   
	 */

}
