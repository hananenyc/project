package classe15;
//
public class hw1 {
    public static class Students {
    /*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */

        String studentName;
        String studentID;
        static int numberOfStudents;

        public static void main(String[] args) {

            Students e1 = new Students();
            e1.studentName = "hana";
            e1.studentID = "q1234";
            e1.numberOfStudents++;

            Students e2 = new Students();
            e2.studentName = "sami";
            e2.studentID = "q1345";
            e2.numberOfStudents++;

            Students e3 = new Students();
            e3.studentName = "judia";
            e3.studentID = "Q2345";
            e3.numberOfStudents++;

            System.out.println(numberOfStudents);
        }

    }

}
