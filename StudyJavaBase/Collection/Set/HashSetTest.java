package Set;

import java.util.HashSet;

import Model.Person;

/**
 * Set的特点：元素不能重复，没有索引，存取顺序不能保持一致 
 * Hashset 去重复是重写了hashCode和equal 方法实现的，自定义对象如果不重新的话，Hashset存入的就是重复数据。
 */

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("a");
		hs1.add("b");
		hs1.add("a");
		hs1.add("c");
		System.out.println(hs1);
		System.out.println(hs1.contains("a"));

		System.out.println("=================================================");

		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(1);
		hs2.add(4);
		hs2.add(2);
		hs2.add(1);
		hs2.add(3);
		System.out.println(hs2);
		System.out.println(hs2.contains(1));
		
		System.out.println("=================================================");
		
		HashSet<Person> hs3=new HashSet<Person>();
		hs3.add(new Person("张三", 23));
		hs3.add(new Person("李四", 24));
		hs3.add(new Person("王五", 25));
		hs3.add(new Person("张三", 23));
		
		System.out.println(hs3);
		
        System.out.println("=================================================");
		
		HashSet<Person> hs4=new HashSet<Person>();
		hs4.add(new Person("张三", 23));
		hs4.add(new Person("李四", 24));
		hs4.add(new Person("王五", 25));
		hs4.add(new Person("张三", 23));
		hs4.add(new Person("张三", 28));
		
		
		System.out.println(hs4);
		System.out.println(hs4.equals(hs3));

		

	}

}
