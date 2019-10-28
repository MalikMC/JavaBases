package 工厂方法;

public class Test {

	public static void main(String[] args) {
		
		
		AutomobileProduct car= new CarFactory().getAutomobileProduct();
		car.introduceProduct("珍珠白", (float) 2.0);
		
		AutomobileProduct bus=new BusFactory().getAutomobileProduct();
		bus.introduceProduct("金色", (float) 4.0);

		AutomobileProduct truck=new TruckFactory().getAutomobileProduct();
		truck.introduceProduct("红色", (float) 6.0);



	}

}
