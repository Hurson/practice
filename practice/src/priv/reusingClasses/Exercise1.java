package priv.reusingClasses;

/**
 *  Create a simple class. Inside a second class, define a reference to an object
 *  of the first class. Use lazy initialization to instantiate this object.
 * 
 * @page think 167
 * @author hudongyu
 *
 */
public class Exercise1 {
	public static void main(String[] args) {
		System.out.println("time's begin");
		Apple a = new Apple();
		if(a.weight==null){
			a.weight="1kg";
		}
		System.out.println("apple weight = "+a);
	}
}
class Apple{
	public String weight;
	public String toString(){
		return this.weight;
	}
}

