package ����߼�ð������;

import java.util.Arrays;

/*�Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������
������е�Ԫ���ظ����ϵĲ��裬�������һ����
����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�*/


/*ʱ�临�Ӷȣ�
����ѭ������1�α���n��(n��Ԫ��)���ڶ��α���n-1�Σ�... �������ơ���ˣ����ʽ���£�
n + (n - 1) + (n - 2) + ... + 1 = n * (n + 1) / 2 = O(n^2)
�ռ临�Ӷȣ�
û�������µ�������������������㷨��������Ϊ��ռ临�Ӷ�ΪO(1)*/

public class ArraySort {

	public static void main(String[] args) {
		int[] array = { 15, 2, 64, 66, 4, 21, 9 };

		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("���Ǳ����ĵ�" + (i + 1) + "��");
			for (int j = 0; j < array.length - 1 - i; j++) {
				int temp;
				if (array[j] > array[j + 1]) {
					
				  temp=array[j+1]; array[j+1]=array[j]; array[j]=temp;
				
				}
			}

			
				System.out.print(" " + Arrays.toString(array));
			
			System.out.println();

		}

	}

}
