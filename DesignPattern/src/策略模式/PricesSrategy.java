package ����ģʽ;

/*��ͼ������һϵ�е��㷨,������һ������װ����, ����ʹ���ǿ��໥�滻��

��Ҫ��������ж����㷨���Ƶ�����£�ʹ�� if...else �������ĸ��Ӻ�����ά����

��ʱʹ�ã�һ��ϵͳ���������࣬���������ǵ�ֻ������ֱ�ӵ���Ϊ��

��ν��������Щ�㷨��װ��һ��һ�����࣬������滻��

�ؼ����룺ʵ��ͬһ���ӿڡ�

Ӧ��ʵ���� 1�����д��۴������ 2�����еĳ��η�ʽ��ѡ�������г�����������ÿһ�����з�ʽ����һ�����ԡ� 3��JAVA AWT �е� LayoutManager��

�ŵ㣺 1���㷨���������л��� 2������ʹ�ö��������жϡ� 3����չ�����á�

ȱ�㣺 1������������ࡣ 2�����в����඼��Ҫ���Ⱪ¶��*/



//---------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------

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

	}

	@Override
	double Payment(String userName, int membershipScore, double consumptionVolume) {
		
		return  consumptionVolume=consumptionVolume*0.5;
	}
		
}
//�ۿ�
class Discount8 extends PricesSrategy{

	public Discount8() {
		
		
	}

	@Override
	double Payment(String userName, int membershipScore, double consumptionVolume) {
		
		return  consumptionVolume=consumptionVolume*0.8;
	}
		
}

//�ۿ�
class Discount9 extends PricesSrategy{

	public Discount9() {
		
		
	}

	@Override
	double Payment(String userName, int membershipScore, double consumptionVolume) {
		
		return  consumptionVolume=consumptionVolume*0.9;
	}
		
}