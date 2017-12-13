
import java.util.Scanner;

		public class Second {

	public static void main(String[] args) {
		
		int F;
		int C;
		Scanner input = new Scanner (System.in);
	
		System.out.print("화씨온도를 입력하시오: ");
	    F = input.nextInt();
	    
	    C =  (F-32)*5/9 ;
	    System.out.print(F + "화씨온도는 " + C + "섭씨온도입니다.");
	
	
	}

}

