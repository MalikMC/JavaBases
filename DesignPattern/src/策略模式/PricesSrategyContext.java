package ²ßÂÔÄ£Ê½;

public class PricesSrategyContext {
	
	 private PricesSrategy pricesSrategy;
	 
	 public PricesSrategyContext(PricesSrategy pricesSrategy) {
		 
		 this.pricesSrategy=pricesSrategy;
	 }
	 
	public void executeStrategy(String userName, int membershipScore, double consumptionVolume) {
		
		double pay=pricesSrategy.Payment(userName, membershipScore, consumptionVolume);
		System.out.println("userName:"+userName+" Pay:"+pay);
		
	}

}
