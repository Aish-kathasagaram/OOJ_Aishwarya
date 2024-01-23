import java.util.Scanner;

import CIE.Student;
import CIE.Internal;
import SEE.External;

public class Final{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter n:");
        int y = n.nextInt();

        CIE.Internal c1 = new CIE.Internal[y];
        SEE.External c2 = new SEE.External[y];

        for(int i=1;i<=y;i++){
            c1.accept();c2.accept();
            c1.display();c2.display();

            for(int j=1;j<=5;j++){
                double calc = c1.m[i]+((c2.x[i])/2);
                System.out.println("Final marks of sub["+i+"]= "+calc);
            }
        }
    }
}
