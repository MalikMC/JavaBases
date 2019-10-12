 class AnimalAbstract {
		public static void main(String[] args) {
			
			Animal cat=new Cat();
			cat.say("小花");
			cat.eat();
			
		}

}


abstract class Animal {
	String name;
	public Animal() {};
	public Animal(String name) {
		this.name=name;
	}
	abstract void say(String name);
	void eat() {
		
		System.out.println("我吃........");
	}

}



 class Cat extends Animal {

	@Override
	void say(String name) {
		// TODO Auto-generated method stub
		System.out.println("我是猫,我叫"+name);
	}
	
	void eat() {
	     super.eat();
		System.out.println("吃鱼");
	}
	 
 }
