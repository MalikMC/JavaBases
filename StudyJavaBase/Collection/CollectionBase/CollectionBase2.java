package CollectionBase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Model.Person;

public class CollectionBase2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add(new Person("����", 23));
		c.add(new Person("����", 24));
		c.add(new Person("����", 25));
		c.add(new Person("����", 26));

		// ����ת�������
		Object[] obj = c.toArray();

		System.out.println(c);

		for (int i = 0; i < obj.length; i++) {
			
			System.out.print(obj[i]);
			
			Person p = new Person();
			p = (Person) obj[i];
			System.out.println(p.getName() + ":" + p.getAge());
		}

		// ����������
	
		for (Iterator iter = c.iterator(); iter.hasNext();) {
			
			Person p = (Person) iter.next();
			System.out.println(p.getName() + ":" + p.getAge());
		}


	}

}
