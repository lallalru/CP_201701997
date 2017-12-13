
import java.util.Scanner;

public class Fourth {
 public static void main (String []args) {
	 
	 int r;
	 int h;
	 float v;
	
	 Scanner input = new Scanner (System.in) ;
	 
	 System.out.print("원기둥의 밑면의 반지름을 입력하시오: ");
	 r = input.nextInt();
	 
	 System.out.print("원기둥의 높이를 입력하시오: ");
	 h = input. nextInt();
	 
	 v= (float) (r * r * h * 3.141592) ;
	 System.out.print("원기둥의 부피는 " + v + "입니다. ");
    }
}