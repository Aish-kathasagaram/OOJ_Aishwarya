package SEE;
import java.util.Scanner;

import CIE.Internal;
import CIE.Student;


 
public class External extends CIE.Student{
    public int x[] = new int[5];
    public void accept(){
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter External Marks:");
        for(int i=0;i<5;i++){
            x[i] = s2.nextInt();
        }
    }

    public void display(){
        super.display();

        for(int i=0;i<5;i++){
            System.out.println("Marks of sub" + (i+1) + " = " + x[i]);
        }
    }

}
