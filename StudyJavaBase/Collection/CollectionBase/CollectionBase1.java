package CollectionBase;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionBase1 {

	
	
	/*
	 * Collection是接口，下面的List、Set、Queue也都是接口，并且继承了这个Collection。最下面的ArrayList、
	 * LinkedList、Vector、HashSet、TreeSet、PriorityQueue都是他们的实现类。
	 * 
	 * 集合类的一些特点 
	 * List：里面存放的数据是有顺序的，可以存放重复的数据。
	 * Set：里面存放的数据是没有顺序的，不能存放重复的数据。
	 * Queue：是一个队列，里面的数据是先进先出，可以存放重复的数据。
	 * 
	 * 数组和集合的区别
	 *  区别1: 数组既可以存储基本数据类型,又可以存储引用数据类型,基本数据类型存储的是值,引用数据类型存储的是地址值
	 * 集合只能存储引用数据类型(对象)，如果存储基本数据类型时，会自动装箱变成相应的包装类
	 *  区别2: 数组长度是固定的,不能自动增长
	 * 集合的长度的是可变的,可以根据元素的增加而自动增长
	 */
	
	public static void main(String[] args) {
		 Collection a=new ArrayList();
		 a.add(12);
		 a.add(13);
		System.out.println(a.contains(12));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.toString());
		a.remove(12);
		System.out.println(a.toString());
		System.out.println(a);
		System.out.println(a.hashCode());

	}

}
