import java.util.Random;

public class First{
 public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        int num1=0, num2=0, num3=0, num4=0, num5=0, num6=0;
        
        System.out.print("<로또 생성 프로그램> \n");

        for(int i = 1; i <= 6; i++) {
            int temp = rand.nextInt(45) + 1;
            if(num1 == temp || num2 == temp || num3 == temp || num4 == temp || num5 == temp || num6 == temp) {
                continue;
            } else {
                switch(i) {
                    case 1:
                        num1 = temp;
                        break;
                    case 2:
                        num2 = temp;
                        break;
                    case 3:
                        num3 = temp;
                        break;
                    case 4:
                        num4 = temp;
                        break;
                    case 5:
                        num5 = temp;
                        break;
                    case 6:
                        num6 = temp;
                        break;

                }
            }
        }

        System.out.println(num1 + " " + num2 + " " +num3 + " " +num4+ " " +num5+" " +num6);
      }
}