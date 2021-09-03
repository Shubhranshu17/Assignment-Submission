import java.util.*;

public class Student {
    int roll;
    String name; 
    float marks;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll No. of the Student :- ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Name of the Student :- ");
        name = sc.nextLine();

        System.out.println("Enter the Marks of the Student (OUT OF 100):- ");
        marks = sc.nextFloat();

    }
    
    void display() {
        System.out.println("Roll No. of the Student is -> " + roll);
        System.out.println("Name of the Student is -> " + name);
        System.out.println("Marks of the Student is -> " + marks);
    }

    public static void main(String[] args) {
        Student ob = new Student();

        ob.input();
        ob.display();

    }
}
