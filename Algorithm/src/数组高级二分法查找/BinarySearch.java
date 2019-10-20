package 数组高级二分法查找;

/*原理：二分法查找，也称为折半法，是一种在有序数组中查找特定元素的搜索算法。

二分法查找的思路如下：

1：首先，从数组的中间元素开始搜索，如果该元素正好是目标元素，则搜索过程结束，否则执行下一步。

2：如果目标元素大于/小于中间元素，则在数组大于/小于中间元素的那一半区域查找，然后重复步骤1的操作。

3：如果某一步数组为空，则表示找不到目标元素。*/

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 14, 24, 56, 113, 242, 247, 452 };

		int target = 2442;
		int minIndex = 0;
		int maxIndex = array.length - 1;
		int midIndex = (minIndex + maxIndex) / 2;
		int targetIndex = -1;
		while (true) {
			// 目标值在左边
			if (target < array[midIndex]) {
				maxIndex = midIndex - 1;
				midIndex = (minIndex + maxIndex) / 2;

			}
			// 目标值在右边
			if (target > array[midIndex])			
			{
				minIndex = midIndex + 1;
				midIndex = (minIndex + maxIndex) / 2;

			}
			if (minIndex > maxIndex) {
				System.out.print("超出界限，没有查到符合条件的值");
				break;
			}
			// 找到目标值
			if (target == array[midIndex]) {
				targetIndex = midIndex;
				System.out.println("目标" + target + "索引" + targetIndex);
				break;
			}

		}

	}

}
