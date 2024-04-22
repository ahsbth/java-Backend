package abstractclass;

public class Example2 {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		sbi.rate();
		HDFC hdfc=new HDFC();
		hdfc.rate();
		Axis axis=new Axis();
		axis.rate();
		Canera cn=new Canera();
		cn.rate();
				

	}

}
abstract class RBI{
	abstract void rate();
}
class SBI extends RBI{
	public void rate() {
		System.out.println("SBI rate is 5 %");
	}
}
class HDFC extends RBI{
	public void rate() {
		System.out.println("HDFC rate is 10 %");
	}
}
class Axis extends RBI{
	public void rate() {
		System.out.println("Axis rate is 12 %");
	}
}
class Canera extends RBI{
	public void rate() {
		System.out.println("SBI rate is 14 %");
	}
}
