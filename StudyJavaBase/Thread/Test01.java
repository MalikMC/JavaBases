
/*JVM 启动会有两个线程启动一个主线程,一个是垃圾回收*/
public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("main 方法启动");
		System.out.println(Thread.currentThread());
		
		for(int i=0;i<4;i++)
		{	
			new Student();
			System.gc();
		}
		
	}

}

class Student {
	
	@Override
	protected void finalize() throws Throwable{
		
		System.out.println("Student 被回收");
		System.out.println(Thread.currentThread());
	}
	
}
