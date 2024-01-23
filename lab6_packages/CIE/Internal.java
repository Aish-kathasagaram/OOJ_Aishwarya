
package CIE;

import java.util.Scanner;

public class Internal extends CIE.Student{
    public int m[] = new int[5];
    CIE.Student student = new CIE.Student();
    public void accept(){
        student.accept(); 

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Internal Marks:");
        for(int i=0;i<5;i++){
            m[i] = s1.nextInt();
        }
    }

    public void display(){
        
        student.display();
        for(int i=0;i<5;i++){
            System.out.println("Marks of sub" + (i+1) + " = " + m[i]);
        }
    }
}
