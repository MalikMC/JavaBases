package ��������;

public class BusFactory implements AutomobileFactory {

	@Override
	public AutomobileProduct getAutomobileProduct() {
		
		return new BusProduct();
	}

}
