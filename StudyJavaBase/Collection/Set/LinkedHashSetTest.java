package Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

// LinkedHashSet ��ȡ˳����һ���Ե�
//LinkedHashSetʼ�յ���LinkedHashMap��Ҳ����˵����LinkedHashMap��࣬��Map�е���ѭ�����Դ�ȡ����һ��
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
	        System.out.println("ȥ���ظ���:");

	        LinkedHashSet<String> lhs = new LinkedHashSet<>();
	        //��list�����е�����Ԫ����ӵ�lhs
	        lhs.addAll(list);                                    
	        list.clear();                                        
	        //��ȥ���ظ���Ԫ����ص�list��
	        list.addAll(lhs);                                    
	        System.out.println(list);
	}

}
