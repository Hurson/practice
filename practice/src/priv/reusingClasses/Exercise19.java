package priv.reusingClasses;

public class Exercise19 {
	final Fie fie;
	Exercise19(){
		fie = new Fie("default");
	}
	Exercise19(String a){
		fie = new Fie(a);
	}
	public static void main(String[] args) {
		Exercise19 e1 = new Exercise19();
		Exercise19 e2 = new Exercise19("String constructors");
		System.out.println(e1.fie.a);
		System.out.println(e2.fie.a);
	}
}
class Fie{
	final String a;
	Fie(String a){
		this.a=a;
	}
}
