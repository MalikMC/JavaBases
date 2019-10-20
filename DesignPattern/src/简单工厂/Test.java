package 简单工厂;

public class Test {

	public static void main(String[] args) {
		
		
		AutomobileProduct car=AutomobileFactory.createProduct(ProductType.Car);
		car.introduceProduct("珍珠白", (float) 2.0);
		
		AutomobileProduct bus=AutomobileFactory.createProduct(ProductType.Bus);
		bus.introduceProduct("金色", (float) 4.0);

	}

}
