package 工厂方法;

public class CarFactory implements AutomobileFactory {

	@Override
	public AutomobileProduct getAutomobileProduct() {
		
		return new CarProduct();
	}

}
