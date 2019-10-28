package List;

import java.util.ArrayList;
import java.util.List;

import Model.Person;

public class ArrayListTest {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(new Person("张三", 23));
		list.add(new Person("李四", 24));
		list.add(new Person("王五", 25));
		list.add(new Person("赵六", 26));

		getList(list, 0);
		System.out.println("==================================");
		setList(list, 1, new Person("SetTest", 11));

		System.out.println("==================================");
		addList(list, 1, new Person("AddTest", 21));
		
		System.out.println("==================================");
		removeList(list, 1);
	}

	public static void getList(List list, int i) {
		Object obj = list.get(i);
		Person p = (Person) obj;
		System.out.println(p.getName());
		System.out.println(list);
	}

	public static void setList(List list, int i, Object p) {

		System.out.println(p);
		System.out.println(list.get(i));
		list.set(i, p);
		System.out.println(list.get(i));
		System.out.println(list);
	}

	public static void addList(List list, int i, Object p) {

		System.out.println(p);
		System.out.println(list.get(i));
		list.add(i, p);
		System.out.println(list.get(i));
		System.out.println(list);
	}
	
	public static void removeList(List list, int i) {

	
		System.out.println(list.get(i));
		list.remove(i);
		System.out.println(list.get(i));
		System.out.println(list);
	}

}
