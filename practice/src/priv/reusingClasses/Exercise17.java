package priv.reusingClasses;

/**
Modify Exercise 16 so that Frog overrides the method definitions from
the base class (provides new definitions using the same method signatures). Note what
happens in main( ).
 * @page 204
 * @author hudongyu
 *
 *若拥有子类型对应方法将不进行向上转换
 */

class Amphibian{
	public void eat(Amphibian a){
		System.out.println("eat something super");
	}
}

public class Exercise17 extends Amphibian{
	public void eat(Exercise17 a){
		System.out.println("eat something");
	}
	public static void main(String[] args) {
		Exercise17 e = new Exercise17();
		e.eat(e);
	}
}

/**
 * eat something
 */
