package priv.reusingClasses;


/**
Modify the previous exercise so that each class only has non-default
constructors.
 * 
 * 
 * @page think 193
 * @author hudongyu
 *
 */
class C11{
	C11(String s){
		System.out.println("init C11");
	}
}

class C22{
	C22(String s){
		System.out.println("init C22");
	}
}

class C33{
	C33(String S){
		System.out.println("init C33");
	}
}

class Root1{
	C11 c1 = new C11("1");
	C22 c2 = new C22("1");
	static C33 c3 = new C33("1");
	Root1(String s){
		System.out.println("init Root");
	}
}
public class Exercise10 extends Root1{
	Exercise10(){
		super("1");
		System.out.println("init Exercise10");
	}
	static C11 c1 = new C11("1");
	C22 c2 = new C22("1");
	C33 c3 = new C33("1");
	public static void main(String[] args) {
		Exercise10 e = new Exercise10();
	}
}

/**
init C33
init C11
init C11
init C22
init Root
init C22
init C33
init Exercise10
 */
