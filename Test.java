import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.beans.Book;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InterfaceImplement o = new InterfaceImplement();
		int condition = 1;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Menu");
			System.out.println("1.Add");
//			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Print books");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			
			int choice = Integer.parseInt(bufferedReader.readLine());
			switch (choice) {
			case 1:
				o.addBook(o.getBook());
				System.out.println("Book added successfully");
				break;
			case 3:
				System.out.println("1.Search by ID");
				System.out.println("2.Search by name");
				int c1 =Integer.parseInt(bufferedReader.readLine());
				if(c1==1) {
					System.out.println("Enter the isbn number");
					int id = Integer.parseInt(bufferedReader.readLine());
					Book srch = o.findBookById(new Book(id, "dummy"));
					if(srch.getIsbn()==0) {
						System.out.println("Book not found");
					}
					else {
						System.out.println("Book found");
						o.printBook(srch);
						o.deleteBook(srch);
						System.out.println("Deleted successfully");
						o.printBook(o.books);
					}
				}
				else {
					System.out.println("Enter the name");
					String name = bufferedReader.readLine();
					ArrayList<Book> srch = o.findBooksByName(name);
					if(srch.size()>0) {
						System.out.println("Book found");
						o.printBook(srch);
						for (Iterator iterator = srch.iterator(); iterator.hasNext();) {
							o.deleteBook((Book) iterator.next());
						}
						o.printBook(o.books);
					}
					else {
						System.out.println("Book not found");
					}
				}
				break;
			case 4:
				o.printBook(o.books);
				break;
			case 5:
				condition = 0;
				break;
			default:
				break;
			}
		} while (condition!=0);
	}

}
