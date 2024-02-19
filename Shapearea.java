import java.util.Scanner;

abstract class Shape{
	double a,b;
	abstract void printArea();
}

class Rectangle extends Shape{
	void printArea(){
		System.out.println("Area of rectangle is "+(a*b));
	}
}

class Triangle extends Shape{
	void printArea(){
		System.out.println("Area of triangle is "+(0.5*a*b));
	}
}

class Circle extends Shape{
	void printArea(){
		System.out.println("Area of circle is "+(3.14*a*a));
	}
}

class Shapearea{
	public static void main(String args[]){
	int n;
	Rectangle r = new Rectangle();
	Triangle t = new Triangle();
	Circle c = new Circle();
	

	while(true){
            Scanner s1 = new Scanner(System.in);
            System.out.println("\nMAIN MENU\nSelect shape\n1. Rectangle\n2. Triangle\n3. circle\nEnter choice:");
	        n = s1.nextInt();
	            
		switch(n){

		    case 1:
			{
				System.out.print("Enter length: ");
				r.a = s1.nextDouble();
				System.out.print("Enter breadth: ");
				r.b = s1.nextDouble();
				r.printArea();
				break;
			}
		    case 2:
			{
				System.out.print("Enter length: ");
				t.a = s1.nextDouble();
				System.out.print("Enter breadth: ");
				t.b = s1.nextDouble();
				t.printArea();
				break;
			}
		case 3:
			{
				System.out.print("\nEnter radius: ");
				c.a = s1.nextDouble();
				c.printArea();
				break;
			}

		    
		default: System.out.println("Invalid input");
	}
}
	}
}