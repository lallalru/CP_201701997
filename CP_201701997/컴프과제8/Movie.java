import java.util.Scanner;


public class Movie {

   public static void main(String[] args) {
      int seat[]= {0,0,0,0,0,1,1,1,0,0};
      int input;

      Scanner choose=new Scanner(System.in);
      
      
      System.out.println("좌석을 예약하시겠습니까?(0 또는 1)");
      input=choose.nextInt();
      
      
      
      if(input==1) {
      
         System.out.println("현재의 예약 상태는 다음과 같습니다");
         System.out.println("----------------------------");
            
         for(int i=0;i<seat.length;i++) {
            System.out.print((i+1)+" " );
         }
         System.out.println("\n"+"----------------------------");
         for(int i=0;i<seat.length;i++) {
            System.out.print(seat[i]+" ");
         }
         
         
         System.out.println("\n"+"몇번째 좌석을 예매하시겠습니까?");
         input=choose.nextInt();
         
         if(seat[input]==1) System.out.println("이미 예매된 좌석입니다");
         
         
         else if(seat[input]==0) {
            System.out.println("예약되었습니다");
            seat[input]=1;
            System.out.println("좌석 예매를 종료합니다");
            
         }
         
            
      }
      else System.out.println("좌석 예매를 종료합니다");

   }

}