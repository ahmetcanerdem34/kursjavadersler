package DAY_30_dayTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C2_LocalDateTime {

	public static void main(String[] args) {
		
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalTime local=LocalTime.now();
		System.out.println(local);//14:14:40.188284600
		System.out.println(local.toString());//14:15:31.424994300
		System.out.println("**************************");
		
		System.out.println(ldt.toString());//
		
		String time = ldt.toString();
		//bundan sonra time yazýp noktaya basýnca String methodlarýný göreceðim ve onlaarý kullanabilirim
		
		System.out.println(time.startsWith("2021"));//2021 ile mi ballýyor//true

	}

}
