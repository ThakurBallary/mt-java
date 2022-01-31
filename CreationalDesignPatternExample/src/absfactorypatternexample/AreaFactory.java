package absfactorypatternexample;

public class AreaFactory {
	
	public static Shape calculateShapeArea(ShapeSides s) {
		
		Shape sh = null;
		
		switch (s) {
		case ZERO:
			sh = new Circle(Area.CIRCLEAREA);
			break;
		
		case FOUR:
			sh =  new Rectangle(Area.RECTANGLEAREA);
			break;
		default:
			break;
		}
		return sh;
		
		
	}

}
