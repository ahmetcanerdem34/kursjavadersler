package DAY_40_exceptions;

public class InvalidEmailIdCheckedException extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//java exception lar�n tekrars�z olmas�n� sa�lamak i�in her exception a unique bir kod verir

	InvalidEmailIdCheckedException(String message){//constructor olu�turduk klas ad�yla
		super(message);//gizli super var extends var--->yaz�nca default gitti
		
		
		
		
	}
	
	
}
