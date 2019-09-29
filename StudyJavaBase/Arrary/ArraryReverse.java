
public class ArraryReverse {

	public static void main(String[] args) {

		int[] arry = { 12, 52, 55, 15, 67 };

		int temp;

		for (int i = 0; i < arry.length/2; i++) {
			temp = arry[i];
			arry[i] = arry[arry.length - i - 1];
			arry[arry.length - i - 1] = temp;
		}

		for (int i = 0; i < arry.length; i++) {

			System.out.println(arry[i]);
		}

	}
}
