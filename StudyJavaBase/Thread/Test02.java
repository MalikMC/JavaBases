
public class Test02 {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		
		// run �����߳�ִ�еķ��������̲߳�����run ����ִ��
		
		t1.run();
		
		// ����star�������ڲ��Ὺ���̵߳���run ����ִ��
		t1.start();
		
		//���߳�����ռ��Դ
		for(int i=0;i<5;i++)
		{
			MyThread tr=new MyThread();
			tr.start();
			
		}
		
	}

}

class MyThread extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("�����̴߳���ҵ��"+Thread.currentThread()+"�߳����ƣ�"+this.getName());
		
	}
	
	
}
