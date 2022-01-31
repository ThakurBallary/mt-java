package absfactorypatternexample;

public class Triangle extends Shape{

	public Triangle(Area a) {
		super(ShapeSides.THREE,a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate() {
		System.out.println("This is Triange calculate method");
		
	}

}
