
import java.util.Scanner;

		public class Third {

	public static void main(String[] args) {
		
		int height;
		int feet;
		double inch;
		Scanner input = new Scanner (System.in);
	
		System.out.print("Ű�� �Է��Ͻÿ�: ");
	    height = input.nextInt();
	    
	   feet = (int) (height/12/2.54);
	    inch = (height - (feet * 12*2.54))/ 2.54 ;
	   
	    System.out.print(height + "cm�� " + feet + "��Ʈ " + inch + "��ġ�Դϴ�.");
	
	
	}

}
