import java.util.Scanner;

import CIE.Student;
import CIE.Internal;
import SEE.External;

public class Final{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter n:");
        int y = n.nextInt();

        CIE.Internal[] c1 = new CIE.Internal[y];
        SEE.External[] c2 = new SEE.External[y];

        for(int i=0;i<y;i++){
            c1[i] = new CIE.Internal();
            c2[i] = new SEE.External();

            c1[i].accept();
            c2[i].accept();

            // c1[i].accept();c2[i].accept();
            c1[i].display();c2[i].display();

            for(int j=0;j<5;j++){
                double calc = c1[i].m[j]+((c2[i].x[j])/2);
                System.out.println("Final marks of sub["+(i+1)+"]= "+calc);
            }
        }
    }
}
