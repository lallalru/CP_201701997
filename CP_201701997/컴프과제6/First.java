import java.util.*;

public class First {
	static String str;
	
	static String reverse(String s) {
		return str = s;
	}
	

	public static void reverse() {
	 int b = str.length();
      for(int a= 0; a < str.length(); a++) {
    	  System.out.print (str.charAt(b-1));
    	  b--;
    	if(b==0) {
    		break;
    	}
      }
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
	System.out.print("문자열을 입력하시오 : ");
    str = input.nextLine();
    reverse() ;
	}
	
}
