
public class LibraryProxy implements GetLibraryData {

	@Override
	public LibraryState getLibraryState() {
		// TODO Auto-generated method stub
		TheLibrary realTheLibrary = new TheLibrary();
		return realTheLibrary.getLibraryState();
	}

	@Override
	public int getNumberOfBooks() {
		// TODO Auto-generated method stub
		TheLibrary realTheLibrary = new TheLibrary();
		return realTheLibrary.getNumberOfBooks();
	}

}
