package languageFundamentle;

public class Casting {

	public static void main(String[] args) {
		/*
		 * there are two type casting in java
		 * 
		 * 1.Implicit type casting(Automatic conversion by Compiler( smaller to bigger)
		 * 
		 * 2.Explicit type casting(its done by the users)
		 * 
		 */
//		1. Implicit automatic
		byte b = 123;
		int a = b;
		System.out.println(a);
		short s = 12232;
		int i = s;
		System.out.println(i);
		long l = i;
		System.out.println(l);
		double d = l;
		System.out.println(d);
		float f = 997.099f;
		double dd = f;
		System.out.println(dd);

//2. Explicit type conversion
		int in = 129;
		byte bt = (byte) in;
		System.out.println(bt);
		short st = 2344;
		byte byt = (byte) st;
		System.out.println(byt);
		long lv = 231124l;
		int inl = (int) lv;
		System.out.println(inl);
		float ft = 2324.98f;
		int inf = (int) ft;
		System.out.println(inf);
		double dv = 2424.45d;
		int id = (int) dv;
		System.out.println(id);
		char cb = (char) bt;
		System.out.println(cb);

	}

}
