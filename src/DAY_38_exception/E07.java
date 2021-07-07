package DAY_38_exception;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {

        /*IllegalArgumentExcception=0 kurallara uymayan say�lar girildi�inde devreye girer
        -IllegalArgumentException class � kullan�lmas�n� istemedi�imiz de�erlerde program�m�z�n hata vermesini
        -istiyorsak devreye girer
        Mesela ya� i�in negatif say�lar�n giirilmesi do�ru de�ildir
        -kullan�c� eksi say� girdi�inde progrs hata vermelidir
        -bunu IllegalArgumentException() kullanarak temein edebiliriz
        -RTE verir

         */

        Scanner scan= new Scanner (System.in);
        System.out.println("ya��n�z� giriniz :");
        int age=scan.nextInt();

        if(age<0) {
            throw new IllegalArgumentException();
        }else System.out.println(age);

        //try catch de atabiliriz
            /*
            ya��n�z� giriniz :
-4
Exception in thread "main" java.lang.IllegalArgumentException
	at DAY_38_exception.E07.main(E07.java:15)
             */
        }
    }


