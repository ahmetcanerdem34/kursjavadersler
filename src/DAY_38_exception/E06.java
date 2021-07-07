package DAY_38_exception;

public class E06 {
    public static void main(String[] args) {

        Object obj= new Object();//OBJECT CLASS JAVA DA BUTUN CLASS LARIN PARENT T�D�R,
                                // parenti olmayan tek class d�r
        try {
            String sObj = (String) obj;//onject clas�ndan bir �eyi stringe �evirmek istiyoruz
            //ClassCastException obje class� string class a �evirirken hata olu�turuyor try atal�m
        }catch (ClassCastException e){
            System.out.println("Object data typ� Str�ng data typ�na �evrilemez");

            /*
            ClassCastException ==biribirine d�n��t�r�lemeyen data typlar birbirine d�n��t�r�lmek istendi�inde
            -bu exception devreye girer
            ORNEG�N: Onject data typ� String data typ�na donu�tur�lemez, illa d�n��t�r dersek java ClassCastException der


             */
        }
    }
}
