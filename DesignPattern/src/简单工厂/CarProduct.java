package 简单工厂;

public class CarProduct extends AutomobileProduct {

	@Override
	void introduceProduct(String color, Float displacement) {
		// TODO Auto-generated method stub
		 System.out.println("我是小汽车，颜色 "+color+" 排量 "+displacement);
	}


}
