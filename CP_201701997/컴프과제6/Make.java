import java.util.Scanner;

public class Make {
 static Login b = new Login();
 
	public static String id;
	public static String ps;
	
public static void main(String[] args) {
		
		
		System.out.println("<계쩡생성>");
	Scanner input = new Scanner (System.in) ;
	System.out.print("아이디를 입력하시오 : ");
		id = input.nextLine();	
	System.out.print("비밀번호를 입력하시오 : ");
	    ps =input.nextLine();
	    
	    b.입력();
	    b.테스트();
	}


}
