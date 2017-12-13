
public class Graduate extends Info {
	
	public double scholarship;
	public boolean assistant;

    Graduate(){}
    Graduate(String a, int b,String c,int d,double e,boolean f,double g){

    super(a,b,c,d,e);

       assistant = f;

    if(scholarship <= 1 && 0<=scholarship){
       scholarship = g;
       }

    }

    public String getAssistant(){

    if(assistant==true)

      return "교육조교";

    else

      return "연구조교";
    }
    
    public void setAssistant(boolean f){this.assistant = f;}

    public double getScholarship(){return scholarship;}

    public void setScholarship(double g){

    if(0<=scholarship && scholarship<=1){scholarship = g;}

    }

    public String toString(){

    	return super.toString()+" 조교유형:"+getAssistant()+" 장학금비율:"+scholarship;}

    	}
