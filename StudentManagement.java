public class StudentManagement {
    public static void main(String[] args) {
        String studentName = "Ali";
        int studentID = 1001;
        double mark = 75.0;
        double mark1 = 75;
        double mark2 = 80;
        double mark3 = 85;

        double average = (mark1 + mark2 + mark3) / 3;
        System.out.println("Average Mark: " + average);

        System.out.println("Student Management System");
        System.out.println("-------------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Mark: " + mark);
    }
}