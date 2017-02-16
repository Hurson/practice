package priv.reusingClasses;

/**
 Create a base class with only a non-default constructor, and a derived
class with both a default (no-arg) and non-default constructor. In the derived-class
constructors, call the base-class constructor.
 * 
 * @page think 193
 * @author hudongyu
 *
 *
 *每个构造器在父类没有默认构造器的情况下都需要显式调用一次父类的构造器
 */
class T{
	T(String s){
		System.out.println("init T "+s);
	}
}

public class Exercise8 extends T{
	Exercise8(){
		super("default");
		System.out.println("init default");
	}
	Exercise8(String s){
		super(s);
		System.out.println("init"+s);
	}
	public static void main(String[] args) {
		Exercise8 e1 = new Exercise8();
		Exercise8 e2 = new Exercise8("non-default");
	}
}
/**
init T default
init default
init T non-default
initnon-default
 */
