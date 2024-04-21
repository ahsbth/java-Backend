package methodeoverloading;

public class TemperatureConverter {

	public static void main(String[] args) {
		
   Converter cv=new Converter();
   cv.converts(68.8f);
   Converter cv1=new Converter();
   cv1.converts(40);
   Converter cv2=new Converter();
   cv2.converts(26.85d);
	}

}
class Converter{
//fahrenheight to celsius	
	public void converts(float f) {
		System.out.println("celsius="+(f-32)/1.8);
	}
//	clesius to fahrenheight
	public void converts(int c) {
		System.out.println("Fahrenheight="+(c*1.8+32));
	}
//	celsius to kelvin
	public void converts(double c) {
	
		System.out.println("Kelvin="+(c+273.15));
	}
	
}
