package priv.reusingClasses;

/**
 * 
 * Prove the previous sentence
 * @page think 192
 * @author hudongyu
 *
 *证明继承关系中，在进行初始化时会先调用父类构造器，再调用子类构造器。
 *父类相当于子类的一个子对象
 *
 */
class father{
	father(){
		System.out.println("init father");
	}
}

public class Exercise3 extends father{
	Exercise3(){
		System.out.println("init Exercise3");
	}
	public static void main(String[] args) {
		Exercise3 e = new Exercise3();
	}
}
/**
 * output
 * init father
 * init Exercise3
 */
