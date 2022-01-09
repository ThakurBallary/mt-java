package oops.inheritance;

import java.util.Scanner;

public class ShapeController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of a circle: ");
		double radius = sc.nextDouble();

		Circle c = new Circle();
		c.setRadius(radius);
		c.setColor("green");
		System.out.println("Radius of a circle: " + c.getRadius());
		System.out.println("Area of a circle: " + c.getArea());
		System.out.println("Perimeter of a circle: " + c.getPerimeter());
		System.out.println("Circle color: " + c.getColor());
		System.out.println("Circle color filled: " + c.isFilled());

		System.out.print("Enter width and length of a rectangle: ");
		double width = sc.nextDouble();
		double length = sc.nextDouble();

		Rectangle r = new Rectangle();
		r.setWidth(width);
		r.setLength(length);
		System.out.println("Width of a rectangle: " + r.getWidth());
		System.out.println("Length of a rectangle: " + r.getLength());
		System.out.println("Area of a rectangle: " + r.getArea());
		System.out.println("Perimeter of a rectangle: " + c.getPerimeter());
		System.out.println("Rectangle color: " + r.getColor());
		System.out.println("Rectangle color filled: " + r.isFilled());

		System.out.print("Enter side of a square: ");
		double side = sc.nextDouble();

		Square s = new Square();
		s.setSide(side);
		s.setColor("blue");
		s.setFilled(false);
		System.out.println("Side of a square: " + s.getSide());
		System.out.println("Area of a square: " + s.getArea());
		System.out.println("Perimeter of a square: " + s.getPerimeter());
		System.out.println("Square color: " + s.getColor());
		System.out.println("Square color filled: " + s.isFilled());

		sc.close();
	}

}
