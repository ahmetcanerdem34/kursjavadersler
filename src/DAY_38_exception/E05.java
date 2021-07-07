package DAY_38_exception;

public class E05 {

    public static void main(String[] args) {

        /*
        4.exceptions ýmýz -->NumberFormatException RTE dir-->sayý formatýnda olmayan bir string i parseInt() methodu kullanarak
        //integer acevirmek istediðimizde verilen hata exception ýdýr, devreey girer
         */

        String s="123";//java sadece rakamlardan oluþan String leri sayýya çevirebiliriz,
        //Integer wrapper classýnýn içinde parseInt() methodu kullanýrýz
        System.out.println(s+5);//1235
        int iS= Integer.parseInt(s);//sayiyý int e çevir ve iS e ata, aþaðý geç string artýk sayý toplama yap mesela
        System.out.println(iS + 5);//128 yukarda sayýya çevirmeden yapsaydýk concetination olurdu 1235

        String t="1a2b";//parseInt bunu sayý yapamaz çünkü parseInt sadece rakalmlardan oluþaný sayýya çeviriyordu
        //try catc attýk notu düþtü
            System.out.println(t + 5);//1a2b5

        try {
            int p=Integer.parseInt(t);//NumberFormatException RTE olarak verir
            System.out.println(t);
        }catch (NumberFormatException e){
            System.out.println("Sayý formatýnda olmayan biir stringi sayýya çevirmezsiniz" +
                    " rakam dýþýnda caracterler kullanmýþsýnýz");
        }

    }
}
