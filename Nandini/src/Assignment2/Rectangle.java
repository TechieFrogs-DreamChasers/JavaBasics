package Assignment2;
public class Rectangle {
	
	int side1;
	int side2;
	double area;
	double length;
	double breadth;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle1 = new Rectangle(4,5);
		Rectangle rectangle2 = new Rectangle(5,8);
		
		rectangle1.Area();
		rectangle2.Area();
		
	}
	
	public Rectangle(double length,double breadth) {
		
		this.length = length;
		this.breadth = breadth;	
	}
	
	void Area() {
		
		area = (length * breadth);
		System.out.println("Area of a Rectangle: "+ area);
	}

}
