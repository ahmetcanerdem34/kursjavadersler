package DAY_30_dayTime;

import java.time.LocalDate;

public class C1_LocalDate01 {

	public static void main(String[] args) {
		
	       // Java'da sadece tarih kullanmak istiyorsak
        // LOcalDate Class'indan bir obje uretiriz
        
        LocalDate tarih= LocalDate.now();
        LocalDate tarih5=LocalDate.now();
        System.out.println(tarih); // 2021-03-19
        System.out.println(tarih5);//2021-03-21
        
        System.out.println("***********************");
        
        System.out.println(tarih.plusWeeks(20)); // 2021-08-06
        System.out.println(tarih.plusWeeks(20));//2021-08-08
        
        System.out.println("*******************************");
        
        System.out.println(tarih.plusDays(500)); // 2022-08-01
        System.out.println(tarih.plusDays(7));//2021-03-28
        
        System.out.println("***********************************");
        
        System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12)); //2024-08-31
        System.out.println(tarih.plusYears(3).plusMonths(1).plusDays(1));//2024-04-22
        
        System.out.println("****************************************");
        
        System.out.println(tarih.minusMonths(15));// 2019-12-19
        System.out.println(tarih.minusYears(1).minusMonths(3).minusDays(21));//2019-11-30
        System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10)); // 2017-11-09
        
        System.out.println(tarih.isLeapYear()); // false
        
        System.out.println("***************************");
        
        System.out.println(tarih.getDayOfYear());//78
        System.out.println(tarih.getDayOfYear());//80
        
        System.out.println("*******************************");
        System.out.println(tarih.getMonthValue());//3 sayý olarak ayý veriyor
        System.out.println(tarih.getMonthValue());//kaçýncý aydayýz 3
        System.out.println("******************************");
        System.out.println(tarih.getDayOfWeek());//haaftanýn hangi günündeyiz SUNDAY
        System.out.println(tarih.getDayOfWeek());//bu gunu verir cuma
        System.out.println("**********************************");
        
        LocalDate dogumGunu = LocalDate.of(1995, 10, 5);
        System.out.println(dogumGunu.getDayOfWeek());//thursday
        LocalDate dgunu=LocalDate.of(1985, 2, 27);
        System.out.println(dgunu.getDayOfWeek());//WEDNESDAY
        
        System.out.println("**********************************");
        
        System.out.println(tarih.getMonth());//ayý yazdýr, bulunduðunn ayý. ayýn ismini verir
        System.out.println(tarih.getMonth());//MARCH
        
        System.out.println("**********************************");
        // Eger suan ki tarih ile degil de eski bir tarih ile islem yapacaksak 
        // LocalDate.of() methodunu kullaniyoruz
        LocalDate tarih1 = LocalDate.of(1995, 12, 15);
        LocalDate tarih2 = LocalDate.of(1995, 12, 10);
        
        System.out.println(tarih1.isAfter(tarih2)); // true
        System.out.println(tarih1.isBefore(tarih2)); // false
    }
}


