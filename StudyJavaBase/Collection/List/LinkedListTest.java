package List;

import java.util.LinkedList;

public class LinkedListTest {
	
	
	public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //��LinkedList����ǰ���λ�������Ԫ��
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.add("12");
        //��LinkedList��������λ�������Ԫ��
        list.addLast("e");
        
        System.out.println(list);

        //��ȡLinkedList�еĵ�һ��Ԫ��
        System.out.println(list.getFirst());
        //��ȡLinkedList�е����һ��Ԫ��
        System.out.println(list.getLast());
        //ɾ��LinkedList�еĵ�һ��Ԫ��
        System.out.println(list.removeFirst());
        //ɾ��LinkedList�е����һ��Ԫ��
        System.out.println(list.removeLast());

        //��ȡLinkedList�еĵڶ���Ԫ��
        System.out.println(list.get(1));
        System.out.println(list);
    }

}
