package 工厂方法;

public class BusFactory implements AutomobileFactory {

	@Override
	public AutomobileProduct getAutomobileProduct() {
		
		return new BusProduct();
	}

}
