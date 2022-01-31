package facadepattern;

public class FacadePatternExample {

	public static void main(String[] args) {
		FacadeImplementation fi = new FacadeImplementation();
		int a = 3;
		System.out.println("Cube of  " + a + "=" + fi.cubeX(a));
		System.out.println("Cube of  " + a + "=" + fi.cubeXTimes2(a));
	}

}
