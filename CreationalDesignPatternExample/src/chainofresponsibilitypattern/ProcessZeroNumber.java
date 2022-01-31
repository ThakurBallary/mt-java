package chainofresponsibilitypattern;

public class ProcessZeroNumber implements Chain{
	
	private Chain nextInChain;

	@Override
	public void setNext(Chain nextInChain) {
		this.nextInChain = nextInChain;
		
	}

	@Override
	public void process(Number request) {
		if(request.getNumber() == 0) {
			System.out.println("Number is zero =" + request.getNumber());
		}else {
			nextInChain.process(request);
		}
		
	}
}
