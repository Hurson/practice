package priv.reusingClasses;

/**
 * 
Modify Detergent.java so that it uses delegation.
 * @page 195
 * @author hudongyu
 *
 *验证"组合"式引用。（即把某对象作为另一对象的成员变量，使得成为一个包含关系的子集，获得该类的所有属性）
 */
class Pic{
	public void syso(){
		System.out.println("Pic's!");
	}
}

public class Exercise11 {
	public String c;
	Pic pic = new Pic();
	public void sys(){
		pic.syso();
	}
	public static void main(String[] args) {
		Exercise11 e = new Exercise11();
		e.sys();
	}
}

/**
 * Pic's!
 */
