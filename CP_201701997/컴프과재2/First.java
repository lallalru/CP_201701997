
import java.util.Scanner;

 public class First {

	public static void main(String[] args) {

		int ��;
		int ����;
		int ��;
		int ����;
		int pig;
		Scanner input= new Scanner(System.in);
		
		System.out.print("�ʿ��� ������ �Է��ϼ���: ");
		�� = input.nextInt();
		
		System.out.print("���ʿ��� ������ �Է��ϼ���: ");
	    ���� = input.nextInt();
	    
	    System.out.print("����� ������ �Է��ϼ���: ");
	    �� = input.nextInt();
	    
	    System.out.print("������� ������ �Է��ϼ���");
	      ����  = input.nextInt();
	      
	      pig = ��*10 + ����*50 + ��*100 + ����*500 ; 
		
	      System.out.print("�����뿡 �ִ� �ݾ��� " + pig + "�� �Դϴ�.");
	}

}
