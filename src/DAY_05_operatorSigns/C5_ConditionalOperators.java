package DAY_05_operatorSigns;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		
		//AND && , OR ||
		
		//AND VE OR NASIL �ALI�IR
		
		boolean isTrue=5>4 && 7-3>0;//java gelir = esaym�nt� bulur, solda variable, sa�a bakar and i g�r�r
		//2 taraf�n� ayr� ayr� de�erlendirir
		//adn in sa�� tru solu true=sonu� true verir= hepsi do�ru 1 i false ise hepsi false olur
		//and operat�r� m�kemmeliyet�idir
		//hepsi true olacaksa olsun yoksa kabul etmiyorum false diyorum..
		
	   System.out.println(isTrue);
	   
	   int x=10;
	   int y=5;
	   
	   System.out.println(x/y==2 && x*y>20 && x-y>0);//hepsi true 
	   //true
	   
	   System.out.println(x+y<0 && x-y>0);//false + true=false
	   //false
	   
	   
	   //or || operat�r� ise optimisttir
	   //verilen kar��la�t�rmalardan bri true ise sonu�=true olur
	   
	   
	   System.out.println(x<y ||x+y<0 || x*y>0);//false false true
	   //true
	   
	   
		
	}

}
