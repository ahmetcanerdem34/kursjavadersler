package DAY_38_exception;

public class E01 {

    /*
    -Exception muhtemel dailinde hatayla kar��la�abilmek demek
     yapt���nz application da yapt���n�z her �ey kurallara uygun yap�ld�yasa, muhtemel hatalarda engellendiyse
     biz buna No exception diyoruz, her�ey halledilmi� demek

     -Sorunlar� kedisi hallediyorsa bun handling exception denir

     -Sorunu java kendisi halledemedi�inde yard�m istiyor buna java da throwing exception(hat atma)diyoruz

     -Java �al���rken farkl� erorlar olu�abilir SEBEPLER�
     1-Kodu yazan hatal� yazm�� olabilir public void div()(12/0)-- 12 0 a b�l�nmez bu bir yaz�c� hatas�
     2-Kullan�c� hatal� dat giri�i yap�yor olabilir int=2.5 double d�er girmrk gibi
     3-�ng�r�lemeyen hatal olabilir--�lkelerin internet h�zlar� applacion �al��t�rmaya bilir


     **hata olu�tu�unda Java �al��may� durdurur ve console bir hata mesaj� yazar
     *-buna exception atma manas�na gelen "throw an exception" denir.
     */
    /*
    1- FileNotFoundException -->ustunde �al���lacak bir dosyay ula�ma ad�na ya�anan problemlerde kullan�l�r
    -bir dosyay ula�mada 2 problemle kar��la��l�r 1.si ya PATH uanl��t�r  2.si ya da DOSYA S�L�NM��T�R
    -FileNotFoundException eklendi�i zaman java ya sen rahat ol ben bulunamam ihtimalinide ekledim diyoruz

    2- IOException(io,ayo exception)-->input ve output ile alakal� tum problemlerde kullan�l�r
    -bir dosyya ula�ma esnas�nda ula��p �nput output yapaca�� i�in burdaki problemleride ��zer IOException
    -biz �ncesinde FileNotFountException diye bir exception att�ysak, �oexception u attt���m�zda java di�erini s�ler
    -��nk� IOException;FileNotException n�nda yapaca�� i�lemleri g�r�r
    -k�sacas� IOException calass --FileNotFoundException class�n �n PARENT IDIR
    -biz IOException � att���m�zda di�eri yukarda sar� alt �izgi verir, java derki kutupkhaneden �a��rd�n
    -ama kullanmaya gerek kalmad� demektedir

	3-code yazarken exception yazmak zorunda kal�rsak 2 yol var
	*1.Add throws declaration -->problem olu�tu�nda console teknik mesajlar yazar
	*2.Try-Catch Bloc --> Problem  olu�tu�unda ekrana ne yaz�lac�a�na veya problemle alakl� ne yap�laca��na bizim
	-karar vermmemizi sa�lar

	4-Try-catch kullan�ld���nda try bolumundaki kod hatas�z �al���rsa catch b�l�m� �al��maz
	-catch bolumu, try bolumundeki kod hatal�yken devreye girer.


	5-try bloctan sonra 1 veya dah fazla catch kullan�labilir. olu�an problem hangi catch ile alakal� ise o catch bloc cal���r.
	-Ayn� anda ise sadece 1 catch blok �al���r.

	6-Aralar�nda parent child ili�kisi olan birden faazla catch bloc kullan�rsan�z, child olan �ste yaz�lmal�d�r. CTE al�rs�n�z

	7-parent child ili�kisi yoksa istedi�iniz gibi s�ralayabillirsiniz

	8-tyr olup catch in olmamas� gibi bir durum olur mu?-- olmaz, try dan sonra en az bir tane catch kullan�lmal�d�r, yoksa CTE al�rs�n�z

	�zet: Bug�n 2 tane exceptions ogrendik.
	1-throws--> ekrana teknik mesaj d���r�yor
	2-try catch-->ekrana bizim istedi�imiz mesaj� uyar� mesj�n� d���yor

	**bu nedenle try catch kullanmak daha FAYDALIDIR

     */

    //FileInputStream--->file dosya demek, Input girdi demek, stream de ak�� demek, �elaleye strem denir

    //bu k�s�m(FileInputStream) dosyay girdi yapmakla alakl� biir class--bu class dan bir obje olu�tural�m
    //neden olu�turuyoruz, bu class i�erisnide bir s�r� method var,
    // onlara (static olmayan methodlara) ula�mam i�in obje olu�turuyorduk hat�rlay�n, objenin isminide fis koyal�m
    //hata verdi�inde inport etmek gerekir , daha �nceleri util olurken imdi io(iyo) oldu nedeni yukarda yaz�yor
    //input ettikten sonra hata sa�da devam ediyor, sebebi construct�r-->i�erisine parametre koymal�y�m
    //i�erisine dosya adresi girmeliyiz ��nk� file


    // FileInputStream fis= new FileInputStream("src/exceptions/TextFileTr");


    /*
    -m�lakatlarda sorarlar ka�tane exception class � biliyorsun, 10 a yak�n
    1- FileNotFoundException -->bir dosyay ula�mak istedi�imizde kullan�l�r.Dosyan�n path i yanl��sa FileNotFoundException devrey girer
*/
     /*
    throw ile throws aras�ndaki farklar nelerdir
    1-throws method parantezinin kapan�� parantezi ile method body nin ac�l�� parantezi aras�nda kullan�l�r
    public static void main(String[] args) throws burda{

    2- throw method body n�n i�inde{}
     if(age<0) {
            throw new IllegalArgumentException();
        }else System.out.println(age);

    *throws key wordunden sonra 1 den fazla Exception yaz�labilir. throws sonundaki s den anla��l�r
     public class E02 {
    public static void main(String[] args)  throws IOException, ArithmeticException{

    *throws keywordunden sonra sadece Exxception class �n ismini(ArithmeticException) yazar�z  fakat throw keywordunda sonra
    Exception class �ndan obje olu�tururuz
      -throw new IllegalArgumentException(); new den sonra obje

    *throws key wordu methodun ilk  sat�r�ndan sonra sadece 1 kere kullan�labilir ama throw keywordu method body si
    -i�inde nerede Exception atmak istersek orada sistedi�imiz kadar kullan�labilir

    if(age<0) {
            throw new IllegalArgumentException();
        }else System.out.println(age);
        throw new IllegalArgumentException();
        throw new IllegalArgumentException();--buna hata veriri bir ustte var ya der
     */





}
