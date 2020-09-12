import java.util.Scanner;

public class Ifelseifcond {
    public static void main(String args[])
    {
        Scanner Days = new Scanner(System.in);
        System.out.println("Enter value between 1 to 7 : ");
        int count = Days.nextInt();
        if(count == 1)
        {
            System.out.println("It represents Sunday");
        }
        else if(count == 2)
        {
            System.out.println("It represents Monday");
        }
        else if(count == 3)
        {
            System.out.println("It represents Tuesday");

        }
        else if(count == 4)
        {
            System.out.println("It represents Wednesday");
        }
        else if(count == 5)
        {
            System.out.println("It represents Thursday");
        }
        else if(count == 6)
        {
            System.out.println("It represents Friday");
        }
        else if(count == 7)
        {
            System.out.println("It represents Saturday");
        }
        else
        {
            System.out.println("Invalid Number, Only 7 days a week");
        }
    }
}
