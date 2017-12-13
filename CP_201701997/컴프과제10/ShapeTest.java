import java.util.Scanner;

public class ShapeTest {
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("�ʺ� �Է��ϼ��� : ");
		int width = input.nextInt();
	        
		System.out.print("���̸� �Է��ϼ��� : ");
		int height = input.nextInt();
	        
	Shape [] shape = new Shape [3];
	shape[0] = new Rectangle(width,height);
	shape[1] = new Triangle(width, height);
	shape[2] = new Circle(width);
	for (Shape s1 : shape) {
		System.out.println("�� ������ ���̴� " +  s1.area() + " �Դϴ�.");
	}
	
}
}
