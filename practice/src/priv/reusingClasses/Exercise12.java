package priv.reusingClasses;


/**
Add a proper hierarchy of dispose( ) methods to all the classes in
Exercise 9.
 * 
 * @page think 195
 * @author hudongyu
 *
 *手动清理对象内存的情况
 *
 */
class C1c{
	C1c(){
		System.out.println("init C1");
	}
	public void dispose(){
		System.out.println("dispose C1");
	}
}

class C2c{
	C2c(){
		System.out.println("init C2");
	}
	public void dispose(){
		System.out.println("dispose C2");
	}
}

class C3c{
	C3c(){
		System.out.println("init C3");
	}
	public void dispose(){
		System.out.println("dispose C3");
	}
}

class Rootc{
	C1c c1 = new C1c();
	C2c c2 = new C2c();
	static C3c c3 = new C3c();
	Rootc(){
		System.out.println("init Root");
	}
	public void dispose(){
		System.out.println("dispose Root");
		c1.dispose();
		c2.dispose();
		c3.dispose();
	}
}
public class Exercise12 extends Rootc{
	static C1c c1 = new C1c();
	C2c c2 = new C2c();
	C3c c3 = new C3c();
	public void dispose(){
		System.out.println("dispose Exercise12");
		super.dispose();
	}
	public static void main(String[] args) {
		Exercise12 e = new Exercise12();
		e.dispose();
	}
}

/**
init C3
init C1
init C1
init C2
init Root
init C2
init C3
dispose Exercise12
dispose Root
dispose C1
dispose C2
dispose C3
 */
