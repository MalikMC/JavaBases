package 简单工厂;

public class Test2 {

	public static void main(String[] args) {
		
		
		CarProduct car=(CarProduct)AutomobileFactory2.createProduct(CarProduct.class);
		car.introduceProduct("珍珠白", (float) 2.0);
		
		AutomobileProduct bus=(AutomobileProduct)AutomobileFactory2.createProduct(BusProduct.class);
		bus.introduceProduct("金色", (float) 4.0);

		AutomobileProduct truck=(TruckProduct)AutomobileFactory2.createProduct(TruckProduct.class);
		truck.introduceProduct("红色", (float) 6.0);



	}

}
