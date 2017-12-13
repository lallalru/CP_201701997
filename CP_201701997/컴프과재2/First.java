
import java.util.Scanner;

 public class First {

	public static void main(String[] args) {

		int 십;
		int 오십;
		int 백;
		int 오백;
		int pig;
		Scanner input= new Scanner(System.in);
		
		System.out.print("십원의 개수를 입력하세요: ");
		십 = input.nextInt();
		
		System.out.print("오십원의 개수를 입력하세요: ");
	    오십 = input.nextInt();
	    
	    System.out.print("백원의 개수를 입력하세요: ");
	    백 = input.nextInt();
	    
	    System.out.print("오백원의 개수를 입력하세요");
	      오백  = input.nextInt();
	      
	      pig = 십*10 + 오십*50 + 백*100 + 오백*500 ; 
		
	      System.out.print("저금통에 있는 금액은 " + pig + "원 입니다.");
	}

}
