import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.beans.Book;
import com.interfaces.BookIO;
import com.interfaces.BookOperations;

public class InterfaceImplement implements BookIO, BookOperations {

	@Override
	public int addBook(Book book) {
		if(books.add(book)) return 1;
		return 0;
	}

	@Override
	public boolean deleteBook(Book book) {
		return books.remove(book);
	}

	@Override
	public Book findBookById(Book book) {
		Iterator<Book> iterator = books.iterator();
		for (Iterator iterator2 = books.iterator(); iterator2.hasNext();) {
			Book book2 = (Book) iterator2.next();
			if(book2.getIsbn()==book.getIsbn()) {
				return book2;
			}
		}
		return new Book();
	}

	@Override
	public ArrayList<Book> findBooksByName(String book_name) {
		ArrayList<Book> arr = new ArrayList<Book>();
		for (Iterator iterator2 = arr.iterator(); iterator2.hasNext();) {
			Book book =(Book) iterator2.next();
			if((book.getName()).equals(book_name)) {
				arr.add(book);
			}	
		}
		return arr;
	}

	@Override
	public Book getBook() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name of book");
		String name = null;
		try {
			name = bufferedReader.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("Enter the isbn number");
		int isbn=0;
		try {
			isbn = Integer.parseInt(bufferedReader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		Book book = new Book(isbn, name);
		return book;
	}

	@Override
	public void printBook(List<Book> books) {
		Iterator<Book> iterator = books.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	@Override
	public void printBook(Book book) {
		System.out.println(book);
	}

}
