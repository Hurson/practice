package priv.reusingClasses;

/**
 Modify Exercise 5 so that A and B have constructors with arguments
instead of default constructors. Write a constructor for C and perform all initialization within
C��s constructor.
 * 
 * 
 * @page think 193
 * @author hudongyu
 *
 *����ʾ���ø���Ĺ�����ʱ������������ڹ���������ǰ
 */
class A2{
	A2(String s){
		System.out.println("init A "+s);
	}
}

class B2 {
	B2(String s){
		System.out.println("init B");
	}
}

public class Exercise7 extends A2{
	Exercise7(){
		super("hahahaha");
		B2 b = new B2("hehehehe");
	}
	
	public static void main(String[] args) {
		Exercise5 e = new Exercise5();
	}
}
/**
init A
init B 
 */
