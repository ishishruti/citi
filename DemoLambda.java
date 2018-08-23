import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.beans.Book;

public class DemoLambda {
	
	public static void main(String[] args) {
		
		MyInterface mInterface = () -> {System.out.println("From lambda");};
		mInterface.showData();
		MyInterface1 myInterface1 = (a,b) -> {
			System.out.println(a);
			System.out.println(b);
			return true;
		};
		myInterface1.add(new Book(1, "Java"), new Book());
		
		List<String> list = new ArrayList<>();
		list.add("Abc");
		list.add("xyxs");
		list.add("Abc");
		list.add("xyxs");
		
		list.forEach(System.out::println);
		list.stream().filter(data -> {return data.length()==3;}
		).collect(Collectors.toList()).forEach(System.out::println);
		
		List<Book> books = new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book(1, "ABC"));
		books.add(new Book(1, "ABCD"));
		books.add(new Book(2, "XYZ"));
		
		books.forEach(System.out::println);
		System.out.println("Testing");
		books.stream().filter(data -> {return data.getIsbn()==1;}
		).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
	}
}
