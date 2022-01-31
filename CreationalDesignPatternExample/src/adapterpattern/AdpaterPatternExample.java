package adapterpattern;

public class AdpaterPatternExample {

	public static void main(String[] args) {
		
		RectangleShape rs = new RectangleShape();
		rs.colourRectangle("green");
		
		SquareShape ss = new SquareShape();
		RectangleAdapter rad = new RectangleAdapter(ss);
		rad.colourRectangle("orange");
	}

}
