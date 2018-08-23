import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.beans.Book;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Book> books = new HashSet<>();
		books.add(new Book());
		books.add(new Book(1, "XYZ"));
		books.add(new Book(1, "XYZ abc"));
		System.out.println(books.size());
		for (Iterator iterator = books.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
	}

}
