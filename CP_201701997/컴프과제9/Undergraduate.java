
public class Undergraduate extends Info {
 public String club;
 
 
 public String getClub() {return club;}
 public void setClub(String i) {club = i;}
 
 public Undergraduate(){}
 public Undergraduate(String name, int num, String major, int grade, double credit, String club){
	 super(name,num,major,grade, credit);
	 this.club = club; 
     }

 public String toString (){
	 return super.toString() + "  동아리:"+ club ; }
}
