import java.util.*;
class Employee{
    protected String eName;
    protected int basicSalary;
    static int count = 0;
    {
        count++;
    }
    // DEFAULT CONSTRUCTOR
    public Employee(){
        eName = "N/A";
        basicSalary = 0;
        System.out.println("Superclass Default Constructor");
    }
    //OVERLOADED PARAMETRIZED CONSTRUCTOR
    public Employee(String name, int bs){
        eName = name;
        basicSalary = bs;
        System.out.println("Superclass Parametrized Constructor");
    }
    //COPY CONSTRUCTOR
    public Employee(Employee E){
        eName = E.eName;
        basicSalary = E.basicSalary;
    }
    //GETTER
    public String getName(){
        return eName; 
    }
    //SETTER
    public void setName(String name){
        eName = name;
    }
    public void printEmployeeDetails(){
        System.out.println("SUPERCLASS");
        System.out.println(eName);
        System.out.println(basicSalary);
    }
    public void getNetIncome(){
        System.out.println("SUPERCLASS");
        System.out.println(basicSalary + (0.05*basicSalary));
    }
    public static int countEmployees(){
        return count; 
    }
}
class SalesManager extends Employee{
    protected int SalesAmount;
    //DEFAULT CONSTRUCTOR
    public SalesManager(){
        SalesAmount = 0;
    }
    //PARAMETRIZED CONSTRUCTOR
    public SalesManager(String name, int n1, int n2){
        eName = name;
        basicSalary = n1;
        SalesAmount = n2;
        System.out.println("SubClass Parametrized Constructor");       
    }
    public void printEmployeeDetails(){
        System.out.println("SUBCLASS");
        System.out.println(eName);
        System.out.println(basicSalary);
        System.out.println((SalesAmount));
    }
    public void getNetIncome(){
        System.out.println("SUBCLASS");
        System.out.println(basicSalary + (0.05*basicSalary));
    }
}
public class Inheritance {
    public static void main(String[] args){
        Employee Emp1 = new Employee();
        Employee Emp2 = new Employee("ABC", 100); 
        System.out.println(Emp1.getName());
        System.out.println(Emp2.getName());
        Emp1.printEmployeeDetails();
        Emp2.getNetIncome();
        System.out.println(Employee.countEmployees());

        SalesManager SM1 = new SalesManager("GHI", 200, 50);
        SM1.printEmployeeDetails();
        SM1.getNetIncome();

    }
}
