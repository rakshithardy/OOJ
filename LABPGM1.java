import java.util.Scanner;
class LABPGM1

{
    public static void main(String args[])
{
     float a,b,c,d;
     double r1,r2;
     Scanner in=new Scanner(System.in);
    System.out.println("Enter a,b,c values:");
    a=in.nextFloat();
    if(a==0)
    {
        System.out.println("Not a quadratic equation");
        System.out.println("Enter a non zero value...");
        a=in.nextFloat();
    }
    b=in.nextFloat();
    c=in.nextFloat();
    d=(b*b)-(4*a*c);
    if(d==0)
    {
        r1=(-b)/(2*a);
        System.out.println("Roots are real and equal");
        System.out.println(r1+" and "+r1);
   
    }
    else if(d>0)
    {
        System.out.println("Roots are real and distinct");
        r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
        r2=((-b)-(Math.sqrt(d)))/(double)(2*a);
        System.out.println(r1+" and "+r2);

    }
    else
    {
        System.out.println("Roots are imaginary");
        r1=(-b)/(2*a);
        r2=Math.sqrt(-d)/(2*a);
        System.out.println(r1+"+i("+r2+")");
        System.out.println(r1+"-i("+r2+")");
    }

}
}