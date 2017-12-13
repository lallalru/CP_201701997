
public class InfoTest {

	public static void main(String[] args) {

		Info a = new Info("김주영",201701997,"컴퓨터공학과",1,17);

		System.out.println(a);

		Undergraduate b= new Undergraduate("홍길동",201701111,"컴퓨터공학과",2,18,"그로우");

		System.out.println(b);

		Graduate c = new Graduate("고길동",201702222,"컴퓨터공학과",2,21,true,0.9);

		System.out.println(c);

		}
}
