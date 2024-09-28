package FirstRepo;



class Employee
{
    int EmpId;
    String Name;
    double Phone;
    double Salary;

    public Employee(int EmpId,String Name, double Phone, double Salary )
    {
        this.EmpId = EmpId;
        this.Name = Name;
        this.Phone = Phone;
        this.Salary = Salary;
    }

    public void Display()
    {
        System.out.println("Employee ID : "+EmpId);
        System.out.println("Name : "+Name);
        System.out.println("Phone number : "+Phone);
        System.out.println("Salary : "+Salary);
    }


}
class Tester extends Employee
{
    private int ProjectId;
    private String ProjectName;
public Tester(int EmpId,String Name, double Phone, double Salary, int ProjectId,String ProjectName)
{
    super(EmpId, Name, Phone, Salary);
    this.ProjectId = ProjectId;
    this.ProjectName = ProjectName;
}
public void Display()
{
    super.Display();
    System.out.println("Project ID : "+ProjectId);
    System.out.println("Project Name : "+ProjectName);
}
}

class Developer extends Employee
{
    private String ProjectName;

public Developer(int EmpId,String Name, double Phone, double Salary, String ProjectName )
{
    super(EmpId,Name, Phone, Salary);
    this.ProjectName = ProjectName;
}
public void Display()
{
    super.Display();
    System.out.println("Project Name : "+ProjectName);
}
}
public class lab1
{
    public static void main(String[] args) 
    {
        Tester Tester1 = new Tester(122, "Smitha", 0123434555, 65000, 435, "BlueWhale");
        Tester1.Display();
        System.out.println();

        Tester Tester2 = new Tester(2133,"Shwetha",34578654,56000,234,"BlackPink");
        Tester2.Display();
        System.out.println();

        Developer Dev1 = new Developer(122, "Smitha", 0123434555, 65000,"Dolphine");
        Dev1.Display();
        System.out.println();

        Developer Dev2 = new Developer(122, "Smitha", 0123434555, 65000,"BlackCurrent");
        Dev2.Display();
    }
    
}


