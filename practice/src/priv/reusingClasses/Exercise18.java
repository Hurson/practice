package priv.reusingClasses;

import java.util.Random;

/**
Create a class with a static final field and a final field and
demonstrate the difference between the two. 
 * 
 * @page 206
 * @author hudongyu
 *
 *final实例常量，在类实例化的时候被初始化。
 *static finnal 类常量，在虚拟机加载类时被初始化
 */
public class Exercise18 {
	public final Random a = new Random(47);
	public static final Random b = new Random(48);
	public static void main(String[] args) {
		Exercise18 e1 = new Exercise18();
		System.out.println(e1.a);
		System.out.println(e1.b);
		Exercise18 e2 = new Exercise18();
		System.out.println(e2.a);
		System.out.println(e2.b);
	}
}
/**
java.util.Random@27daf835
java.util.Random@18dd7404
java.util.Random@72ebbf5c
java.util.Random@18dd7404
e1.b和e2.b内存地址相同，可以确定为同一对象
 */
