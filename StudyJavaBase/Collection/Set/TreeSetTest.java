package Set;

import java.util.TreeSet;

import Model.Person;

//TreeSet可以对存储的元素进行排序
public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(3);
		ts.add(3);
		ts.add(1);
		ts.add(1);
		ts.add(5);
		ts.add(2);
		ts.add(4);
		ts.add(2);

		System.out.println(ts);
		System.out.println("===========================================================");
		
		TreeSet<String> strs = new TreeSet<String>();
		strs.add("ade");
		strs.add("fad");
		strs.add("bad");
		strs.add("csdsd");
		
		System.out.println(strs);
		System.out.println("===========================================================");
		
		
		
		TreeSet<Person> obj=new TreeSet<Person>(new CompareByNameLength());
		
		  obj.add(new Person("张三", 28));	
		  obj.add(new Person("张三", 23));
		  obj.add(new Person("张三", 27));
		
		  System.out.println(obj);
			System.out.println("===========================================================");
			
		

	}
	
	


}


