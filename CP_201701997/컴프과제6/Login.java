import java.util.*;

public class Login {
	Make a = new Make();
	
	public static String id2;
    public static String ps2;
	
	public void �Է�() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("<�α���>");
		System.out.print("ID: ");
		id2= input.nextLine();
		System.out.print("PS: ");
		ps2 = input.nextLine();
		
	}
	
  
	public void �׽�Ʈ() {
	
	if (((a.id) .equals (id2))&&((a.ps) .equals(ps2))) {
			System.out.print("�α��ο� �����Ͽ����ϴ�.");
		    }
	
	else {
		System.out.print("�α��ο� �����Ͽ����ϴ�.");
	}
		
   }
}
