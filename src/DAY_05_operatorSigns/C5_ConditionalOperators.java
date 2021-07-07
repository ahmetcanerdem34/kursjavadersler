package DAY_05_operatorSigns;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		
		//AND && , OR ||
		
		//AND VE OR NASIL ÇALIÞIR
		
		boolean isTrue=5>4 && 7-3>0;//java gelir = esaymýntý bulur, solda variable, saða bakar and i görür
		//2 tarafýný ayrý ayrý deðerlendirir
		//adn in saðý tru solu true=sonuç true verir= hepsi doðru 1 i false ise hepsi false olur
		//and operatörü mükemmeliyetçidir
		//hepsi true olacaksa olsun yoksa kabul etmiyorum false diyorum..
		
	   System.out.println(isTrue);
	   
	   int x=10;
	   int y=5;
	   
	   System.out.println(x/y==2 && x*y>20 && x-y>0);//hepsi true 
	   //true
	   
	   System.out.println(x+y<0 && x-y>0);//false + true=false
	   //false
	   
	   
	   //or || operatörü ise optimisttir
	   //verilen karþýlaþtýrmalardan bri true ise sonuç=true olur
	   
	   
	   System.out.println(x<y ||x+y<0 || x*y>0);//false false true
	   //true
	   
	   
		
	}

}
