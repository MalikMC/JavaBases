import java.util.HashMap;
import java.util.Map.Entry;
import java.util.UUID;

import Model.Person;

/*map中的元素是以键-值的方式存在的，通过键可以获取到值，
 * 键是不可以重复的，存取的顺序是不一致的*/

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,Person> mp=new HashMap<String,Person>();
		mp.put(UUID.randomUUID().toString(),new Person("张三", 23));
		mp.put(UUID.randomUUID().toString(),new Person("西华", 21));
		mp.put(UUID.randomUUID().toString(),new Person("伯特", 24));
		
		System.out.println(mp);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		for(String str:mp.keySet())
		{			
			System.out.println(mp.get(str));
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		for (Entry<String, Person> entry : mp.entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue().getName());
			
		}
		

	}

}
