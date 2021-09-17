
package Assignment2;

public class TriangleConstructor {
	
	double area;
	double perimeter;
	int a,b,c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriangleConstructor t = new TriangleConstructor(3,4,5);
		t.printArea();
		t.printPerimeter();
	}
	
	public TriangleConstructor(int a,int b,int c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
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


