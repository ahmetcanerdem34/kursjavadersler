package DAY_38_exception;

public class E03 {
    public static void main(String[] args) {

        /*
        NullPointerException
        Null Pointer Exception di�er exception �m�z

         */
        String s = "";//i�inde karaktersizlik var s�f�rd�r yani
        System.out.println(s.length());//say�� 0 verir

        String t = null;//java heap e gider null konteyn�r�n� bulur ve bakar ki hi�bir �ey yok
        // ve run time eror ("Un-Checked Exception")verir beni bo� �eye g�ndeermi�sin diye, yukardada gitti ""t�rnak buldu ve s�f�r g�rd�
        //ne yapar�z hatay� handle etmek i�in try catch yazar�z

        try {
            System.out.println(t.length());
        } catch (NullPointerException e) {
            System.out.println("Null stringlerde length methodu kullan�lamaz");

        }
    }
}