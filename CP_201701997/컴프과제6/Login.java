import java.util.*;

public class Login {
	Make a = new Make();
	
	public static String id2;
    public static String ps2;
	
	public void 입력() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("<로그인>");
		System.out.print("ID: ");
		id2= input.nextLine();
		System.out.print("PS: ");
		ps2 = input.nextLine();
		
	}
	
  
	public void 테스트() {
	
	if (((a.id) .equals (id2))&&((a.ps) .equals(ps2))) {
			System.out.print("로그인에 성공하였습니다.");
		    }
	
	else {
		System.out.print("로그인에 실패하였습니다.");
	}
		
   }
}
