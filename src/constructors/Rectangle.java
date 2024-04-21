package constructors;

public class Rectangle {

	public static void main(String[] args) {
		ConsrtuctorOverload cov=new ConsrtuctorOverload();
		ConsrtuctorOverload cov1=new ConsrtuctorOverload(12,22);
		ConsrtuctorOverload cov2=new ConsrtuctorOverload(11.4f,4.5f);
	}

}
class ConsrtuctorOverload {
	int length;
	int width;
//	default constructor
	public ConsrtuctorOverload() {
		length=0;
		width=0;
		System.out.println("Length:"+length+"width:"+width);
	}
//	parameterized constructor
	public ConsrtuctorOverload(int length,int width) {
		int l=length;
		int w=width;
		System.out.println("Length:"+l+"width:"+w);
	}
//	parameterized constructor
	public ConsrtuctorOverload(float l,float w) {
		float lt=l;
		float wd=w;
		System.out.println("Lenght:"+lt+"width:"+wd);
	}
}
