import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import Model.Person;

public class MyComparatorBigToSmall implements Comparator<Map.Entry<String,Person>> //使用泛型
{  
 
	@Override
	public int compare(Entry<String,Person> o1, Entry<String,Person> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().getAge()-o2.getValue().getAge();//从小到大排序
	}
}
