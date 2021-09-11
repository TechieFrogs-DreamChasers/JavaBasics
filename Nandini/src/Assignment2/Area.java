import java.util.Scanner;

public class Area {
	
	Scanner sc = new Scanner(System.in);
	
	double length = sc.nextDouble();
	double breadth = sc.nextDouble();
	
	public static void main(String args[]) {
		
		System.out.println("Enter length and breadth of the Rectangle: ");
		
		Area rArea = new Area();
		rArea.setDim(rArea.length,rArea.breadth);
		rArea.getArea();		
	}
	
	void setDim(double length,double breadth){
		
		this.length = length;
		this.breadth = breadth;
		
	
	}
	
	void getArea() {
		
		double area;
		area = length*breadth;
		System.out.println(area);		
	}
}
