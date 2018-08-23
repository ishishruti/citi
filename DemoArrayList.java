import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("abc");
		list.add("xyz");
//		Person person = new Person();
//		list.add(person);
//		list.add(new Integer(12));
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.get(4).getClass());
//		list.add(0, "kkkn");
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.contains("abc"));
//		list.remove(0);
//		System.out.println(list);
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
