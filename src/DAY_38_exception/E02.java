package DAY_38_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args)  throws IOException, ArithmeticException{
                                             //throws ArithmeticException aþaðýda try cats kullanmayýp
                                              // buray throw da yazsak hatayý yakalardý ma mesaj vermezdi


        /*
        1-ilk ders itibariyele FileNotFoundException ve IOException ý öðrendik
        -Bugün ise 3. exception olan ve matematiksel iþlemlerda hata yakalamaya yarayan  ArithmeticException ý göreceðiz
        -ArithmeticException -->run time eror ("Un-Checked Exception") dýr

        2--2 tip Exception vardýr; BÝRÝSÝ KOD YAZARKEN CTE verir
        -diðeri kýrmýzý alt çizgi vermez
        --Compile Time Eror veren Exceptionlara "Compile Time Exception veya "Checked Exception"denir
        --Compile Time Eror vermeyen Exeption lara  Run Time Exception veya "Un-Checked Exception" denir

        3-Compile Time Exception larda ya "throw" veya "try-catch" kullanmalýsýnýz aksi taktirde code calismaz
        -Run Time Exception larda isterseniz throw isterseniz try catch isterseniz hiçbir þey kullanmayýn sonucu aþaðý yadýrýr

        Yani Compile Time Exception lar handle edilmelidir, Run Time Exception lar handle edilmesede olur
        -
         */


        int a=12;
        int b=3;

        try {//önce burasý try olur çalýþýr sout içindeki iþlem yapýlýr

            //javaya try diyoruz 12 yi 3 e bölmeyi dene, eðer bölerken bir hata yaþarsan
            //önemli deðil kodu durdurma ben sane catch ile hatayý yakalmada yardým edeceðim
            //ne ile yardým edeceðim, matematik iþlemlerde yardýmcý olan AritmeticException ý ile yardým edeceðiim
            System.out.println(a/b);

        } catch(ArithmeticException e) {
            System.out.println("Payda sýfýr olmamalý, sayilar sýfýr a bölünemezler");
            //matematikte bölme iþlemi yaparken bir tehlike vardýr, oda sayýnýn(payda 0) 0 a bölünmesi tehlikesidir

        /*
        kodu çalýþtýrdýðýmýzda 4 verecektir
        **peki try kýsmý çalýþtý catch kýsmýndaki sout neden mesaj neden çalýþmadý
        *çünkü kullanýcý ilkemi doðru yaptý 0 a bölseydi catch devreye girip Java Exception throw eder(atar) mesajý yazdýracaktý
        *Bu exception ArithmeticException kullanýlarak (Handle) edilebilir
        paydayý 0 yapýp böldüðümüzde mesajý aldýk catch devreye girdi
            Payda sýfýr olmamalý, sayilar sýfýr a bölünemezler
         */

            /*

            diyelimki siz matematik iþlemind ekarekök isterisine -eksi -4 gibi eleman koydunuz catch bunu yaklar
            **çünkü karekök içerisi negatif sayý olamaz
             */

        }finally {
            System.out.println("finally block");

            /*
            -finnaly block yukarda b 0 olduðunda catch (catch block lardansonra) kýsmý çalýþtýktan sonrada çalýþýr

            -yukarda b kýsmý 3 olduðunda normal deðer için try çalýþýr catch çalýþmaz, çünkü try kýsmý normal,
             -finnally block kýsm yine çalýþýr

             * bunu þuna benziyor oðlunuz baþarýlý olsa tebrik edersiniz
             -baþarýsýz olsa daha da moral için heyecana getirisiniz

             *peki neden finally block kullanýyoruz,
             -cloud da yapýlan iþlemlerden sonra cloud ile connection ý kesmek için kesilmelidir
             -Cloud ile connection yazdýðýmýz code baþarýlý bir þekilde çalýþýrsa isimiz bittiði için kesilmelidir
             -yazdýðýmýz code Exception atarsa cloud ile connection yine kesilmeli ve code tamir edilmeli
             -cloud ile connection kesilmezse fatura pahalý olur, saniyeye para kesiyorlar
             fis.close(); gibi

             */
        }
    }



}

