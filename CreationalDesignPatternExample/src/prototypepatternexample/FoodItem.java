package prototypepatternexample;

public class FoodItem implements IPrototypeCreation{
	
	private String foodItemName;

	public String getFoodItemName() {
		return foodItemName;
	}

	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}

	@Override
	public FoodItem clone() throws CloneNotSupportedException{
		System.out.println("Cloning Customer Object.....");
		return (FoodItem)super.clone();
	}

	@Override
	public String toString() {
		return "FoodItem [foodItemName=" + foodItemName + "]";
	}
	
	
}
