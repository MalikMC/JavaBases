package CollectionBase;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionBase1 {

	
	
	/*
	 * Collection�ǽӿڣ������List��Set��QueueҲ���ǽӿڣ����Ҽ̳������Collection���������ArrayList��
	 * LinkedList��Vector��HashSet��TreeSet��PriorityQueue�������ǵ�ʵ���ࡣ
	 * 
	 * �������һЩ�ص� 
	 * List�������ŵ���������˳��ģ����Դ���ظ������ݡ�
	 * Set�������ŵ�������û��˳��ģ����ܴ���ظ������ݡ�
	 * Queue����һ�����У�������������Ƚ��ȳ������Դ���ظ������ݡ�
	 * 
	 * ����ͼ��ϵ�����
	 *  ����1: ����ȿ��Դ洢������������,�ֿ��Դ洢������������,�����������ʹ洢����ֵ,�����������ʹ洢���ǵ�ֵַ
	 * ����ֻ�ܴ洢������������(����)������洢������������ʱ�����Զ�װ������Ӧ�İ�װ��
	 *  ����2: ���鳤���ǹ̶���,�����Զ�����
	 * ���ϵĳ��ȵ��ǿɱ��,���Ը���Ԫ�ص����Ӷ��Զ�����
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
