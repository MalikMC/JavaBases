package ²ßÂÔÄ£Ê½;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PricesSrategyContext reductionSrategyContext = new PricesSrategyContext(new Reduction());
		reductionSrategyContext.executeStrategy("sdfw", 102323, 701);
		

		PricesSrategyContext reductionSrategyContext2 = new PricesSrategyContext(new Reduction());
		 reductionSrategyContext2.executeStrategy("rhet", 103, 701);
		
		
		PricesSrategyContext Discount5Context2 = new PricesSrategyContext(new Discount5());
		 Discount5Context2.executeStrategy("twrhet", 103, 700);
	
	}

}
