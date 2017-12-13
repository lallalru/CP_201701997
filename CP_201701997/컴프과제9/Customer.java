
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
		
		c1.setName("김주영");
		c1.setPhone(10);
		c1.setAdd("대전");
    
		c2.setName("함지희");
		c2.setPhone(23);
		c2.setAdd("광주");
		
    System.out.println("고객의 이름은  "+ c1.getName() + "   전화번호는  "+ c1.getPhone() + "  주소는  " + c1.getAdd() + "  고객번호는  " + c1.number + "   마일리지는 " + c1.mileage+"점 입니다.");
    System.out.println("고객의 이름은  "+ c2.getName() + "   전화번호는  "+ c2.getPhone() + "  주소는  " + c2.getAdd() + "  고객번호는  " + c2.getNumber() + "   마일리지는 " +c2.getMileage()+ "점 입니다.");
    
	}

}

