package DAY_38_exception;

public class E04 {

    public static void main(String[] args) {
        /*
        3. Exception = ArrayIndexOutOfBoundsException class ý --> arraylar de olmayan index le iþlem yapýnca mesaj verir
         */

        //diðer exception=ArrayIndexOutOfBoundsException-->Arrayýn index sýnýrýnýn dýþýndasýn

        int arr[]={11,12,14,};//1. elemaný nasýl yazdýrýrýz

        System.out.println(arr[0]);//11

        try {
            System.out.println(arr[3]);//3. index olmadýðý için ArrayIndexOutOfBoundsException hatasý verir

            //ArrayIndexOutOfBoundsException ==Un-Checked Exception dýr yaný RTE dir
        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Arraylerde index fazlasý sayý giremzsin");
        }

    }

}
