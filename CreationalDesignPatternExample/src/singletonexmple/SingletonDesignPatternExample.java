package singletonexmple;

public class SingletonDesignPatternExample {
	
	public static SingletonDesignPatternExample sdpe = new SingletonDesignPatternExample();
	
	private SingletonDesignPatternExample() {
		System.out.println("Creating the instance ..............");
	}
	
	private static SingletonDesignPatternExample getInstance() {
		return sdpe;
	}

	public static void main(String[] args) {
		
		SingletonDesignPatternExample sdpe1 = SingletonDesignPatternExample.getInstance();
		SingletonDesignPatternExample sdpe2 = SingletonDesignPatternExample.getInstance();
		System.out.println("Hashcode of sdpe1  =  " + sdpe1.hashCode());
		System.out.println("Hashcode of sdpe2  =  " + sdpe2.hashCode());
	}

}
