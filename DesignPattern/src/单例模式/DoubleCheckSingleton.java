package ����ģʽ;

//˫����ģʽ
//�̰߳�ȫ���ӳٳ�ʼ�������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
//˫�ؼ��ģʽ�����������ε��жϣ���һ����Ϊ�˱��ⲻҪ��ʵ�����ڶ�����Ϊ�˽���ͬ����
//������߳����⡣����singleton=new Singleton()����Ĵ�����JVM�п��ܻ����������
//�ڶ��̷߳����´��ڷ��գ�ʹ��volatile����signletonʵ��������Ч������á�����
public class DoubleCheckSingleton {


	    private volatile static DoubleCheckSingleton singleton;  
	    private DoubleCheckSingleton (){}  
	    public static DoubleCheckSingleton getSingleton() {  
	    if (singleton == null) {  
	        synchronized (DoubleCheckSingleton.class) {  
	        if (singleton == null) {  
	            singleton = new DoubleCheckSingleton();  
	        }  
	        }  
	    }  
	    return singleton;  
	    }  
	
	
	
}
