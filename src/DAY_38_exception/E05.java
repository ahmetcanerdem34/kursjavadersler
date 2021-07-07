package DAY_38_exception;

public class E05 {

    public static void main(String[] args) {

        /*
        4.exceptions �m�z -->NumberFormatException RTE dir-->say� format�nda olmayan bir string i parseInt() methodu kullanarak
        //integer acevirmek istedi�imizde verilen hata exception �d�r, devreey girer
         */

        String s="123";//java sadece rakamlardan olu�an String leri say�ya �evirebiliriz,
        //Integer wrapper class�n�n i�inde parseInt() methodu kullan�r�z
        System.out.println(s+5);//1235
        int iS= Integer.parseInt(s);//sayiy� int e �evir ve iS e ata, a�a�� ge� string art�k say� toplama yap mesela
        System.out.println(iS + 5);//128 yukarda say�ya �evirmeden yapsayd�k concetination olurdu 1235

        String t="1a2b";//parseInt bunu say� yapamaz ��nk� parseInt sadece rakalmlardan olu�an� say�ya �eviriyordu
        //try catc att�k notu d��t�
            System.out.println(t + 5);//1a2b5

        try {
            int p=Integer.parseInt(t);//NumberFormatException RTE olarak verir
            System.out.println(t);
        }catch (NumberFormatException e){
            System.out.println("Say� format�nda olmayan biir stringi say�ya �evirmezsiniz" +
                    " rakam d���nda caracterler kullanm��s�n�z");
        }

    }
}
