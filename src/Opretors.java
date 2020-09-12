public class Opretors {
    public static void main(String arg[])
    {
        int a=10;
        int b=20;
        int x=a+b;

        //Arithmetic Operator + - * / %
       // (a+b) *c (10+10)*20
///* */  muti line comment
        System.out.println(x);
        System.out.println("Concatenation  of a and b: "+a+b); //concentio
        System.out.println("Sum value of a and b : "+(a+b));
        System.out.println("Sub value of a and b : "+(a-b));
        System.out.println("Multiply value of a and b : "+(a*b));
        System.out.println("Div value of a and b : "+(a/b));
        System.out.println("Mod Div value of a and b : "+(a%b));

        // Relational Operator(Comparison operators)
        //Always return boolean value as a result(True/False)
        // == < > <= >= !=
        System.out.println("a and b is same value : " +(a==b)); // false 10==10
        System.out.println("a is less than b : " +(a<b)); //true
        System.out.println("a is greater tha b : " +(a>b)); //false
        System.out.println("a is less than or equal to b : " +(a<=b));  //true
        System.out.println("a is greater than or equal to b: " +(a>=b)); //false
        System.out.println("a is not equal to b : " +(a!=b)); //true

        //Logical operators  ---------->   && AND -------->|| OR =========> ! NoT
        // boolean values as input OR==AND==NOT
        /*
        X	    Y	    X && Y	x || y	! X	    ! Y
        TRUE	TRUE	TRUE	TRUE	FALSE	FALSE
        FALSE	TRUE	FALSE	TRUE	TRUE
        TRUE	FALSE	FALSE	TRUE		    TRUE
        FALSE	FALSE	FALSE	FALSE

         */
        boolean w=true;
        boolean q=false;
                System.out.println("AND Operation : "+(w && q)); // false
                System.out.println("OR Operation : "+(w || q)); // true
                System.out.println("Not W :"+!w +" komal " +!q); // false
                System.out.println(!q); //true

        // -- decrement
        // ++ increment
        //a=10
        a=a++; //a=a+1;
        System.out.println(a);
        //System.out.println(a++);




    }
}
