package DAY_38_exception;

public class E01 {

    /*
    -Exception muhtemel dailinde hatayla karþýlaþabilmek demek
     yaptýðýnz application da yaptýðýnýz her þey kurallara uygun yapýldýyasa, muhtemel hatalarda engellendiyse
     biz buna No exception diyoruz, herþey halledilmiþ demek

     -Sorunlarý kedisi hallediyorsa bun handling exception denir

     -Sorunu java kendisi halledemediðinde yardým istiyor buna java da throwing exception(hat atma)diyoruz

     -Java çalýþýrken farklý erorlar oluþabilir SEBEPLERÝ
     1-Kodu yazan hatalý yazmýþ olabilir public void div()(12/0)-- 12 0 a bölünmez bu bir yazýcý hatasý
     2-Kullanýcý hatalý dat giriþi yapýyor olabilir int=2.5 double dðer girmrk gibi
     3-Öngörülemeyen hatal olabilir--ülkelerin internet hýzlarý applacion çalýþtýrmaya bilir


     **hata oluþtuðunda Java çalýþmayý durdurur ve console bir hata mesajý yazar
     *-buna exception atma manasýna gelen "throw an exception" denir.
     */
    /*
    1- FileNotFoundException -->ustunde çalýþýlacak bir dosyay ulaþma adýna yaþanan problemlerde kullanýlýr
    -bir dosyay ulaþmada 2 problemle karþýlaþýlýr 1.si ya PATH uanlýþtýr  2.si ya da DOSYA SÝLÝNMÝÞTÝR
    -FileNotFoundException eklendiði zaman java ya sen rahat ol ben bulunamam ihtimalinide ekledim diyoruz

    2- IOException(io,ayo exception)-->input ve output ile alakalý tum problemlerde kullanýlýr
    -bir dosyya ulaþma esnasýnda ulaþýp ýnput output yapacaðý için burdaki problemleride çözer IOException
    -biz öncesinde FileNotFountException diye bir exception attýysak, ýoexception u atttýðýmýzda java diðerini sþler
    -çünkü IOException;FileNotException nýnda yapacaðý iþlemleri görür
    -kýsacasý IOException calass --FileNotFoundException classýn ýn PARENT IDIR
    -biz IOException ý attýðýmýzda diðeri yukarda sarý alt çizgi verir, java derki kutupkhaneden çaðýrdýn
    -ama kullanmaya gerek kalmadý demektedir

	3-code yazarken exception yazmak zorunda kalýrsak 2 yol var
	*1.Add throws declaration -->problem oluþtuðnda console teknik mesajlar yazar
	*2.Try-Catch Bloc --> Problem  oluþtuðunda ekrana ne yazýlacðaýna veya problemle alaklý ne yapýlacaðýna bizim
	-karar vermmemizi saðlar

	4-Try-catch kullanýldýðýnda try bolumundaki kod hatasýz çalýþýrsa catch bölümü çalýþmaz
	-catch bolumu, try bolumundeki kod hatalýyken devreye girer.


	5-try bloctan sonra 1 veya dah fazla catch kullanýlabilir. oluþan problem hangi catch ile alakalý ise o catch bloc calýþýr.
	-Ayný anda ise sadece 1 catch blok çalýþýr.

	6-Aralarýnda parent child iliþkisi olan birden faazla catch bloc kullanýrsanýz, child olan üste yazýlmalýdýr. CTE alýrsýnýz

	7-parent child iliþkisi yoksa istediðiniz gibi sýralayabillirsiniz

	8-tyr olup catch in olmamasý gibi bir durum olur mu?-- olmaz, try dan sonra en az bir tane catch kullanýlmalýdýr, yoksa CTE alýrsýnýz

	Özet: Bugün 2 tane exceptions ogrendik.
	1-throws--> ekrana teknik mesaj düþürüyor
	2-try catch-->ekrana bizim istediðimiz mesajý uyarý mesjýný düþüyor

	**bu nedenle try catch kullanmak daha FAYDALIDIR

     */

    //FileInputStream--->file dosya demek, Input girdi demek, stream de akýþ demek, þelaleye strem denir

    //bu kýsým(FileInputStream) dosyay girdi yapmakla alaklý biir class--bu class dan bir obje oluþturalým
    //neden oluþturuyoruz, bu class içerisnide bir sürü method var,
    // onlara (static olmayan methodlara) ulaþmam için obje oluþturuyorduk hatýrlayýn, objenin isminide fis koyalým
    //hata verdiðinde inport etmek gerekir , daha önceleri util olurken imdi io(iyo) oldu nedeni yukarda yazýyor
    //input ettikten sonra hata saðda devam ediyor, sebebi constructýr-->içerisine parametre koymalýyým
    //içerisine dosya adresi girmeliyiz çünkü file


    // FileInputStream fis= new FileInputStream("src/exceptions/TextFileTr");


    /*
    -mülakatlarda sorarlar kaçtane exception class ý biliyorsun, 10 a yakýn
    1- FileNotFoundException -->bir dosyay ulaþmak istediðimizde kullanýlýr.Dosyanýn path i yanlýþsa FileNotFoundException devrey girer
*/
     /*
    throw ile throws arasýndaki farklar nelerdir
    1-throws method parantezinin kapanýþ parantezi ile method body nin acýlýþ parantezi arasýnda kullanýlýr
    public static void main(String[] args) throws burda{

    2- throw method body nýn içinde{}
     if(age<0) {
            throw new IllegalArgumentException();
        }else System.out.println(age);

    *throws key wordunden sonra 1 den fazla Exception yazýlabilir. throws sonundaki s den anlaþýlýr
     public class E02 {
    public static void main(String[] args)  throws IOException, ArithmeticException{

    *throws keywordunden sonra sadece Exxception class ýn ismini(ArithmeticException) yazarýz  fakat throw keywordunda sonra
    Exception class ýndan obje oluþtururuz
      -throw new IllegalArgumentException(); new den sonra obje

    *throws key wordu methodun ilk  satýrýndan sonra sadece 1 kere kullanýlabilir ama throw keywordu method body si
    -içinde nerede Exception atmak istersek orada sistediðimiz kadar kullanýlabilir

    if(age<0) {
            throw new IllegalArgumentException();
        }else System.out.println(age);
        throw new IllegalArgumentException();
        throw new IllegalArgumentException();--buna hata veriri bir ustte var ya der
     */





}
