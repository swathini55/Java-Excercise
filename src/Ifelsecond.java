import java.util.Scanner;

public class Ifelsecond {
    public static void main(String args[])
    {
        Scanner login = new Scanner(System.in);
        System.out.println("Enter Value : ");
        int val1 = login.nextInt();
         if(val1%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
