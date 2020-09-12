import java.util.Scanner;

public class Arrayexample1 {
    public static void main(String[] args) {
        Scanner arylenth=new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int arraylength = arylenth.nextInt();
        int a[]=new int[arraylength];
        System.out.println("The values are : ");
        for (int i=0; i<a.length;i++)
        {
            a[i]=i;
            System.out.println(a[i]);
        }

        String strarray[]={"Java","Testing","Automation","Manual"};
        System.out.println("Length of the array : "+strarray.length);

        for (int q=0;q<strarray.length;q++)
        {
            System.out.println("String Value of array index["+q +"] : " +strarray[q]); //string values printing
        }



    }
}
