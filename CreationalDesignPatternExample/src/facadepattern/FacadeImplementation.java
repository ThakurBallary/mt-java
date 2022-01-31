package facadepattern;

public class FacadeImplementation {
	
	
	public float cubeX(float a) {
		A aclass = new A();
		return aclass.someCode(a);
		
	}
	
	public float cubeXTimes2(float a) {
		A aclass = new A();
		B bclass = new B();
		return bclass.someCodeToDoubleCubeValue(a, aclass);
		
	}
	
	public float multiplyBoth(float a) {
		A aclass = new A();
		B bclass = new B();
		C cclass = new C();
		return cclass.doMuliplicationofCubeAndDoubleValueOfCube(a, aclass, bclass);
	}

}
