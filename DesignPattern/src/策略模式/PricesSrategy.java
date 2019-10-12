package ����ģʽ;

//һ������Ʒ��5�ۣ�һ���ִ�8�ۣ�һ���ִ�9��
//��ͨ��Ա������С��10000��ÿ��300��30���߼���Ա���ִ���10000��ÿ��300��40

public abstract class PricesSrategy {
	
	abstract double Payment(String userName,int membershipScore,double consumptionVolume);	
}


//����
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
//�ۿ�
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
//�ۿ�
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

//�ۿ�
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