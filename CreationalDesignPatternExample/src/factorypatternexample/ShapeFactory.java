package factorypatternexample;

public class ShapeFactory {
	
	public static Shape getShape(String sides) {
		if(sides.equals("4")) {
			return new Rectangle();
		}else if(sides.equals("3")) {
			return new Triangle();
		}else if(sides.equals("0")) {
			return new Circle();
		}else {
			return null;
		}
	}

}
