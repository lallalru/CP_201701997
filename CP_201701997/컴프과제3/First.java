import java.util.Scanner ;
public class First {

	public static void main(String[] args) {
		int a; int b; int c;
		int i;
		
    System.out.print("������ �Է��ϼ��� :");
	Scanner input = new Scanner(System.in);
	a = input.nextInt();
	
	System.out.print("������ �Է��ϼ��� :");
	Scanner input1 = new Scanner(System.in);
	b = input.nextInt();
	
	System.out.print("������ �Է��ϼ��� :");
	Scanner input2 = new Scanner(System.in);
	c = input.nextInt();
	
	if (b<c) {
		if (a<b)
			System.out.print("���ĵ� ���� : " +a+" " +b + " " + c);
		  if (a>b)
			  if(c>a)
			System.out.print("���ĵ� ���� : " +b+" "+ a + " " + c);
			  else
				  System.out.print("���ĵ� ���� : " +b+" " +c+ " "+ a);
		  }
	 else if (b>c) 
    	if (a>b)
    		System.out.print("���ĵ� ���� : " +c+" " +b+ " "+ a);
     	 
        else { 
    		if(a<c)
               System.out.print("���ĵ� ���� : " +a+ " " +c+ " "+ b);	
    	    if(a>c)
    	    	System.out.print("���ĵ� ���� : " +c+" " +a+ " "+ b);
        }
    		
        }

}
