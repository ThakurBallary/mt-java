package absfactorypatternexample;

public abstract class Shape {
	
	private ShapeSides noOfSides;
	private Area areaOfShape;
	
	public Shape(ShapeSides s,Area a) {
		this.noOfSides = s;
		this.areaOfShape = a;
	}
	
	public abstract void calculate();

	public ShapeSides getNoOfSides() {
		return noOfSides;
	}

	public void setNoOfSides(ShapeSides noOfSides) {
		this.noOfSides = noOfSides;
	}

	public Area getAreaOfShape() {
		return areaOfShape;
	}

	public void setAreaOfShape(Area areaOfShape) {
		this.areaOfShape = areaOfShape;
	}

	@Override
	public String toString() {
		return "Shape [noOfSides=" + noOfSides + ", areaOfShape=" + areaOfShape + "]";
	}
	
	
	

}
