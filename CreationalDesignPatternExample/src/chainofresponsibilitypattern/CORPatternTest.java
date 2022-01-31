package chainofresponsibilitypattern;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CORPatternTest {
	
	public static final Logger CORLOGGER = Logger.getLogger(CORPatternTest.class.getName());
	public static void main(String[] args) {
		
		CORLOGGER.info("LOGGER Name = " + CORLOGGER.getName());
		
		
		
		Chain c1 = new ProcessNegitiveNumber();
		CORLOGGER.warning("Number can be negitive");
		Chain c2 = new ProcessZeroNumber();
		CORLOGGER.warning("Number can be zero");
		Chain c3 = new ProcessPositiveNumber();
		CORLOGGER.warning("Number can be positive");
		CORLOGGER.config("setting the chain of responsibility between c1 and c2");
		c1.setNext(c2);
		CORLOGGER.config("setting the chain of responsibility between c2 and c3");
		c2.setNext(c3);
		try {
		c1.process(new Number(-99));
		c1.process(new Number(99));
		c1.process(new Number(0));
		}catch (Exception e) {
			CORLOGGER.log(Level.SEVERE, "Exception occuret=" + e.getMessage());
		}
	}

}
