package ��������;

public class CarFactory implements AutomobileFactory {

	@Override
	public AutomobileProduct getAutomobileProduct() {
		
		return new CarProduct();
	}

}
