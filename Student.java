import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance =0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        this.firstName = sc.nextLine();  
        System.out.println("Enter student last name: ");
        this.lastName = sc.nextLine();
        System.out.println("1 - Freshmen\n 2 - Sophmore\n 3 - Junior\n 4 - Senior\nEnter student grade level");
        this.gradeYear = sc.nextInt();

        
        setStudentId();
       

     
        
        

        
    }

    private void setStudentId(){
        id++;
        this.studentId= gradeYear + "" + id;

    }


    //enroll in courses
    public void enroll() {
        Scanner scanner = new Scanner(System.in);
            
        while (true) {
            System.out.println("Enter course to enroll (Q to quit): ");
          
            String course = scanner.nextLine();

            if (course.equalsIgnoreCase("Q")) {
                System.out.println("Quitting enrollment...");
                break; // Exit the loop if user enters 'Q' or 'q'
            } else {
                courses += "\n" + course;
                tuitionBalance += costOfCourse;
               
            }
        
            
        }
        
    }
    

    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    public void payTuition(){
        viewBalance();
        System.out.println("Please enter you payment here: ");
        Scanner pt = new Scanner(System.in);
        int payment = pt.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for you paymant of " + payment);
        viewBalance();
        
    }

    public String showInfo(){
        return "Name: " + firstName + " " + lastName + 
        "\nStudent Id: " +studentId +
        "\nCourses Enrolled: " + courses +
        "\nBalance: $" + tuitionBalance;

    }
    
    
}
