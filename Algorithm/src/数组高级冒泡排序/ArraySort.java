package 数组高级冒泡排序;

import java.util.Arrays;

/*比较相邻的元素。如果第一个比第二个大，就交换他们两个。
对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
针对所有的元素重复以上的步骤，除了最后一个。
持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。*/


/*时间复杂度：
两层循环，第1次遍历n次(n个元素)，第二次遍历n-1次，... 依次类推。因此，表达式如下：
n + (n - 1) + (n - 2) + ... + 1 = n * (n + 1) / 2 = O(n^2)
空间复杂度：
没有利用新的数组来帮助完成排序算法，我们认为其空间复杂度为O(1)*/

public class ArraySort {

	public static void main(String[] args) {
		int[] array = { 15, 2, 64, 66, 4, 21, 9 };

		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("这是遍历的第" + (i + 1) + "轮");
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
