package 策略模式;

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
		// TODO Auto-generated method stub
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
		
		// TODO Auto-generated constructor stub
	}

	@Override
	double Payment(String userName, int membershipScore, double consumptionVolume) {
		// TODO Auto-generated method stub
		return  consumptionVolume=consumptionVolume*0.5;
	}
		
}
//折扣
class Discount8 extends PricesSrategy{

	public Discount8() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	double Payment(String userName, int membershipScore, double consumptionVolume) {
		// TODO Auto-generated method stub
		return  consumptionVolume=consumptionVolume*0.8;
	}
		
}

//折扣
class Discount9 extends PricesSrategy{

	public Discount9() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	double Payment(String userName, int membershipScore, double consumptionVolume) {
		// TODO Auto-generated method stub
		return  consumptionVolume=consumptionVolume*0.9;
	}
		
}