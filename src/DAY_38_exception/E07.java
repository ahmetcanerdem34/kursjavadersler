package DAY_38_exception;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {

        /*IllegalArgumentExcception=0 kurallara uymayan sayýlar girildiðinde devreye girer
        -IllegalArgumentException class ý kullanýlmasýný istemediðimiz deðerlerde programýmýzýn hata vermesini
        -istiyorsak devreye girer
        Mesela yaþ için negatif sayýlarýn giirilmesi doðru deðildir
        -kullanýcý eksi sayý girdiðinde progrs hata vermelidir
        -bunu IllegalArgumentException() kullanarak temein edebiliriz
        -RTE verir

         */

        Scanner scan= new Scanner (System.in);
        System.out.println("yaþýnýzý giriniz :");
        int age=scan.nextInt();

        if(age<0) {
            throw new IllegalArgumentException();
        }else System.out.println(age);

        //try catch de atabiliriz
            /*
            yaþýnýzý giriniz :
-4
Exception in thread "main" java.lang.IllegalArgumentException
	at DAY_38_exception.E07.main(E07.java:15)
             */
        }
    }


