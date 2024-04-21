package conditionstatements;

public class ContinueStatement {

	public static void main(String[] args) {
//ContinueStatements is used for skip the some execution of code
		int x=0;
		while(x<10) {
			if(x==5) {
				x++;
				continue;
			}
			System.out.println(x);
			x++;
		}
		
	}
}
