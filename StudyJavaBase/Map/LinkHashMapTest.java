import java.util.LinkedHashMap;
import java.util.UUID;

import Model.Person;

/*
LinkedHashMap���ص㣺��ȡ˳��һ��*/
public class LinkHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String,Person> mp=new LinkedHashMap<String,Person>();
		mp.put(UUID.randomUUID().toString(),new Person("����", 23));
		mp.put(UUID.randomUUID().toString(),new Person("����", 21));
		mp.put(UUID.randomUUID().toString(),new Person("����", 24));
		
		System.out.println(mp);

	}

}
