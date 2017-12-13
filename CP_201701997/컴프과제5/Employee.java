 public class Employee {
	 
public String name;
public String phone;
public String income;

void setName(String i) {
 name = i;
}

String getName() {
return name;
}

void setPhone(String i) {
 phone=i;
}

String getPhone() {
return phone;
}

void setIncome(String i) {
income = i;
}

String getIncome() {
return income;
}

void print() {
System.out.println("name: " + getName());
System.out.println("phone: " + getPhone());
System.out.println("income: " + getIncome());
}

}