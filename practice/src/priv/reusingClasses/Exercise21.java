package priv.reusingClasses;

/**
 * Create a class with a final method. Inherit from that class and attempt
 * to overwrite that method.
 * @author hudongyu
 * 于private修饰的方法不同，final方法会限制子类创建同名方法，编译报错。
 */
public class Exercise21 extends Sup211{
	//public void a(){}
}
class Sup211{
	public final void a(){
		System.out.println("super method a");
	}
}