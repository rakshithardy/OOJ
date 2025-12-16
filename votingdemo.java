
import java.util.*;
class WrongAge extends Exception{
    WrongAge(String message){
        super(message);
    }
}
class check{
    check(int a){
        int age;
        age=a;
        
    }
    void isEligible(int age) throws WrongAge{
        if(age<=18){
            throw new WrongAge("Age should be above 18 to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
class eligibility extends check{
    eligibility(int a){
        super(a);
    }
    void isEligible(int age) throws WrongAge{
        if(age<=18){
            throw new WrongAge("Age should be above 18 to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
public class votingdemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age1:");
        int age1=sc.nextInt();
        System.out.println("Enter your age2:");
        int age2=sc.nextInt();
        check c1=new check(age1);
        check c2=new eligibility(age2);
        try{
            c1.isEligible(age1);
        }
        catch(WrongAge e){
            System.out.println("Error for age1:"+e);
        }
        try{
            c2.isEligible(age2);
        }
        catch(WrongAge e){
            System.out.println("Error for age 2:"+e);
        }
        finally{
            System.out.println("Eligible check completed");
        }

    }
}