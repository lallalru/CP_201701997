import java.util.Scanner;

public class ShapeTest {
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("너비를 입력하세요 : ");
		int width = input.nextInt();
	        
		System.out.print("높이를 입력하세요 : ");
		int height = input.nextInt();
	        
	Shape [] shape = new Shape [3];
	shape[0] = new Rectangle(width,height);
	shape[1] = new Triangle(width, height);
	shape[2] = new Circle(width);
	for (Shape s1 : shape) {
		System.out.println("이 도형의 넓이는 " +  s1.area() + " 입니다.");
	}
	
}
}
