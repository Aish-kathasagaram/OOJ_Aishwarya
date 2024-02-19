import java.util.Scanner;
import java.lang.Math.*;
abstract class Shape
{
	int x,y;
	abstract double printarea();
}
class Rectangle extends Shape
{
	double printarea()
	{
		return x*y;
	}
}
class Triangle extends Shape
{
	double printarea()
	{
		return 0.5*x*y;
	}
}
class Circle extends Shape
{
	double printarea()
	{
		return Math.PI*x*x;
	}
}
class Sarea
{
	public static void main(String XX[])
	{
		int x,y,ch;double area;boolean p=true;
		Rectangle s1=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		Scanner s=new Scanner(System.in);
		while(p==true)
		{
			System.out.println("Enter following choices to find area of shapes of your choice 1.Rectangle 2.Triangle 3.Circle");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					{
						System.out.println("Enter the length and breadth of the rectangle:");
						s1.x=s.nextInt();
						s1.y=s.nextInt();
						area=s1.printarea();
						System.out.println("Area of Rectangle is "+area);
						break;
					}
				case 2:
					{
						System.out.println("Enter the height and breadth of the triangle:");
						t.x=s.nextInt();
						t.y=s.nextInt();
						area=t.printarea();
						System.out.println("Area of Triangle is "+area);
						break;
					}
				case 3:
					{
						System.out.println("Enter the radius of the circle:");
						c.x=s.nextInt();
						area=c.printarea();
						System.out.println("Area of Circle is "+area);
						break;
					}
				case 4:
					p=false;break;
				default:
					System.out.println("Invalid Input");
			}
		}	
	}
}

			
					
				
		

	