import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        System.out.println("How many new students to enroll: " );

        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];
        for( int n =0; n < numOfStudents; n++){
            students[n]= new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showInfo());

        }
        System.out.println(students[0].showInfo());
        System.out.println(students[1].showInfo());
        
       

    }


}