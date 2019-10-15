package 单例模式;

/*所谓单例，就是整个程序有且仅有一个实例。
 * 该类负责创建自己的对象，同时确保只有一个对象被创建。
 * 在Java，一般常用在工具类的实现或创建对象需要消耗资源。
特点
类构造器私有
持有自己类型的属性
对外提供获取实例的静态方法*/

//懒汉模式
//线程不安全，延迟初始化，严格意义上不是不是单例模式
public class LazybonesSingleton {

	private static LazybonesSingleton instance;

	private LazybonesSingleton() {
	}

	public static LazybonesSingleton getInstance() {
		if (instance == null) {
			instance = new LazybonesSingleton();
		}
		return instance;
	}

}
