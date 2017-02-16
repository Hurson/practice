package priv.reusingClasses;



/**
 * Prove that the base-class constructors are (a) always called and (b) called
 * before derived-class constructors.
 * 
 * 证明父类的初始化构造器总在子类之前被调用
 * 
 * @page think 192
 * @author hudongyu
 *
 *子类在初始化过程中始终会先初始化父类（子对象），再初始化其它成员
 */
class Father1{
	Father1(){
		System.out.println("init Father");
	}
}

public class Exercise4 extends Father1{
	//静态方法
	static void print(){
		System.out.println("static print");
	}
	Exercise4(){
		this.print();
		System.out.println("init Excercise4");
	}
	public static void main(String[] args) {
		System.out.println("begin");
		Exercise4 e = new Exercise4();
	}
	/**
	 * 静态代码块比main方法更早执行
	 */
	//静态代码块
	static{
		System.out.println("init static");
	}
}
/**
init static
begin
init Father
static print
init Excercise4
 */

