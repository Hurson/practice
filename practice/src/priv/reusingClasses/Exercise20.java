package priv.reusingClasses;

/**
 * Show that @Override annotation solves the problem in this section.
 * @author hudongyu
 * private或final修饰的方法不会被继承，子类中的同名方法和父类方法无关联
 */
public class Exercise20 extends Sup201{
	//@Override
	private void a(){
		
	}
	
	@Override void b(){
		
	}
}
class Sup201{
	private void a(){
		System.out.println("super print");
	}
	void b(){
		System.out.println("super print");
	}
}
