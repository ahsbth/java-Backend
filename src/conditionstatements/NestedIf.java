package conditionstatements;

public class NestedIf {

	public static void main(String[] args) {
// WAP to find the greatest value from three nos;
		int a=12;
		int b=2;
		int c=3;
		if(a>b) {
			if(a>c)
			{
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
	}

}
