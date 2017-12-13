import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
      int 평;
      double 평방;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("평을 입력하세요: ");
      평 = input.nextInt();
      
      평방 = 평 *3.3058 ;
      System.out.print(평 + "평은 " + 평방 + "평방미터 입니다. ");
      
      
	}

}
