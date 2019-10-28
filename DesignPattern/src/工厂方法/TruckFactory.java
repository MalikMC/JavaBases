package 工厂方法;

public class TruckFactory implements AutomobileFactory {

	@Override
	public AutomobileProduct getAutomobileProduct() {
		
		return new TruckProduct();
	}

}
