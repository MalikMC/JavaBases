package ����ģʽ;

/*��ν���������������������ҽ���һ��ʵ����
 * ���ฺ�𴴽��Լ��Ķ���ͬʱȷ��ֻ��һ�����󱻴�����
 * ��Java��һ�㳣���ڹ������ʵ�ֻ򴴽�������Ҫ������Դ��
�ص�
�๹����˽��
�����Լ����͵�����
�����ṩ��ȡʵ���ľ�̬����*/

//����ģʽ
//�̲߳���ȫ���ӳٳ�ʼ�����ϸ������ϲ��ǲ��ǵ���ģʽ
public class LazybonesSingleton {

	private static LazybonesSingleton instance;

	private LazybonesSingleton() {
	}

	public static LazybonesSingleton getInstance() {
		if (instance == null) {
			instance = new LazybonesSingleton();
		}
		return instance;
	}

}
