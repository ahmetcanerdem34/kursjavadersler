package DAY_38_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args)  throws IOException, ArithmeticException{
                                             //throws ArithmeticException a�a��da try cats kullanmay�p
                                              // buray throw da yazsak hatay� yakalard� ma mesaj vermezdi


        /*
        1-ilk ders itibariyele FileNotFoundException ve IOException � ��rendik
        -Bug�n ise 3. exception olan ve matematiksel i�lemlerda hata yakalamaya yarayan  ArithmeticException � g�rece�iz
        -ArithmeticException -->run time eror ("Un-Checked Exception") d�r

        2--2 tip Exception vard�r; B�R�S� KOD YAZARKEN CTE verir
        -di�eri k�rm�z� alt �izgi vermez
        --Compile Time Eror veren Exceptionlara "Compile Time Exception veya "Checked Exception"denir
        --Compile Time Eror vermeyen Exeption lara  Run Time Exception veya "Un-Checked Exception" denir

        3-Compile Time Exception larda ya "throw" veya "try-catch" kullanmal�s�n�z aksi taktirde code calismaz
        -Run Time Exception larda isterseniz throw isterseniz try catch isterseniz hi�bir �ey kullanmay�n sonucu a�a�� yad�r�r

        Yani Compile Time Exception lar handle edilmelidir, Run Time Exception lar handle edilmesede olur
        -
         */


        int a=12;
        int b=3;

        try {//�nce buras� try olur �al���r sout i�indeki i�lem yap�l�r

            //javaya try diyoruz 12 yi 3 e b�lmeyi dene, e�er b�lerken bir hata ya�arsan
            //�nemli de�il kodu durdurma ben sane catch ile hatay� yakalmada yard�m edece�im
            //ne ile yard�m edece�im, matematik i�lemlerde yard�mc� olan AritmeticException � ile yard�m edece�iim
            System.out.println(a/b);

        } catch(ArithmeticException e) {
            System.out.println("Payda s�f�r olmamal�, sayilar s�f�r a b�l�nemezler");
            //matematikte b�lme i�lemi yaparken bir tehlike vard�r, oda say�n�n(payda 0) 0 a b�l�nmesi tehlikesidir

        /*
        kodu �al��t�rd���m�zda 4 verecektir
        **peki try k�sm� �al��t� catch k�sm�ndaki sout neden mesaj neden �al��mad�
        *��nk� kullan�c� ilkemi do�ru yapt� 0 a b�lseydi catch devreye girip Java Exception throw eder(atar) mesaj� yazd�racakt�
        *Bu exception ArithmeticException kullan�larak (Handle) edilebilir
        payday� 0 yap�p b�ld���m�zde mesaj� ald�k catch devreye girdi
            Payda s�f�r olmamal�, sayilar s�f�r a b�l�nemezler
         */

            /*

            diyelimki siz matematik i�lemind ekarek�k isterisine -eksi -4 gibi eleman koydunuz catch bunu yaklar
            **��nk� karek�k i�erisi negatif say� olamaz
             */

        }finally {
            System.out.println("finally block");

            /*
            -finnaly block yukarda b 0 oldu�unda catch (catch block lardansonra) k�sm� �al��t�ktan sonrada �al���r

            -yukarda b k�sm� 3 oldu�unda normal de�er i�in try �al���r catch �al��maz, ��nk� try k�sm� normal,
             -finnally block k�sm yine �al���r

             * bunu �una benziyor o�lunuz ba�ar�l� olsa tebrik edersiniz
             -ba�ar�s�z olsa daha da moral i�in heyecana getirisiniz

             *peki neden finally block kullan�yoruz,
             -cloud da yap�lan i�lemlerden sonra cloud ile connection � kesmek i�in kesilmelidir
             -Cloud ile connection yazd���m�z code ba�ar�l� bir �ekilde �al���rsa isimiz bitti�i i�in kesilmelidir
             -yazd���m�z code Exception atarsa cloud ile connection yine kesilmeli ve code tamir edilmeli
             -cloud ile connection kesilmezse fatura pahal� olur, saniyeye para kesiyorlar
             fis.close(); gibi

             */
        }
    }



}

