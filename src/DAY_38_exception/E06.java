package DAY_38_exception;

public class E06 {
    public static void main(String[] args) {

        Object obj= new Object();//OBJECT CLASS JAVA DA BUTUN CLASS LARIN PARENT TÝDÝR,
                                // parenti olmayan tek class dýr
        try {
            String sObj = (String) obj;//onject clasýndan bir þeyi stringe çevirmek istiyoruz
            //ClassCastException obje classý string class a çevirirken hata oluþturuyor try atalým
        }catch (ClassCastException e){
            System.out.println("Object data typý Strýng data typýna çevrilemez");

            /*
            ClassCastException ==biribirine dönüþtürülemeyen data typlar birbirine dönüþtürülmek istendiðinde
            -bu exception devreye girer
            ORNEGÝN: Onject data typý String data typýna donuþturülemez, illa dönüþtür dersek java ClassCastException der


             */
        }
    }
}
