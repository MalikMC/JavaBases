
public class Test02 {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		
		// run 是主线程执行的方法，子线程不能用run 方法执行
		
		t1.run();
		
		// 调用star方法，内部会开新线程调用run 方法执行
		t1.start();
		
		//多线程是抢占资源
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
		
		System.out.println("开启线程处理业务"+Thread.currentThread()+"线程名称："+this.getName());
		
	}
	
	
}
