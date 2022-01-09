package oops.inheritance;

public class Circle extends Shape {

	double radius = 1.0;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}

}