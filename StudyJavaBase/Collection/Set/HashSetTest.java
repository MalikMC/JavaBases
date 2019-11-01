package Set;

import java.util.HashSet;

import Model.Person;

/**
 * Set���ص㣺Ԫ�ز����ظ���û����������ȡ˳���ܱ���һ�� 
 * Hashset ȥ�ظ�����д��hashCode��equal ����ʵ�ֵģ��Զ��������������µĻ���Hashset����ľ����ظ����ݡ�
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
		hs3.add(new Person("����", 23));
		hs3.add(new Person("����", 24));
		hs3.add(new Person("����", 25));
		hs3.add(new Person("����", 23));
		
		System.out.println(hs3);
		
        System.out.println("=================================================");
		
		HashSet<Person> hs4=new HashSet<Person>();
		hs4.add(new Person("����", 23));
		hs4.add(new Person("����", 24));
		hs4.add(new Person("����", 25));
		hs4.add(new Person("����", 23));
		hs4.add(new Person("����", 28));
		
		
		System.out.println(hs4);
		System.out.println(hs4.equals(hs3));

		

	}

}
