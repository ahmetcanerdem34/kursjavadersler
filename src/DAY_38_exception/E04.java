package DAY_38_exception;

public class E04 {

    public static void main(String[] args) {
        /*
        3. Exception = ArrayIndexOutOfBoundsException class � --> arraylar de olmayan index le i�lem yap�nca mesaj verir
         */

        //di�er exception=ArrayIndexOutOfBoundsException-->Array�n index s�n�r�n�n d���ndas�n

        int arr[]={11,12,14,};//1. eleman� nas�l yazd�r�r�z

        System.out.println(arr[0]);//11

        try {
            System.out.println(arr[3]);//3. index olmad��� i�in ArrayIndexOutOfBoundsException hatas� verir

            //ArrayIndexOutOfBoundsException ==Un-Checked Exception d�r yan� RTE dir
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Arraylerde index fazlas� say� giremzsin");
        }

    }

}
