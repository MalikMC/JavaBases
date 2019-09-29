
public class CodeBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		1.系统将Fu.class和Zi.class分别加载到方法区的内存里面，静态代码会随着.class文件一块加载到方法区里面，
		所以先打印出了静态代码块中的内容。
		2.构造代码块优先于构造方法执行，父类初始化之前，所以打印出父类中的构造代码块和构造方法中的内容*/

	        ZiClass z = new ZiClass();

	}

}


class FuClass {
    static {
        System.out.println("静态代码块Fu");
    }

    {
        System.out.println("构造代码块Fu");
    }

    public FuClass() {
        System.out.println("构造方法Fu");
    }
}

class ZiClass extends FuClass {
    static {
        System.out.println("静态代码块Zi");
    }

    {
        System.out.println("构造代码块Zi");
    }

    public ZiClass() {
        System.out.println("构造方法Zi");
    }
}
