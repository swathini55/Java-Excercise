public class Calculatorfirst {
   //Calculator Function == using access modifiers  === and use of constructor and Inheritance
   // and using encapsulation concept in this pgm
    private int val1; //access modifier
    private int val2;
    protected int sum;

    Calculatorfirst(int v1, int v2) //constructor
    {
        this.val1=v1;
        this.val2=v2;

    }
    public void add ( int a, int b) ///void is not able to retrn value
    {
        sum = a + b;

        System.out.println(sum);
    }


}

