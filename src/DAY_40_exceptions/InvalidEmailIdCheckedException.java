package DAY_40_exceptions;

public class InvalidEmailIdCheckedException extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//java exception larýn tekrarsýz olmasýný saðlamak için her exception a unique bir kod verir

	InvalidEmailIdCheckedException(String message){//constructor oluþturduk klas adýyla
		super(message);//gizli super var extends var--->yazýnca default gitti
		
		
		
		
	}
	
	
}
