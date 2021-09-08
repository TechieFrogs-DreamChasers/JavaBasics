
public class Triangle {
	

	double area;
	double perimeter;
	int a=3,b=4,c=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		t.printArea();
		t.printPerimeter();
	}
	
	public Triangle() {
		
	}
	
	void printArea() {
		
		double s = ((a+b+c)/2);
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of a Triangle: "+ area);
	}
	
	void printPerimeter() {
		double s = a+b+c;
		System.out.println("Perimeter of the Triangle: "+ s);
	}
	
	

}
