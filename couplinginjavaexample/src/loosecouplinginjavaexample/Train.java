package loosecouplinginjavaexample;

public class Train implements Vehicle {

	@Override
	public void move() {
		System.out.println("Train is moving.......");
	}

}
