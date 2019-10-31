package List;

import java.util.ArrayList;
import java.util.Comparator;

import Model.Person;

/*泛型的优点
可以统一集合中的数据类型，提高安全性
可以减少强制类型转换*/
public class GenericTest {

	public static void main(String[] args) {
		ArrayList<Person> list=new ArrayList<Person>();
		
		list.add(new Person("张三", 23));
		list.add(new Person("李四", 28));
		list.add(new Person("王五", 25));
		list.add(new Person("赵六", 26));
		
		System.out.println(list);
		
		//Sort
		list.sort( new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				
				return Integer.compare(o1.getAge(),o2.getAge());
			}
		});
		System.out.println(list);
		
		//遍历
		
		for(Person p:list) {
			
			System.out.println(p.getName()+":"+p.getAge());
		}
		

	}

}
