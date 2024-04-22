package array;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		
		int arr[]= {12,42,43,1,451};
		array(arr);

	}
	
	public static void array(int a[]) {
		int f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no for find it");
		int n=sc.nextInt();
		int s=a.length;
		for(int i=0;i<=s;i++) {
			
			if(n==i) {
				f=1;
				break;
			}
		}
		if(f==1) {
			System.out.println("No is found");
		}
		else {
			System.out.println("No is not found");
		}
	}

}
