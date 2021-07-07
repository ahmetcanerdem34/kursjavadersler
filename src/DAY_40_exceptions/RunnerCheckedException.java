package DAY_40_exceptions;

public class RunnerCheckedException {

	public static void main(String[] args) throws InvalidEmailIdCheckedException {
		
		String email="rasid@gmail.com";//burayo gomail yaparsam kode hata verdirir ve bloke etmiþ oluruz
		mailDogrula(email);
	}

	private static void mailDogrula(String email) throws InvalidEmailIdCheckedException {
		
		if(email.contains("@gmail.com")|| email.contains("@hotmail.com")) {
			
			System.out.println("mailiniz baþarýyla kaydedildi");
		}else {
			throw new InvalidEmailIdCheckedException("email uygun deðil");
		}
		
	}
	

}
