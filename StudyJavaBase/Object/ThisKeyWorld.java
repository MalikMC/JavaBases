

// this �ؼ�����ָ������
// this �ؼ������������־ֲ��������Ա����
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
		System.out.println("����" + name+"����" + age);
		System.out.println("����" + this.name+"����" + age);
	}

}
