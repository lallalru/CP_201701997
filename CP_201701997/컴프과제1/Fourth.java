
import java.util.Scanner;

public class Fourth {
 public static void main (String []args) {
	 
	 int r;
	 int h;
	 float v;
	
	 Scanner input = new Scanner (System.in) ;
	 
	 System.out.print("������� �ظ��� �������� �Է��Ͻÿ�: ");
	 r = input.nextInt();
	 
	 System.out.print("������� ���̸� �Է��Ͻÿ�: ");
	 h = input. nextInt();
	 
	 v= (float) (r * r * h * 3.141592) ;
	 System.out.print("������� ���Ǵ� " + v + "�Դϴ�. ");
    }
}