import java.util.Scanner;


public class Second {

	public static void main(String[] args) {
 double h; double x; double w;
 
 System.out.print("키를 입력하세요 :");
 Scanner input = new Scanner(System.in);
  h = input.nextInt();
  
  x= ((h-100)*0.9);
  System.out.print("체중을 입력하세요 :");
  Scanner input1 = new Scanner(System.in);
  w = input1.nextDouble();
  
  
  if (w<=0.9*x)
	  System.out.print("당신은 저체중입니다.");
  else if (w>=1.1*x)
	  System.out.print("당신은 과체중입니다.");
  else 
	  System.out.print("당신은 표준체중입니다.");
	}

}
