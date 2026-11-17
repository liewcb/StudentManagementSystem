public class StudentManagement {
    public static void main(String[] args) {
        String studentName = "Ali";
        int studentID = 1001;
        double mark = 90.0;
        double mark1 = 75;
        double mark2 = 80;
        double mark3 = 85;

        double average = (mark1 + mark2 + mark3) / 3;
        if (average >= 80) {
            System.out.println("Performance: Excellent");
        }
        else if (average >= 60) {
            System.out.println("Performance: Good");
        }
        else {
            System.out.println("Performance: Needs Improvement");
        }

        System.out.println("Average Mark: " + average);

        System.out.println("Student Management System");
        System.out.println("-------------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Mark: " + mark);
    }
}