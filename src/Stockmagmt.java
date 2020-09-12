import java.util.Scanner;

public class Stockmagmt {
    public static void main(String args[])
    {
        Productstock productstock = new Productstock("Sivu",5558);
        productstock.Menu();
    }
}

class Productstock
{
    String customername;
    int ordernum;
    int stockval =1000;
    int orderval;


    Productstock(String cname, int orderid) //constructor
    {
        this.customername=cname;
        this.ordernum= orderid;

    }
    void customerreq(int orderquantity)  //purchase by customer
    {
        if(orderquantity<=stockval)
        {
            System.out.println("Item Avilable in Store, Order Confirmed");
            stockval-=orderquantity;

        }
        else{
            System.out.println("Currently this much quantity unavailble,Try again after 2days");
        }
    }

    void stockavail(int instockquantity)  ///stockavailble in store
    {
        if(instockquantity <=stockval)
        {
            stockval-=instockquantity;
            System.out.println("Factory Stock Availblity : " +stockval);

        }

    }

    void orderprogress(int ordrquanty) //aftr custmr order confirmation status shown
    {
        if(ordrquanty!=0) {
            System.out.println(ordernum + " in Progress and Order Quantity is : " + ordrquanty + " Box/24 Pieces");
        }
        else
        {
            System.out.println("Currently , No orders in your ID");
        }
    }
    void Menu(){

        short option ; //short variable

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome " +customername + ","+" Order ID :" +ordernum );

        System.out.println("Happy to Help You...!!!");
        System.out.println("1.Order Chocolate");
        System.out.println("2.Order In Progress");
        System.out.println("3.Check the stock Avilabity");
        System.out.println("4.Exit");

        do {
            System.out.println("\n");
            System.out.println("Enter your Option : ");
            option = scanner.nextShort();

            switch (option)
            {
                case 1:
                    System.out.println("Enter the Order Quantity : ");
                     orderval = scanner.nextInt();
                    customerreq(orderval);
                    System.out.println("********************");
                    break;
                case 2:
                    System.out.println("********************");
                    orderprogress(orderval);
                    System.out.println("********************");
                    break;
                case 3:
                    System.out.println("********************");
                    System.out.println("Chocolate Stock Quantity : "+stockval);
                    System.out.println("********************");
                    break;
                case 4:
                    System.out.println("********************");
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;

            }

        }
        while(option != 4);
        {
            System.out.println("Once Order is packed ready for Pickup - Customer service will cal you.");
            System.out.println("Thank You for using Online Services.!!!" );

        }

    }

}
