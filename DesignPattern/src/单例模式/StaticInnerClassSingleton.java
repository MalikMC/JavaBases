package ����ģʽ;

//��̬�ڲ��൥��ģʽ
//
//ֻ�е�һ�ε���getInstance����ʱ��������ż��� Inner ����ʼ��instance ��
//ֻ��һ���߳̿��Ի�ö���ĳ�ʼ�����������߳��޷����г�ʼ������֤�����Ψһ�ԡ�
//Ŀǰ�˷�ʽ�����е���ģʽ�����Ƽ���ģʽ�������廹�Ǹ�����Ŀѡ��

public class StaticInnerClassSingleton {
	
	private StaticInnerClassSingleton() {};
	
	public static StaticInnerClassSingleton getInstance() {
		
		return Inner.instance;
	}
	
	private static class Inner {  
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();  
    }  
	

}
