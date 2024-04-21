package conditionstatements;

public class IfStatement {

	public static void main(String[] args) {
//		Wap to check to string equals are not
        String s1="Ram";
        String s2=new String("Shyam");
        if(s1==s2) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
        if(s1.equals(s2)) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
	}

}
