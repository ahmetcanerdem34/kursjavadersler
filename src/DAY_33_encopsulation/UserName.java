package DAY_33_encopsulation;

import java.util.Scanner;

public class UserName {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        // 5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
        int userAdeti = 1; //neden do once yap sonra bak
        do {
            System.out.println(userAdeti +". User Name :");
            String username = sc.next();
            System.out.println(userAdeti +". Password :");
            String password = sc.next();
            try {
                User yeniUser = new User(username, password);//password burada �retildi�i i�in catch buraya at�l�r
                userAdeti++;}
           catch(Exception hata) {
               System.out.println(hata.getMessage());//hata yakalan�nca kullanc�y� bilgilendir
           }
        }
while (userAdeti < 3) ;


    }
}
