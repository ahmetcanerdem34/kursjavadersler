package Java_PracticeDay2;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;
	import java.util.Scanner;

	public class SoruArray04 {

		public static void main(String[] args) {
			
			/*Rastgele kullanici adi olusturan JAVA kodu yaziniz.
			 *  1. Kullanicidan ismini isteyelim
			 *  2. Kullanici adindaki bosluklari silelim.
			 *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
			 *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
			 *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
			 */
			
			Scanner scan = new Scanner (System.in);
			System.out.println("kullanmak istediğiniz user name giriniz :");
			String username = scan.nextLine().trim();
			
			List<String> veriTabanindakiKullanicilar = new ArrayList<>();//veri tabanımızın listesien bakalım
			veriTabanindakiKullanicilar.add("Ayşe");
			veriTabanindakiKullanicilar.add("Şeyma");
			veriTabanindakiKullanicilar.add("Ayla");
			veriTabanindakiKullanicilar.add("Yayla");
			veriTabanindakiKullanicilar.add("Şule");
			veriTabanindakiKullanicilar.add("Kamil");
			
			// 3. adim
			
					boolean kullaniciIsmiVarMI = veriTabanindakiKullanicilar.contains(username);
					 
					// 4. adim 
					
					if(kullaniciIsmiVarMI) {
						System.out.println("Bu kullanici adi zaten alinmis.");
					}else {
						System.out.println("Bu kullanici adini kullanabilirsiniz");
					}
					
					if(kullaniciIsmiVarMI) {
						int rastgeleSayi = new Random().nextInt(100000);
						username = username + ""+rastgeleSayi;
						System.out.println("Yeni kullanici adi olarak bunu kullanabilirsiniz : " + username);
					}else {
						System.out.println("Yeni kullanici adi : " + username);
					}
					scan.close();	
					

					
				}
				
			}
			