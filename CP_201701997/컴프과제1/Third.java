
import java.util.Scanner;

		public class Third {

	public static void main(String[] args) {
		
		int height;
		int feet;
		double inch;
		Scanner input = new Scanner (System.in);
	
		System.out.print("키를 입력하시오: ");
	    height = input.nextInt();
	    
	   feet = (int) (height/12/2.54);
	    inch = (height - (feet * 12*2.54))/ 2.54 ;
	   
	    System.out.print(height + "cm는 " + feet + "피트 " + inch + "인치입니다.");
	
	
	}

}
