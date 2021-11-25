package collectionTask;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class TreeSetDemo {

	public static void main(String[] args) {
		Book b1 = new Book(102, "JAva", 672, "prateek");
		Book b2 = new Book(103, "Python", 603, "smdhan");
		Book b3 = new Book(109, "HTML", 772, "rohqan");
		Book b4 = new Book(106, "Css", 302, "vivan");
		Book b5 = new Book(105, "Angular", 564, "creta");
		Book b6 = new Book(108, "Spring", 103, "vinay");
		Comparator<Book> compare = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Select 1 to sort by id");
		System.out.println("Select 2 to sort by BookName");
		System.out.println("Select 3 to sort by BookPrice");
		System.out.println("Select 4 to sort by Author");
		int ch = s.nextInt();

		switch (ch) {
		case 1:
			compare = new CompareById();
			break;

		case 2:
			compare = new CompareByBookName();
			break;

		case 3:
			compare = new CompareByPrice();
			break;

		case 4:
			compare = new CompareByAuthor();
			break;

		default:
			break;
		}

		Set<Book> bookset = new TreeSet<Book>(compare);
		bookset.add(b1);
		bookset.add(b2);
		bookset.add(b3);
		bookset.add(b4);
		bookset.add(b5);
		bookset.add(b6);

		for (Book book : bookset) {
			System.out.println(book);
		}

		
		/*
		 * int ch = s.nextInt();
		 * 
		 * switch (ch) { case 1: compare = new CompareById(); break;
		 * 
		 * case 2: compare = new CompareByBookName(); break;
		 * 
		 * case 3: compare = new CompareByPrice(); break;
		 * 
		 * case 4: compare = new CompareByAuthor(); break;
		 * 
		 * default: break; }
		 */
		System.out.println("using Iteraotr");
		Iterator<Book> itr = bookset.iterator();
		while (itr.hasNext()) {
			Book book = itr.next();
			System.out.println(book);
		}

	}

}
