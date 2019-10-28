package ¼òµ¥¹¤³§;

public class AutomobileFactory {
	
  public static AutomobileProduct automobileProduct;
	
  public static AutomobileProduct createProduct(ProductType type)
  {
	  if (type==null)
	  {
		  
		  return null;
	  }
	  
	  switch(type)
	  {
	  case Car:
		  automobileProduct=new CarProduct();
	     break;
	  case Bus:
		  automobileProduct=new BusProduct();
	     break;
	  case Truck:
		  automobileProduct=new TruckProduct();
	     break;
	  default:
		  automobileProduct=null;
	    break;
	  }
	  
	  return automobileProduct;
	  
	  
  }

}
