package 策略模式;

/*意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。

主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。

何时使用：一个系统有许多许多类，而区分它们的只是他们直接的行为。

如何解决：将这些算法封装成一个一个的类，任意地替换。

关键代码：实现同一个接口。

应用实例： 1、超市打折促销活动。 2、旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是一个策略。 3、JAVA AWT 中的 LayoutManager。

优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。

缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露。*/



//---------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------

//一部分商品找5折，一部分打8折，一部分打9折
//普通会员，积分小于10000的每满300减30，高级会员积分大于10000的每满300减40

public abstract class PricesSrategy {
	
	abstract double Payment(String userName,int membershipScore,double consumptionVolume);	
}


//满减
 class Reduction extends PricesSrategy{

	public Reduction() {
		
	}

	@Override
	double Payment(String userName, int membershipScore, double consumptionVolume) {

		if (membershipScore>10000) {
			
			consumptionVolume=consumptionVolume-Math.floor(consumptionVolume/300)*40;
			
			return consumptionVolume;
		}
		else
		{
            consumptionVolume=consumptionVolume-Math.floor(consumptionVolume/300)*30;
			
			return consumptionVolume;
			
		}
	}
}
//折扣
class Discount5 extends PricesSrategy{

	public Discount5() {

	}

	@Override
	double Payment(String userName, int membershipScore, double consumptionVolume) {
		
		return  consumptionVolume=consumptionVolume*0.5;
	}
		
}
//折扣
class Discount8 extends PricesSrategy{

	public Discount8() {
		
		
	}

	@Override
	double Payment(String userName, int membershipScore, double consumptionVolume) {
		
		return  consumptionVolume=consumptionVolume*0.8;
	}
		
}

//折扣
class Discount9 extends PricesSrategy{

	public Discount9() {
		
		
	}

	@Override
	double Payment(String userName, int membershipScore, double consumptionVolume) {
		
		return  consumptionVolume=consumptionVolume*0.9;
	}
		
}