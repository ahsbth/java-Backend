package conditionstatements;

public class Continue5 {

	public static void main(String[] args) {
		int i=2;
		while(i<=30) {
			if(i%2!=0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
