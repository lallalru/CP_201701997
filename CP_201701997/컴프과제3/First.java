import java.util.Scanner ;
public class First {

	public static void main(String[] args) {
		int a; int b; int c;
		int i;
		
    System.out.print("정수를 입력하세요 :");
	Scanner input = new Scanner(System.in);
	a = input.nextInt();
	
	System.out.print("정수를 입력하세요 :");
	Scanner input1 = new Scanner(System.in);
	b = input.nextInt();
	
	System.out.print("정수를 입력하세요 :");
	Scanner input2 = new Scanner(System.in);
	c = input.nextInt();
	
	if (b<c) {
		if (a<b)
			System.out.print("정렬된 숫자 : " +a+" " +b + " " + c);
		  if (a>b)
			  if(c>a)
			System.out.print("정렬된 숫자 : " +b+" "+ a + " " + c);
			  else
				  System.out.print("정렬된 숫자 : " +b+" " +c+ " "+ a);
		  }
	 else if (b>c) 
    	if (a>b)
    		System.out.print("정렬된 숫자 : " +c+" " +b+ " "+ a);
     	 
        else { 
    		if(a<c)
               System.out.print("정렬된 숫자 : " +a+ " " +c+ " "+ b);	
    	    if(a>c)
    	    	System.out.print("정렬된 숫자 : " +c+" " +a+ " "+ b);
        }
    		
        }

}
