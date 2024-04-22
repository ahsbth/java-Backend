package abstractclass;

public class Example1 {

	public static void main(String[] args) {
	
      Honda h=new Honda();
      h.bikemodel();
      h.speed();
      h.run();
	}

}
abstract class Bike{
	public void bikemodel() {
		System.out.println("Honda");
	}
	abstract void run();
	abstract void speed();
}
class Honda extends Bike{
	public void run() {
		System.out.println("Honda is running");
	}
	
	public void speed() {
		System.out.println("Speed is 80 km/h");
	}
	
}
