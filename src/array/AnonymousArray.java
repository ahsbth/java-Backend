package array;

public class AnonymousArray {

	public static void main(String[] args) {
		anomsarray(new int[]{12,34,353,3});
	}
	public static void anomsarray(int a[]) {
		
		int s=a.length;
		for(int i=0;i<s;i++) {
			System.out.println(a[i]);
		}
	}

}
