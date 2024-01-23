/* Develop a Java program to create a class Student with members usn, name, an array 
credits and an array marks. Include methods to accept and display details and a 
method to calculate SGPA of a student. */


import java.util.Scanner;

class Student {
    String usn,name;
    int[] credits,marks;

    // Method to accept details of a student
    void acceptDetails() {
        Scanner hello = new Scanner(System.in);

        System.out.print("Enter USN: ");
        this.usn = hello.next();

        System.out.print("Enter Name: ");
        this.name = hello.next();

        credits = new int[4];
        marks = new int[4];

        System.out.println("Enter details of credits and marks in order for 4 subjects:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter credits for Subject " + (i + 1) + ": ");
            credits[i] = hello.nextInt();

            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = hello.nextInt();
        }
    }

    // Method to display details of a student
    void display() {
        System.out.println("Student Details.");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);

        for (int i = 0; i < 4; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + ", Marks: " + marks[i]);
        }
    }

    // Method to calculate SGPA of a student
    double calc() {
        int totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < 4; i++) {
            totalCredits += credits[i];
            totalGradePoints += gradePoints(marks[i]) * credits[i];
        }

        return totalGradePoints / totalCredits;
    }

    // Method to calculate grade points based on marks
    int gradePoints(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 40) return 5;
        else return 0;
    }
}

public class SGPA {
    public static void main(String[] args) {
        // Example usage of the Student class
        Student student = new Student();
        student.acceptDetails();
        System.out.println("\nStudent Details:");
        student.display();
        System.out.println("\nSGPA: " + student.calc());
    }
}