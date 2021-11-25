package collectionTask;

import java.util.Comparator;

public class CompareById implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.getBookId()-b2.getBookId();
	}

}
