
public class Shuixianhua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 153=1*1*1+5*5*5+3*3*3

		int bai, shi, ge;
		for (int i = 0; i < 1000; i++) {
			ge = i % 10;
			shi = i / 10 % 10;
			bai = i / 100 % 10;
			if (i == bai * bai * bai + shi * shi * shi +ge * ge * ge) {
				System.out.println(i);
			}
			

		}

	}

}
