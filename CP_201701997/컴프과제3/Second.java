import java.util.Scanner;


public class Second {

	public static void main(String[] args) {
 double h; double x; double w;
 
 System.out.print("Ű�� �Է��ϼ��� :");
 Scanner input = new Scanner(System.in);
  h = input.nextInt();
  
  x= ((h-100)*0.9);
  System.out.print("ü���� �Է��ϼ��� :");
  Scanner input1 = new Scanner(System.in);
  w = input1.nextDouble();
  
  
  if (w<=0.9*x)
	  System.out.print("����� ��ü���Դϴ�.");
  else if (w>=1.1*x)
	  System.out.print("����� ��ü���Դϴ�.");
  else 
	  System.out.print("����� ǥ��ü���Դϴ�.");
	}

}
