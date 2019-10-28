package List;

import java.util.LinkedList;

public class LinkedListTest {
	
	
	public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //在LinkedList中最前面的位置上添加元素
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.add("12");
        //在LinkedList中最后面的位置上添加元素
        list.addLast("e");
        
        System.out.println(list);

        //获取LinkedList中的第一个元素
        System.out.println(list.getFirst());
        //获取LinkedList中的最后一个元素
        System.out.println(list.getLast());
        //删除LinkedList中的第一个元素
        System.out.println(list.removeFirst());
        //删除LinkedList中的最后一个元素
        System.out.println(list.removeLast());

        //获取LinkedList中的第二个元素
        System.out.println(list.get(1));
        System.out.println(list);
    }

}
