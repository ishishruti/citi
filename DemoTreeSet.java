import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.beans.Book;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Book> books= new TreeSet<>();
		books.add(new Book());
		books.add(new Book(12,"javva"));
		books.add(new Book(10,"Adv javva"));
		for (Iterator iterator = books.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
	}

}
