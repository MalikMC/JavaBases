package �򵥹���;

public class Test {

	public static void main(String[] args) {
		
		
		AutomobileProduct car=AutomobileFactory.createProduct(ProductType.Car);
		car.introduceProduct("�����", (float) 2.0);
		
		AutomobileProduct bus=AutomobileFactory.createProduct(ProductType.Bus);
		bus.introduceProduct("��ɫ", (float) 4.0);

	}

}
