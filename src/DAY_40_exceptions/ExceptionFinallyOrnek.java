package DAY_40_exceptions;

public class ExceptionFinallyOrnek {

	public static void main(String[] args) {
		
		
		  String s = "";
	        try {
	            s+="t";
	        } catch (Exception e) {
	            s+="c";
	        } finally {
	            s+="f";
	        }
	        s+="a";
	        System.out.print(s);
	        /*
	         * try blogu s String'ine t eklemeye calisir. sadece t oldu (hiclige ekledi).
	         * try calistigi icin catch calismaz o yuzden "c" eklemedik String'imize.
	         * Finally her durumda calisacagi icin "f" ekleyecektir. String'imiz ta oldu.
	         * a bloglar disinda oldugu icin gene calisacak String'e ekleyecek ve tfa olur cevabim.
	         */
	        /*
	        1) try blogu sadece catch blogu ile kullanilmalidir. => False 
	        2) finally blogu mutlaka calisir. =>  True 
	        3) Bir try blogu ile birden fazla catch blogu calistirilabilir. => True 
	        4) Birden fazla catch blok varsa, child olan once yazilmalidir. => True Cunku parent yukarda yazilirsa Child'a is dusmez.
	        5) FileNotFoundException nedir?
	          Ya bulamazsam idi.
	          Programimizda bir dosyayi okumaya calisiyorken, dosya bulunamazsa olusur. IOException’in subclass’idir.
	        
	        6) IOException nedir?
	          FileNotFoundException'in parent'idir. Input ve Output ile ilgili IOException vardir.
	          Programimizda bir file’a input/output yapiliyorsa ve program calisirken bir problem cikarsa olusur.
	          Checked exception’dir ve kod yazilirken mutlaka handle edilmelidir.
	          */

	}

}
