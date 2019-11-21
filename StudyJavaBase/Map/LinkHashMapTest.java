import java.util.LinkedHashMap;
import java.util.UUID;

import Model.Person;

/*
LinkedHashMap的特点：存取顺序一致*/
public class LinkHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String,Person> mp=new LinkedHashMap<String,Person>();
		mp.put(UUID.randomUUID().toString(),new Person("张三", 23));
		mp.put(UUID.randomUUID().toString(),new Person("西华", 21));
		mp.put(UUID.randomUUID().toString(),new Person("伯特", 24));
		
		System.out.println(mp);

	}

}
