
public class Test03 {

	public static void main(String[] args) {
		
		
		// ����star�������ڲ��Ὺ���̵߳���run ����ִ��
//		MyThreadRunnable r1=new MyThreadRunnable();
//	     Thread t1= new Thread(r1);
//	     t1.start();
		
		
		//���߳�����ռ��Դ
		for(int i=0;i<5;i++)
		{
			MyThreadRunnable r=new MyThreadRunnable();
			 Thread tr= new Thread(r);
			tr.start();
			
		}
		
	}

}

class MyThreadRunnable implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println("�����̴߳���ҵ��"+Thread.currentThread()+"�߳����ƣ�"+Thread.currentThread().getName());
		
		
	}
	
	
}
