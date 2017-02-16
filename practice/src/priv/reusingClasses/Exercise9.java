package priv.reusingClasses;


/**
Create a class called Root that contains an instance of each of the classes
(that you also create) named Component1, Component2, and Component3. Derive a
class Stem from Root that also contains an instance of each “component.” All classes should
have default constructors that print a message about that class.
 * 
 * @page think 193
 * @author hudongyu
 *
 *子类构造器最先调用父类构造器，初始化父类成员后执行构造器中方法。完成后再初始化子类的成员，并执行子类构造器方法
 *## 静态成员总是最先加载的。父类静态成员先于子类静态成员加载。
 *
 */
class C1{
	C1(){
		System.out.println("init C1");
	}
}

class C2{
	C2(){
		System.out.println("init C2");
	}
}

class C3{
	C3(){
		System.out.println("init C3");
	}
}

class Root{
	C1 c1 = new C1();
	C2 c2 = new C2();
	static C3 c3 = new C3();
	Root(){
		System.out.println("init Root");
	}
}
public class Exercise9 extends Root{
	static C1 c1 = new C1();
	C2 c2 = new C2();
	C3 c3 = new C3();
	public static void main(String[] args) {
		Exercise9 e = new Exercise9();
	}
}

/**
init C1
init C1
init C2
init C3
init Root
init C2
init C3
 */
