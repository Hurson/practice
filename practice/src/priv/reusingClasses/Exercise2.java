package priv.reusingClasses;
/**
 * Inherit a new class from class Detergent. Override scrub( ) and add a
 * new method called sterilize( )
 * @page think 191
 * @author hudongyu
 *
 */

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute(); x.apply(); x.scrub();
		System.out.println(x);
	}
}


class Detergent extends Cleanser {
// Change a method:
public void scrub() {
append(" Detergent.scrub()");
super.scrub(); // Call base-class version
}
// Add methods to the interface:
public void foam() { append(" foam()"); }
// Test the new class:
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}
}


public class Exercise2 extends Detergent{
	public void scrub(){
		append(" Exercise2.scrub()");
		super.scrub();
	}
	public void sterilize(){
		append(" sterilize() ");
	}
	public static void main(String[] args) {
		Exercise2 e = new Exercise2();
		e.scrub();
		e.sterilize();
		System.out.println(e);
		System.out.println("Testing Detergent class");
		Detergent.main(args);
	}
}
