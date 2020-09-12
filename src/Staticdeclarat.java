public class Staticdeclarat {
    //Organization and Different Team Member


    String Membername;
    int memberid;
    static String Teamname;
    static String Role;
    String Location;

    public Staticdeclarat() {
        System.out.println("constructor without args");

    }
    static {
        Teamname = "Java";
        Role = "Developer";
    }

    public void run()
    {

        System.out.println(Membername+" ID :" + memberid +" " + Teamname + " " + Role+" "+ Location);

    }
}
