package priv.reusingClasses;



/**
Create two classes, A and B, with default constructors (empty argument
lists) that announce themselves. Inherit a new class called C from A, and create a member of
class B inside C. Do not create a constructor for C. Create an object of class C and observe
the results.
 * 
 * @page think 192
 * @author hudongyu
 *
 *
 *�ȳ�ʼ������  �ٳ�ʼ����Ա��Exercise5�൱��ʹ����Ĭ�Ϲ�������
 */
class A{
	A(){
		System.out.println("init A");
	}
}

class B{
	B(){
		System.out.println("init B");
	}
}

public class Exercise5 extends A{
	B b = new B();
	public static void main(String[] args) {
		Exercise5 e = new Exercise5();
	}
}
/**
init A
init B
 */
