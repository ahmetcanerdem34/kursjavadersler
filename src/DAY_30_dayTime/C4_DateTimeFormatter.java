package DAY_30_dayTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C4_DateTimeFormatter {

	public static void main(String[] args) {
		
		
		//tarihi istediðimiz formatta yazmamýzý saðlar
		
		   
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/d");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("y$M$d");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("y-MMMM-d");
        // M :month m : minute
    
        LocalDate tarih=LocalDate.now();
        
        System.out.println(dtf.format(tarih)); //2021/Mar/19
        System.out.println(dtf2.format(tarih)); //21/03/19
        System.out.println(dtf3.format(tarih)); //2021*3*19
        System.out.println(dtf4.format(tarih)); //2021-March-19
        
        
        System.out.println("****************************************");
        
        LocalDate tarih1 =LocalDate.now();
        DateTimeFormatter dtfo1=DateTimeFormatter.ofPattern("yyyy/MMMM/d");
        DateTimeFormatter dtfo2=DateTimeFormatter.ofPattern("yy/MM/dd");
        DateTimeFormatter dtfo3=DateTimeFormatter.ofPattern("y$M$d");
        DateTimeFormatter dtfo4=DateTimeFormatter.ofPattern("y-MMMM-d");
        
        System.out.println(dtfo1.format(tarih1));
        System.out.println(dtfo2.format(tarih1));
        System.out.println(dtfo3.format(tarih1));
        System.out.println(dtfo4.format(tarih1));
     
//        2021/Mart/22
//        21/03/22
//        2021$3$22
//        2021-Mart-22
        
    }
}
