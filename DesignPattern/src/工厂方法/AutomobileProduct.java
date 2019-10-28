package 工厂方法;

 abstract class AutomobileProduct {
	

	private String color;
	private Float displacement;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Float getDisplacement() {
		return displacement;
	}
	public void setDisplacement(Float displacement) {
		this.displacement = displacement;
	}
	
	  abstract	void introduceProduct(String color,Float displacement);
	

}
