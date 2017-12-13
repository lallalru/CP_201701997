
public class Plane {

	private String made;
	private String model;
	private int max;
	static public int planes=0; 

	void setmade(String i) {
		made = i ;
    }

	String getmade() {
		return made;
	}

	void setmodel(String i) {
		model = i;
	}

	String getmodel() {
		return model;
	}

	void setmax(int i) {
		max = i;
	}

	int getmax() {
		return max;
	}

	 Plane() {
	
	}
	 Plane(String m, String o, int a) {
		made = m;
		model =o;
		max= a;
		planes++;
	}
	 Plane(int a) {
		max = a;
		planes++;
	}
	
	 public static int getPlanes() {
		 return planes;
	}
	
	
	
	
}
	
	