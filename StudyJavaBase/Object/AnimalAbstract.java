 class AnimalAbstract {
		public static void main(String[] args) {
			
			Animal cat=new Cat();
			cat.say("С��");
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
		
		System.out.println("�ҳ�........");
	}

}



 class Cat extends Animal {

	@Override
	void say(String name) {
		// TODO Auto-generated method stub
		System.out.println("����è,�ҽ�"+name);
	}
	
	void eat() {
	     super.eat();
		System.out.println("����");
	}
	 
 }
