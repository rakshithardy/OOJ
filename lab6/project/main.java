package project;
import project.SEE.externals;
public class main {
    public static void main(String args[]) {
        externals s = new externals();
        System.out.println("Enter Student Details:");
        s.inputStudentDetails();
        System.out.println("\nEnter Internal Marks:");
        s.inputCIEmarks();
        System.out.println("\nEnter SEE Marks:");
        s.inputSEEmarks();
        s.calculateFinalMarks();
        System.out.println("\n---- FINAL RESULT ----");
        s.displayFinalMarks();
    }
}