import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

//import com.beans.Book;

public class DemoHashMap {

	public static void main(String[] args) {
		
//		Map<String,String> m = new HashMap<>();
//		m.put("Citi", "pune");
//		m.put("Accenture", "mumbai");
//		m.put("TCS", "pune1");
//		System.out.println(m);
//		m.put("TCS", "pune2");
//		System.out.println(m);
//		Set<Entry<String, String>> entries = m.entrySet();
//		Iterator<Entry<String, String>> iterator = entries.iterator();
//		for (Iterator iterator2 = entries.iterator(); iterator2.hasNext();) {
//			Entry<String, String> entry = (Entry<String, String>) iterator2.next();
//			System.out.println(entry.getKey()+"\t"+entry.getValue());
//		}
//		
//		Map<String, Book> map = new HashMap<>();
//		map.put("B1", new Book());
//		map.put("B2", new Book(2, "Java"));
//		Set<Entry<String, Book>> entries2 = map.entrySet();
//		Iterator<Entry<String, Book>> iterator2 = entries2.iterator();
//		for (Iterator iterator3 = entries2.iterator(); iterator3.hasNext();) {
//			Entry<String, Book> entry = (Entry<String, Book>) iterator3.next();
//			System.out.println(entry.getKey()+"\t"+entry.getValue());
//			
//		}
		
//		Map<String, List<Book>> map2 = new HashMap<>();
//		List<Book> books = new ArrayList<>();
//		books.add(new Book());
//		books.add(new Book(2, "JVM"));
//		map2.put("Java collection", books);
//		
//		List<Book> books1 = new ArrayList<>();
//		books1.add(new Book());
//		books1.add(new Book(3, "CPP"));
//		map2.put("C++ collection", books1);
//		
//		List<Book> books2 = new ArrayList<>();
//		books2.add(new Book());
//		books2.add(new Book(4, "Ruby"));
//		map2.put("Ruby collection", books2);
//		
//		System.out.println(map2);
//		
//		Set<Entry<String, List<Book>>> entries = map2.entrySet();
//		Iterator<Entry<String, List<Book>>> iterator = entries.iterator();
//		for (Iterator iterator2 = entries.iterator(); iterator2.hasNext();) {
//			Entry<String, List<Book>> entry = (Entry<String, List<Book>>) iterator2.next();
//			System.out.println("Category: " + entry.getKey());
//			List<Book> bList = entry.getValue();
//			for (Book book : bList) {
//				System.out.println(book);
//			}
//		}
		
		NavigableSet<String> set = new TreeSet<>();
		set.add("India");
		set.add("Sri Lanka");
		set.add("Germany");
		set.add("USA");
		System.out.println(set);
		
		System.out.println(set.headSet("India", true));
		System.out.println(set.tailSet("Sri Lanka", true));
		
		Map<String, String> map = new ConcurrentHashMap<>();
		map.put("A", "India");
		map.put("B", "Germany");
		map.put("C", "USA");
		
		Set<Entry<String, String>> entries = map.entrySet();
		Iterator<Entry<String, String>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.String, java.lang.String> entry = (Map.Entry<java.lang.String, java.lang.String>) iterator
					.next();
			if (entry.getKey().equals("A")) {
				map.put("X", "bla");
			}
		}
		System.out.println(map);
	}
}
