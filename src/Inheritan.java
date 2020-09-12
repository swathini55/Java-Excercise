import java.util.Scanner;

public class Inheritan { //inheritance

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your ID : ");
        int id = input.nextInt();
        Increment three=new Increment( );
        three.Justdetails(id);
        three.yearlyincremnt(id);
        three.bonus(id);
    }
}
 class Employe //super class
{

    void Justdetails(int i)
    {

        System.out.println("Employee Details of : " + i);
    }

}
class Diwali extends Employe //subclass1 ==Diwali
{

    public void bonus(int i)
    {
        if(i<=555) {
            System.out.println("Special Bonus Offered for Diwali");
        }
        else
        {
            System.out.println("New Batch trainees are eligible for Splz Gifts Only...!!!");
        }
    }
}
class Increment extends Diwali //Subclass2 == Increment
{
    public void yearlyincremnt(int i)
    {
        if(i<=555) {
            System.out.println("Annual Increment Approved...!!!");
        }
        else
        {
            System.out.println("Every Year, You're eligible for 15% of hike.");
        }
    }
}
