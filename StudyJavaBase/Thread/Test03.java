
public class Test03 {

	public static void main(String[] args) {
		
		
		// 调用star方法，内部会开新线程调用run 方法执行
//		MyThreadRunnable r1=new MyThreadRunnable();
//	     Thread t1= new Thread(r1);
//	     t1.start();
		
		
		//多线程是抢占资源
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
		
		System.out.println("开启线程处理业务"+Thread.currentThread()+"线程名称："+Thread.currentThread().getName());
		
		
	}
	
	
}
