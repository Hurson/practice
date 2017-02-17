package priv.reusingClasses.exercise15;

/**
Create a class inside a package. Your class should contain a protected
method. Outside of the package, try to call the protected method and explain the results.
Now inherit from your class and call the protected method from inside a method of your
derived class.
 * 
 * @page 202
 * @author hudongyu
 *
 *protected 访问控制符的示例
 *在不同包的类中，不能直接访问该方法。可以通过继承关系，通过子类调用
 */
public class Exercise15 {
	protected void method(){
		System.out.println("protected methods");
	}
}
