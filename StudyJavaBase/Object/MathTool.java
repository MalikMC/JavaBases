
public class MathTool {

	public static void main(String[] args) {
		// Բ����
		System.out.println(Math.PI);
		// ȡ����ֵ
		System.out.println(Math.abs(-10));

		// ceil�컨�壬������ȡֵ�������double
		System.out.println(Math.ceil(12.3));
		System.out.println(Math.ceil(12.99));

		System.out.println("-----------");
		// floor�ذ壬������ȡ��,�����double
		System.out.println(Math.floor(12.3));
		System.out.println(Math.floor(12.99));

		// ��ȡ����ֵ�е����ֵ
		System.out.println(Math.max(20, 30));

		// ǰ������ǵ���,���������ָ������2��3�η�
		System.out.println(Math.pow(2, 3));

		// ����0.0��1.0֮������С��,����0.0,������1.0
		System.out.println(Math.random());


		// ��������
		System.out.println(Math.round(12.3f));
		System.out.println(Math.round(12.9f));

		// ��ƽ��
		System.out.println(Math.sqrt(16));

	}
}
