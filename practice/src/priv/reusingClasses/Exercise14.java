package priv.reusingClasses;


/**
In Car.java add a service( ) method to Engine and call this method
in main( )
 * @page 201
 * @author hudongyu
 *
 *区分继承和组合的逻辑区别
 *
 */

class Engine {
	public void start() {}
	public void rev() {}
	public void stop() {}
	public void service(){
		System.out.println("service");
	}
}
class Wheel {
	public void inflate(int psi) {}
}
class Window {
	public void rollup() {}
	public void rolldown() {}
}
class Door {
	public Window window = new Window();
	public void open() {}
	public void close() {}
}

public class Exercise14 {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door
	left = new Door(),
	right = new Door(); // 2-door
	public Exercise14() {
	for(int i = 0; i < 4; i++)
		wheel[i] = new Wheel();
	}
	public static void main(String[] args) {
		Exercise14 car = new Exercise14();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engine.service();
	}
}
