package CIE;
import java.util.Scanner;

public class Student{
    public String usn;
    public String name;
    public int sem;

    
    public void accept(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name:");
        this.name = s.nextLine();
        System.out.println("Enter usn:");
        this.usn = s.nextLine();
        System.out.println("Enter sem");
        this.sem = s.nextInt();
    }

    public void display(){
        System.out.println("Name: " + this.name + "\nUSN: " + this.usn + "\nSem: " + this.sem);
    }
}