package priv.reusingClasses;

/**
Create a class with a method that is overloaded three times. Inherit a
new class, add a new overloading of the method, and show that all four methods are available
in the derived class.
 * 
 * @page 200
 * @author hudongyu
 *
 *多态和重载方法的实验
 */
class Super13{
	public void method(int i){
		System.out.println("int");
	}
	public void method(String s){
		System.out.println("String");
	}
	public void method(long l){
		System.out.println("long");
	}
}

public class Exercise13 extends Super13{
	public void method(float f){
		System.out.println("float");
	}
	public static void main(String[] args) {
		Exercise13 e = new Exercise13();
		e.method(1.0f);
		e.method(1);
		e.method(1l);
		e.method("1");
	}
}

/**
float
int
long
String
 */
