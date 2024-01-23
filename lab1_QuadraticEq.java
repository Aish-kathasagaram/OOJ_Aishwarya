
/* Develop a Java program that prints all real solutions to the quadratic equation ax2+bx+c 
= 0. Read in a, b, c and use the quadratic formula. If the discriminate b2-4ac is negative, 
display a message stating that there are no real solutions. */

import java.util.*;
import java.math.*;
class Quadratic
{
	int a,b,c;
	double r1,r2,d;
	
	void coeff()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter coeeficients a,b,c");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = (b*b) - (4*a*c);
	}

	void evalu()
	{
	    
		while(a==0)
		{
			System.out.println("Not a QE.");
			System.out.println("Enter non zero coefficient");
			Scanner s = new Scanner(System.in);
			a = s.nextInt();
		}

	
		
		if(d==0)
		{
			System.out.println("Roots are real and equal.");
			r1 = (-b)/(2*a);
			System.out.println("Root1=Root2="+r1);
		}

		else if(d<0)
		{
			System.out.println("Roots are imaginary");
			r1 = (-b)/(2*a);
			r2 = Math.sqrt(-d)/(2*a);
			System.out.println("Root1="+r1+"+i"+r2);
			System.out.println("Root2="+r1+"-i"+r2);
		}
		else
		{
			System.out.println("Roots are real and distinct");
			r1 = (-b+(Math.sqrt(d)))/(2*a);
			r2 = (-b-(Math.sqrt(d)))/(2*a);
			System.out.println("root1= "+r1+"root2= "+r2);
		}
	}
	
}

class QuadraticEq
{
	public static void main(String sx[])
	{
		Quadratic q = new Quadratic();
		q.coeff();
		q.evalu();
	}
}

