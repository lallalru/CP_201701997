import java.util.Scanner;


public class Movie {

   public static void main(String[] args) {
      int seat[]= {0,0,0,0,0,1,1,1,0,0};
      int input;

      Scanner choose=new Scanner(System.in);
      
      
      System.out.println("�¼��� �����Ͻðڽ��ϱ�?(0 �Ǵ� 1)");
      input=choose.nextInt();
      
      
      
      if(input==1) {
      
         System.out.println("������ ���� ���´� ������ �����ϴ�");
         System.out.println("----------------------------");
            
         for(int i=0;i<seat.length;i++) {
            System.out.print((i+1)+" " );
         }
         System.out.println("\n"+"----------------------------");
         for(int i=0;i<seat.length;i++) {
            System.out.print(seat[i]+" ");
         }
         
         
         System.out.println("\n"+"���° �¼��� �����Ͻðڽ��ϱ�?");
         input=choose.nextInt();
         
         if(seat[input]==1) System.out.println("�̹� ���ŵ� �¼��Դϴ�");
         
         
         else if(seat[input]==0) {
            System.out.println("����Ǿ����ϴ�");
            seat[input]=1;
            System.out.println("�¼� ���Ÿ� �����մϴ�");
            
         }
         
            
      }
      else System.out.println("�¼� ���Ÿ� �����մϴ�");

   }

}