

// this 关键字是指向引用
// this 关键字是用来区分局部变量与成员变量
public class ThisKeyWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "mawe";
		p.age = 23;
		p.say();
	}
}

class Person {

	public String name;

	public int age;

	public void say() {
          String  name="dddfd";
		System.out.println("我是" + name+"今年" + age);
		System.out.println("我是" + this.name+"今年" + age);
	}

}
