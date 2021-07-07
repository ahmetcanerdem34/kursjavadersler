package ODEVCALÝSMAGRUBU;

public class Soru01 {

	public static void main(String[] args) {
		
	/*
	 
We have two monkeys, 
a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
We are in trouble if they are both smiling or if neither of them is smiling. 
Return true if we are in trouble.
	 */
		
		boolean aSmaile = true;
		boolean bSmaile = true;
		
		System.out.println(monkey(aSmaile, bSmaile));
		
	}

	public static boolean monkey(boolean aSmaile, boolean bSmaile) {
		
		if(aSmaile && bSmaile) {
			return true;
			
		}
		
		if(!aSmaile && bSmaile) {
			return false;
		}
		return false;
		
		
		
		
	}

}
