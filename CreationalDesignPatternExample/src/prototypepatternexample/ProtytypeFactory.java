package prototypepatternexample;

import java.util.HashMap;
import java.util.Map;

public class ProtytypeFactory {
	
	public static class ModelType {
		public static final String Customer = "customer";
		public static final String FoodItem = "foodItem";
	}
	
	private static Map<String,IPrototypeCreation> prototypesOfClasses =
													new HashMap<String,IPrototypeCreation>();
	
	static {
		prototypesOfClasses.put(ModelType.Customer, new Customer());
		prototypesOfClasses.put(ModelType.FoodItem, new FoodItem());
	}
	
	public static IPrototypeCreation getInstance(final String classInstance) throws CloneNotSupportedException{
		return (prototypesOfClasses.get(classInstance)).clone();
	}

}
