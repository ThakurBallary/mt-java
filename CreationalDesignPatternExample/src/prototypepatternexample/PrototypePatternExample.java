package prototypepatternexample;

import prototypepatternexample.ProtytypeFactory.ModelType;

public class PrototypePatternExample {

	public static void main(String[] args) {
		
		try {
			
			String customerPrototype = ProtytypeFactory.getInstance(ModelType.Customer).toString();
			System.out.println(customerPrototype);
			
			
			String foodItemPrototype = ProtytypeFactory.getInstance(ModelType.FoodItem).toString();
			System.out.println(foodItemPrototype);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
