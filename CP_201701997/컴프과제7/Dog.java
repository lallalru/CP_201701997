
public class Dog {

	private  String name ;
    public static String breed;
    private  int age;
    

	public Dog (String n, int a) {
     name = n;
     age = a;
    }
    
    public Dog(String n, String b, int a) {
    	name =n;
    	breed = b;
    	age = a;
    }
    
    public void print() {
    	System.out.println("�������� �̸� : " + name ) ;
    	
    	System.out.println("�������� ���� : " + age ) ;
    }
    
    public void print2() {
    	System.out.println("�������� �̸� : " + name ) ;
    	System.out.println("�������� ���� : " + breed ) ;
    	System.out.println("�������� ���� : " + age ) ;
}
}

