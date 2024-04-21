package conditionstatements;

public class ElseIF {

	public static void main(String[] args) {
// find the greatest from 4 no.
		int a=12;
		int b=4;
		int c=90;
		int d=78;
		if(a>b&&a>c&&a>d) {
			System.out.println(a);
		}
		else if(b>a&&b>c&&b>d) {
			System.out.println(b);
		}
		else if(c>a&&c>b&&c>d) {
			System.out.println(c);
		}
		else {
			System.out.println(d);
		}
	}

}
