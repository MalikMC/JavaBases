package Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

// LinkedHashSet 存取顺序是一致性的
//LinkedHashSet始终调用LinkedHashMap，也就是说它跟LinkedHashMap差不多，而Map有迭代循序，所以存取才能一致
public class LinkedHashSetTest {

	public static void main(String[] args) {
	
		 ArrayList<String> list = new ArrayList<>();
	        list.add("a");
	        list.add("a");
	        list.add("a");
	        list.add("b");
	        list.add("b");
	        list.add("b");
	        list.add("b");
	        list.add("c");
	        list.add("c");
	        list.add("c");
	        list.add("c");

	        System.out.println(list);
	        System.out.println("去除重复后:");

	        LinkedHashSet<String> lhs = new LinkedHashSet<>();
	        //将list集合中的所有元素添加到lhs
	        lhs.addAll(list);                                    
	        list.clear();                                        
	        //将去除重复的元素添回到list中
	        list.addAll(lhs);                                    
	        System.out.println(list);
	}

}
