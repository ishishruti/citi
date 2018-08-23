import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.exceptions.MyException;

public class TestMyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int age=17;
//		if(age<18) {
//			try {
//				throw new MyException("Exception!!!");
//			} catch (MyException e) {
//				e.printStackTrace();
//			}
//		}
//		Set set=new TreeSet();
//		set.add(2);
//		set.add("1");
//		set.add(3);
//		System.out.println(set);
		bla b = new bla("Monday");
		bla b1 = new bla("Monday");
		Map <bla,String> map = new HashMap<>();
		map.put(b,	 "a");
		map.put(b1, "b");
		System.out.println(map.size());
		Integer integer =10;
		Integer integer2 = 10; 
		System.out.println(integer.equals(integer2));
		int b11 = 1/args.length;
	}

}
