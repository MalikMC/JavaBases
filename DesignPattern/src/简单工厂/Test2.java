package �򵥹���;

public class Test2 {

	public static void main(String[] args) {
		
		
		CarProduct car=(CarProduct)AutomobileFactory2.createProduct(CarProduct.class);
		car.introduceProduct("�����", (float) 2.0);
		
		AutomobileProduct bus=(AutomobileProduct)AutomobileFactory2.createProduct(BusProduct.class);
		bus.introduceProduct("��ɫ", (float) 4.0);

		AutomobileProduct truck=(TruckProduct)AutomobileFactory2.createProduct(TruckProduct.class);
		truck.introduceProduct("��ɫ", (float) 6.0);



	}

}
