package List;

import java.util.ArrayList;
import java.util.Comparator;

import Model.Person;

/*���͵��ŵ�
����ͳһ�����е��������ͣ���߰�ȫ��
���Լ���ǿ������ת��*/
public class GenericTest {

	public static void main(String[] args) {
		ArrayList<Person> list=new ArrayList<Person>();
		
		list.add(new Person("����", 23));
		list.add(new Person("����", 28));
		list.add(new Person("����", 25));
		list.add(new Person("����", 26));
		
		System.out.println(list);
		
		//Sort
		list.sort( new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				
				return Integer.compare(o1.getAge(),o2.getAge());
			}
		});
		System.out.println(list);
		
		//����
		
		for(Person p:list) {
			
			System.out.println(p.getName()+":"+p.getAge());
		}
		

	}

}
