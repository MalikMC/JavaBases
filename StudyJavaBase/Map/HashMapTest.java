import java.util.HashMap;
import java.util.Map.Entry;
import java.util.UUID;

import Model.Person;

/*map�е�Ԫ�����Լ�-ֵ�ķ�ʽ���ڵģ�ͨ�������Ի�ȡ��ֵ��
 * ���ǲ������ظ��ģ���ȡ��˳���ǲ�һ�µ�*/

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,Person> mp=new HashMap<String,Person>();
		mp.put(UUID.randomUUID().toString(),new Person("����", 23));
		mp.put(UUID.randomUUID().toString(),new Person("����", 21));
		mp.put(UUID.randomUUID().toString(),new Person("����", 24));
		
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
