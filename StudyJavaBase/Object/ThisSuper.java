


/*super和this的对比
this和super分别代表什么
this:代表当前对象的引用
super:代表的是当前子类对象中的父类型特征
this和super的使用区别
调用成员变量
this.成员变量： 调用本类的成员变量
super.成员变量： 调用父类的成员变量
调用构造方法
this(…) ：调用本类的构造方法
super(…)：调用父类的构造方法
调用成员方法
this.成员方法：调用本类的成员方法
super.成员方法：调用父类的成员方法*/


public class ThisSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 创建Zi的对象之后系统会先调用Zi的父类Fu中的构造方法，所以先打印了fu 之后系统调用Zi中的构造方法，打印出zi
		 * 在show方法里面有个局部变量num=512，第一行打印num，调用的是局部变量，结果是512 通过this调用了成员变量num，打印出256
		 * 通过super调用父类中的num，打印出125
		 */
		 Zi z = new Zi();
         z.show();
	}

}


class Fu{
    public int num = 125;
    public Fu(){
        System.out.println("fu");
    }
}
class Zi extends Fu{
    public int num = 256;
    public Zi(){
        System.out.println("zi");
    }
    public void show(){
        int num = 512;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}