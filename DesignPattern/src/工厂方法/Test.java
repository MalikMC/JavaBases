package ��������;

public class Test {

	public static void main(String[] args) {
		
		
		AutomobileProduct car= new CarFactory().getAutomobileProduct();
		car.introduceProduct("�����", (float) 2.0);
		
		AutomobileProduct bus=new BusFactory().getAutomobileProduct();
		bus.introduceProduct("��ɫ", (float) 4.0);

		AutomobileProduct truck=new TruckFactory().getAutomobileProduct();
		truck.introduceProduct("��ɫ", (float) 6.0);



	}

}
