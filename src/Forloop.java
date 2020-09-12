import java.util.Scanner;

public class Forloop {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value :");
        int num = input.nextInt();

        System.out.println("List of Even Number from the Input Value : ");
        for(int val=0;val<num;val++) //Even Num
        {
            if (val%2==0) {
                System.out.print(val + " ");
            }

        }
        /*System.out.println("List of Odd Number from the Input Value :");
        for(int oddval=0;oddval<num;oddval++)
        {
            if

        }*/
    }

}
