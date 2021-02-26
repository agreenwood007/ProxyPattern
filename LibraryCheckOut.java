
public class LibraryCheckOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TheLibrary theLibrary = new TheLibrary();
		
		theLibrary.scanCard();
		theLibrary.noCard();
		theLibrary.checkOutBook();
		theLibrary.barCode(4554);
		
		
		
		GetLibraryData realTheLibrary = new TheLibrary();
		GetLibraryData libraryProxy = new LibraryProxy();
		
		System.out.println("\nCurrent Library State " + libraryProxy.getLibraryState());
		System.out.println("\nNumber of books available " + libraryProxy.getNumberOfBooks());
		
	}
	

}
