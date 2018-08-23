import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.beans.Book;

public class DemoBookArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book(1, "ABC"));
		books.add(new Book(2, "XYZ"));
//		System.out.println(books);
		Iterator<Book> iterator = books.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Book b = new Book(1, "ABC");
//		books.add(b);
		System.out.println(books.contains(b));
		System.out.println(books.remove(b));
		System.out.println(books);
	}

}
