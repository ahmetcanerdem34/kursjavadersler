package DAY_47_queueANDmap;

import java.util.Deque;
import java.util.LinkedList;

public class C2_Deque01 {

	public static void main(String[] args) {
		
		//de : double Ended(cift tarafl�)
		
		Deque<String> dk1 = new LinkedList<>();
		
		dk1.addFirst("C");
		dk1.add("M");//normal add yaparsak,
		dk1.add("A");
		System.out.println(dk1);//[C, M, A]
		dk1.addLast("L");
		System.out.println(dk1);//[C, M, A, L]
		
		
		
		System.out.println(dk1.getFirst());//C  silme yaa eklme yapmadan il keleman� al�r gelir
		System.out.println(dk1.getLast());//L
		
		System.out.println(dk1.pop());//C 	yi d�nd�rd�, sonras�ndaki okunu� ta kald�rm��� olur
		System.out.println(dk1);//[M, A, L]
		
		dk1.push("Y");
		System.out.println(dk1);//[Y, M, A, L]
		
	
		
		
	}

}
