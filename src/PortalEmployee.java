public class PortalEmployee
{
public static void main(String args[])
{
    Employeedetails emp001=new Employeedetails("AI001","Abi","Thanga","Female",24,24756891,"Permenent Resident");
    Employeedetails emp002=new Employeedetails("AI154","Sathiya","shree","Male",32,43256789,"Citizen");
    Employeedetails emp003= new Employeedetails("AI456","sree","selva","Male",28,905486759,"Work Permit");
    Employeedetails emp004= new Employeedetails("AI789","Ramu","Moorthy","Male",30,546378921,"Permenent Resident");
    Employeedetails emp005= new Employeedetails("AI4859","Sundari","Jai","Female",33,234567891,"Citizen");
    System.out.println("   Emp_ID   FirstName   LastName  Workstatus");
    System.out.println("---------------------------------------------------");
    System.out.println(emp003.Emp_ID +" -- " + emp003.FirstName +" -- "+ emp003.LastName +" -- "+ emp003.Workstatus);
    System.out.println(emp004.Emp_ID +" -- " + emp004.FirstName +" -- "+ emp004.LastName +" -- "+ emp004.Workstatus);
    System.out.println(emp005.Emp_ID +" -- " + emp005.FirstName +" -- "+ emp005.LastName +" -- "+ emp005.Workstatus);
}

}
