
public class Info {
	public  String name;
	public  int num;
	public  String major;
	public  int grade;
	public  double credit;

	public String getName() {return name;}
    public void setName(String i) {name = i;}
    
    public int getNum() {return num;}
    public void setNum(int i) {num = i;}
    
    public String getMajor() {return major;}
    public void setMajor(String i) {major = i;}
    
    public int getGrade() {return grade;}
    public void setGrade(int i) {grade = i;}
    
    public double getCredit() {return credit;}
    public void setCredit(double i) {credit = i;}
    
    public Info(){}
    public Info (String a, int b, String c, int d, double e){
    	  name =a; num = b; major =c; grade = d; credit = e;}

    public String toString(){
    	   return "이름:"+name+" 학번:"+num+" 전공:"+major+" 학년:"+grade+" 이수학점:"+credit ;
  }
}


