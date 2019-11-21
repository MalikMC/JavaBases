import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.Map.Entry;

import Model.Person;

/*
LinkedHashMap���ص㣺��ȡ˳��һ��*/
public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String, Person> mp = new TreeMap<String, Person>();
		mp.put(UUID.randomUUID().toString(), new Person("����", 23));
		mp.put(UUID.randomUUID().toString(), new Person("����", 21));
		mp.put(UUID.randomUUID().toString(), new Person("����", 19));

		System.out.println(mp);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

		TreeMap<String, Person> mpSort = new TreeMap<String, Person>();
		mpSort.put(UUID.randomUUID().toString(), new Person("����", 23));
		mpSort.put(UUID.randomUUID().toString(), new Person("����", 21));
		mpSort.put(UUID.randomUUID().toString(), new Person("����", 19));
		
		List<Entry<String, Person>> lists = new ArrayList<Entry<String, Person>>();
            lists.addAll(mpSort.entrySet());
		Collections.sort(lists, new Comparator<Map.Entry<String, Person>>() // ʹ�÷���
		{

			@Override
			public int compare(Entry<String, Person> o1, Entry<String, Person> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().getAge() - o2.getValue().getAge();// ��С��������
			}
		});

		System.out.println(mpSort);
		System.out.println(lists);

	}

}
