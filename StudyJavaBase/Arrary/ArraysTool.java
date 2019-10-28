import java.util.Arrays;

public class ArraysTool {

	public static void main(String[] args) {

		int[] a = { 6, 8, 11, 3, 15, 23, 16, 1 };
		int[] b = { 6, 8, 11, 3, 15, 23, 16, 1 };
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.compare(a, b));//数组长度差值
		System.out.println(Arrays.compareUnsigned(a, b));//数组长度差值
		Arrays.sort(a);// 排序
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				System.out.print(a[i]);
			} else {
				System.out.print(a[i] + ",");
			}

		}
		System.out.println();
		int result = Arrays.binarySearch(a, 8);// 二分法查找
		System.out.println(result);

		System.out.println();
		System.out.println(Arrays.toString(a));
		
		  

	}

}
