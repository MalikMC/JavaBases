
/*JVM �������������߳�����һ�����߳�,һ������������*/
public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("main ��������");
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
		
		System.out.println("Student ������");
		System.out.println(Thread.currentThread());
	}
	
}
