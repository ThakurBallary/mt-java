package prototypepatternexample;

public class Customer implements IPrototypeCreation{
	
	private String customerName = null;
	
	
	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	@Override
	public Customer clone() throws CloneNotSupportedException{
		System.out.println("Cloning Customer Object.....");
		return (Customer)super.clone();
	}


	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + "]";
	}


}
