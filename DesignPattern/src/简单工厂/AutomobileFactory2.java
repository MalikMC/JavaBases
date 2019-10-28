package 简单工厂;

/*简单工厂模式与策略模式的区别
 * 
 * 用途不一样
    工厂是创建型模式,它的作用就是创建对象；
策略是行为型模式,它的作用是让一个对象在许多行为中选择一种行为;
 *关注点不一样
一个关注对象创建
一个关注行为的封装
*解决不同的问题
    工厂模式是创建型的设计模式，它接受指令，创建出符合要求的实例；它主要解决的是资源的统一分发，将对象的创建完全独立出来，让对象的创建和具体的使用客户无关。主要应用在多数据库选择，类库文件加载等。
策略模式是为了解决的是策略的切换与扩展，更简洁的说是定义策略族，分别封装起来，让他们之间可以相互替换，策略模式让策略的变化独立于使用策略的客户。

工厂相当于黑盒子，策略相当于白盒子；*/

/*简单工厂模式的创建意图就是，把对类的创建初始化全都交给一个工厂来执行，
而用户不需要去关心创建的过程是什么样的，只用告诉工厂我想要什么就行了。
而这种方法的缺点也很明显，违背了设计模式的开闭原则，因为如果你要增加工
厂可以初始化的类的时候，你必须对工厂进行改建。
简单工厂模式的实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类（这些产品类继承自一个父类或接口）的实例。
该模式中包含的角色及其职责
工厂（Creator）角色
简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。
抽象产品（Product）角色
简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。
具体产品（Concrete Product）角色
是简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例。

事例：以一个汽车的生产为例，汽车厂家现在生产三个类型的车 小汽车，SUV，Bus.
 抽象产品: AutomobileProduct:  三种车型都共有的属性和功能
 具体产品：Car,SUV, Bus
 工厂:AutomobileFactory
*/

//为了符合开放-封闭原则，我们可以使用反射来实例化对象

public class AutomobileFactory2 {

	public static Object automobileProduct;

	public static Object createProduct(Class<? extends AutomobileProduct> cls) {
		if (cls == null) {
			return null;
		}
		try {
			automobileProduct = Class.forName(cls.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {

			e.printStackTrace();
		}

		return automobileProduct;

	}

}
