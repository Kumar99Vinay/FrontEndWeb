package SetDemos.book;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookSetDemo {

	public static void main(String[] args) {
		Book b1=new Book(121, "JAva", 672, "prateek");
		Book b2=new Book(121, "JAva", 672, "prateek");
		Book b3=new Book(121, "JAva", 672, "prateek");
		Book b4=new Book(121, "JAva", 672, "prateek");
		Book b5=new Book(121, "JAva", 672, "prateek");
		Book b6=new Book(121, "JAva", 672, "prateek");
		
		Set<Book> bookset=new HashSet<Book>();
		bookset.add(b1);
		bookset.add(b2);
		bookset.add(b3);
		bookset.add(b4);
		bookset.add(b5);
		bookset.add(b6);
		
		for(Book book:bookset) {
			System.out.println(book);
		}
		System.out.println("using Iteraotr");
		Iterator<Book> itr=bookset.iterator();
		while(itr.hasNext()) {
			Book book =itr.next();
			System.out.println(book);
		}

	}

}
