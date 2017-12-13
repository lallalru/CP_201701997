
public class Person {
	public String name;
	public int phone;
	public String add;

	public Person(String a, int b, String c) {
		name = a;
		phone = b;
		add = c;
	}
	public Person(){}

	public String getName() {
		return name;
	}

	public void setName(String i) {
		name = i;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int i) {
		phone = i;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String i) {
		add = i;
	}


}
