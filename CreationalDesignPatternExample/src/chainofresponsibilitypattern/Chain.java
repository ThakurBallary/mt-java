package chainofresponsibilitypattern;

public interface Chain {
	public void setNext(Chain nextInChain);
	public void process(Number request);

}
