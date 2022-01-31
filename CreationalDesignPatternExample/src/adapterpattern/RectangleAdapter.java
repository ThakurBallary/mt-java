package adapterpattern;

public class RectangleAdapter  extends RectangleShape{
	
	private SquareShape sShape;
	
	public RectangleAdapter(SquareShape sShape) {
		this.sShape = sShape;
	}
	
	public void fillColor(String color) {
		sShape.colourSquare(color);
	}

}
