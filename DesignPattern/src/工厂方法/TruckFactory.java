package ��������;

public class TruckFactory implements AutomobileFactory {

	@Override
	public AutomobileProduct getAutomobileProduct() {
		
		return new TruckProduct();
	}

}
