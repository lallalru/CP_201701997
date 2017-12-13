
public class PlaneTest {

	public static void main(String[] args) {
	Plane a = new Plane();
	Plane b = new Plane("아시아나", "ㅁㄴㅇㄹ", 200);
	Plane c = new Plane(150);	

	b.getPlanes(); 
	
	System.out.print("생성된 비행기의 수는 " +b.planes);
	}

}
