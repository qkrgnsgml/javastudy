package reflect;

public class Employee
{
    public String firstName;
    public String lastName;
    public int salary;

    public Employee()
    {
        this( "John", "Smith", 50000);
    }

    public Employee(String fn, String ln, int salary)
    {
        firstName = fn;
        lastName = ln;
        this.salary = salary;
    }

    public int getSalary()
    {
        return salary;
    }



    public String toString()
    {
        return "Employee: " + firstName +  " "
                + lastName + " " + salary;
    }

}