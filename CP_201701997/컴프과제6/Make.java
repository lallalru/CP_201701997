import java.util.Scanner;

public class Make {
 static Login b = new Login();
 
	public static String id;
	public static String ps;
	
public static void main(String[] args) {
		
		
		System.out.println("<���Ļ���>");
	Scanner input = new Scanner (System.in) ;
	System.out.print("���̵� �Է��Ͻÿ� : ");
		id = input.nextLine();	
	System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
	    ps =input.nextLine();
	    
	    b.�Է�();
	    b.�׽�Ʈ();
	}


}
