package absfactorypatternexample;

public class Rectangle extends Shape{

	public Rectangle(Area a) {
		super(ShapeSides.FOUR,a);
		calculate();
	}

	@Override
	public void calculate() {
		System.out.println("This is rectangle calculate method");
		
	}

	@Override
	public String toString() {
		return "Rectangle []";
	}

	
}
