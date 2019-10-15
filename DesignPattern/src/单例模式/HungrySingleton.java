package 单例模式;

//饿汉模式
//线程安全，比较常用，但容易产生垃圾，因为一开始就初始化
public class HungrySingleton {

	private static HungrySingleton instance = new HungrySingleton();

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return instance;
	}

}
