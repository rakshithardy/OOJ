package project.CIE;
import java.util.Scanner;
public class internals extends student {
    protected int ciemarks[] = new int[5];
    public void inputCIEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter CIE marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            ciemarks[i] = s.nextInt();
        }
    }
}