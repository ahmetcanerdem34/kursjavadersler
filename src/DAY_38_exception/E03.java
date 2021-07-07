package DAY_38_exception;

public class E03 {
    public static void main(String[] args) {

        /*
        NullPointerException
        Null Pointer Exception diðer exception ýmýz

         */
        String s = "";//içinde karaktersizlik var sýfýrdýr yani
        System.out.println(s.length());//sayýý 0 verir

        String t = null;//java heap e gider null konteynýrýný bulur ve bakar ki hiçbir þey yok
        // ve run time eror ("Un-Checked Exception")verir beni boþ þeye gçndeermiþsin diye, yukardada gitti ""týrnak buldu ve sýfýr gördü
        //ne yaparýz hatayý handle etmek için try catch yazarýz

        try {
            System.out.println(t.length());
        } catch (NullPointerException e) {
            System.out.println("Null stringlerde length methodu kullanýlamaz");

        }
    }
}