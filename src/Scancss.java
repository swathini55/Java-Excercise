import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Scancss {
    public static void main(String args[])
    {

        Scanner addition = new Scanner(System.in);
        //sum of 2 values
        System.out.println("Enter 1st Value for Sum : ");
        int add1 = addition.nextInt();
        System.out.println("Enter 2nd value for Sum : ");
        int add2 = addition.nextInt();
        System.out.println("Sum value of "+add1+" and "+add2+ ": "+(add1+add2));
                //subraction
        System.out.println("Enter 1st value for Subraction : ");
        double sub1 = addition.nextDouble();
        System.out.println("Enter 2nd value for Subraction : ");
        double sub2 = addition.nextDouble();
        System.out.println("Subraction value of "+sub1+" and "+sub2+ ": "+(sub1-sub2));

    }
}
