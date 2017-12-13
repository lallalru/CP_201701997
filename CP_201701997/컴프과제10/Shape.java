
public class  Shape {
	 int width;  int height;
	 public Shape() {}
	public  Shape (int a, int b){
		width =a;
		height =b ;
	}
	int area() {
		return 0;
	}
	
}
	class Rectangle extends Shape{
	 public Rectangle (int a, int b) {
			super(a,b);
		 }
		 int area() {
			 return width * height;
		 }
	 }
	  class Triangle extends Shape{
		 public Triangle (int a, int b) {
			super(a,b);
		 }
		 int area() {
			return  width * height / 2;
		 }
		 
	 }
	  class Circle extends Shape{
		 int radius;
		 public Circle (int r) {
			 super(r,r);
		 }
		 
		 int area () {
			return (int)(width * width * 3.14); 
		 }
		 
	 }
	 
	
	 

	 
