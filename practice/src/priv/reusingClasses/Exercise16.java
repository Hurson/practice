package priv.reusingClasses;

/**
Create a class called Amphibian. From this, inherit a class called
Frog. Put appropriate methods in the base class. In main( ), create a Frog and upcast it to
Amphibian and demonstrate that all the methods still work 
 * @page 204
 * @author hudongyu
 *
 *验证类型的向上转换机制
 */

class Amphibianb{
	public void eat(Amphibianb a){
		System.out.println("eat something");
	}
}

public class Exercise16 extends Amphibianb{
	public static void main(String[] args) {
		Exercise16 e = new Exercise16();
		e.eat(e);
	}
}

/**
 * eat something
 */
