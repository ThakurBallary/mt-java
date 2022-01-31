package absfactorypatternexample;

public class Circle extends Shape{

	public Circle(Area a) {
		super(ShapeSides.ZERO,a);
		calculate();
	}
	
	

	@Override
	public void calculate() {
		System.out.println("This is Circle calculate method");
		
	}



	@Override
	public String toString() {
		return "Circle []";
	}
	

}
