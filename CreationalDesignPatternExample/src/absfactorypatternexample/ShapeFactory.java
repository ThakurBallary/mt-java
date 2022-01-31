package absfactorypatternexample;

public class ShapeFactory {
	
	private ShapeFactory() {
		
	}
	
	public static Shape getShape(ShapeSides ss) {
		Shape s = null;
		
		switch(ss) {
			case ZERO:
				s = new Circle(Area.CIRCLEAREA);
			case THREE:
				s = new Triangle(Area.TRIANGLEAREA);
			case FOUR:
				s = new Rectangle(Area.TRIANGLEAREA);
			default :
				break;	
		}
		return s;
	}

}
