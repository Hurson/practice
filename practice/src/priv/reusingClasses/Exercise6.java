package priv.reusingClasses;
/**
 * Using Chess.java, prove the statements in the previous paragraph
 * 
 * @page 193
 * @author hudongyu
 *
 *证明在父类没有初始化构造器时，子类必须显式的调用父类的构造器，进行初始化
 *
 */
class X{
	X(int i){
		System.out.println("init X "+i);
	}
}

class Y extends X{
	Y(int i){
		super(i*2);
		System.out.println("init Y "+i);
	}
}
public class Exercise6 extends Y{
	Exercise6(){
		super(10);
		System.out.println("init Exercise6");
	}
	public static void main(String[] args) {
		Exercise6 e = new Exercise6();
	}
}

/**
init X 20
init Y 10
init Exercise6
 */