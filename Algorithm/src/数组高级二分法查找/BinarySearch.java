package ����߼����ַ�����;

/*ԭ�����ַ����ң�Ҳ��Ϊ�۰뷨����һ�������������в����ض�Ԫ�ص������㷨��

���ַ����ҵ�˼·���£�

1�����ȣ���������м�Ԫ�ؿ�ʼ�����������Ԫ��������Ŀ��Ԫ�أ����������̽���������ִ����һ����

2�����Ŀ��Ԫ�ش���/С���м�Ԫ�أ������������/С���м�Ԫ�ص���һ��������ң�Ȼ���ظ�����1�Ĳ�����

3�����ĳһ������Ϊ�գ����ʾ�Ҳ���Ŀ��Ԫ�ء�*/

public class BinarySearch {

	public static void main(String[] args) {

		int[] array = { 14, 24, 56, 113, 242, 247, 452 };

		int target = 2442;
		int minIndex = 0;
		int maxIndex = array.length - 1;
		int midIndex = (minIndex + maxIndex) / 2;
		int targetIndex = -1;
		while (true) {
			// Ŀ��ֵ�����
			if (target < array[midIndex]) {
				maxIndex = midIndex - 1;
				midIndex = (minIndex + maxIndex) / 2;

			}
			// Ŀ��ֵ���ұ�
			if (target > array[midIndex])			
			{
				minIndex = midIndex + 1;
				midIndex = (minIndex + maxIndex) / 2;

			}
			if (minIndex > maxIndex) {
				System.out.print("�������ޣ�û�в鵽����������ֵ");
				break;
			}
			// �ҵ�Ŀ��ֵ
			if (target == array[midIndex]) {
				targetIndex = midIndex;
				System.out.println("Ŀ��" + target + "����" + targetIndex);
				break;
			}

		}

	}

}
