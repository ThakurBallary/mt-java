package prototypepatternexample;

public interface IPrototypeCreation extends Cloneable {
	
	public IPrototypeCreation clone() throws CloneNotSupportedException;

}
