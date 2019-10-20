package 简单工厂;

public class BusProduct extends AutomobileProduct {

	@Override
	void introduceProduct(String color, Float displacement) {
		 System.out.println("我是大巴车，颜色 "+color+" 排量 "+displacement);
		
	}
	

}
