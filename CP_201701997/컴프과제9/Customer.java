
public class Customer extends Person {
	public int number;
	public int mileage;

	public Customer(int i, int j){
		number = i;  mileage = j;
	}
  
	public  Customer() {
	}

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int i) {
		number = i;
	}

	public int getMileage(){
		return mileage;
	}
	
	public void setMileage(int i) {
		mileage = i;
	}
	
	public void Customerprint(){
		Customer c1 = new Customer(8888, 1000);
		Customer c2 = new Customer();

		c2.setNumber(9999);
		c2.setMileage(2000);
		
		c1.setName("���ֿ�");
		c1.setPhone(10);
		c1.setAdd("����");
    
		c2.setName("������");
		c2.setPhone(23);
		c2.setAdd("����");
		
    System.out.println("���� �̸���  "+ c1.getName() + "   ��ȭ��ȣ��  "+ c1.getPhone() + "  �ּҴ�  " + c1.getAdd() + "  ����ȣ��  " + c1.number + "   ���ϸ����� " + c1.mileage+"�� �Դϴ�.");
    System.out.println("���� �̸���  "+ c2.getName() + "   ��ȭ��ȣ��  "+ c2.getPhone() + "  �ּҴ�  " + c2.getAdd() + "  ����ȣ��  " + c2.getNumber() + "   ���ϸ����� " +c2.getMileage()+ "�� �Դϴ�.");
    
	}

}

