package SEM_3_LABFILE.UNIT_2;

class Employee{
    protected String eName;
    protected double basicSalary;
    static int count = 0;
    //Initializer Block
    {
        count++;
    }

    //Default Constructor
    public Employee(){
        this.eName = "N/A";
        this.basicSalary = 0; 
    }

    //Parametrized Constructor
    public Employee( String name, double salary){
        this.eName = name;
        this.basicSalary = salary; 
    }

    //Copy Constructor
    public Employee(Employee e){
        this.eName = e.eName;
        this.basicSalary = e.basicSalary;
    }

    //Getter Method for Name
    public String getName(){
        return eName;
    }
    //Setter Method for Name
    public void setName(String name){
        this.eName = name;
    }

    //Getter Method for Salary
    public double getbasicSalary(){
        return basicSalary;
    }
    //Setter Method for basic Salary
    public void setSalary(double salary){
        this.basicSalary =  salary;
    }

    //Instance Methods
    public void printEmployeeDetails(){
        System.out.println("Employee Name:" + this.eName);
        System.out.println("Employee Basic Salary:" + this.basicSalary);
    }
    public double getNetincome(){
        //returns basic salary + 20% bonus
        return basicSalary + 0.2 * basicSalary;
    }
    static int CountEmployees(){
        return count;
    }
}

class SalesManager extends Employee{
    protected double salesAmount;
    //Default Constructor
    public SalesManager(){
        this.salesAmount = 0;
    }
    //Parametrized Constructor
    public SalesManager(String name, double salary, double amount){
        super(name, salary);
        this.salesAmount = amount;
    }
    //Overridden Methods
    public void printEmployeeDetails(){
        super.printEmployeeDetails();
        System.out.println("Sales Amount: " + this.salesAmount);
    }
    public double getNetincome(){
        //Adds an extra 10% commission
        return (getNetincome() + (0.1*basicSalary));
    }
}

class Test{
    public static void main(String[] args) {
        Employee E1 = new Employee();
        Employee E2 = new Employee("MEET", 1000000);
        SalesManager S1 = new SalesManager("WORKER", 10000, 40000);
        E1.printEmployeeDetails();
        System.out.println("Net Income: " + E1.getNetincome());
        S1.printEmployeeDetails();
        System.out.println("Net Income: " + S1.getNetincome());
        System.out.println("Employee Count: " + Employee.CountEmployees());
    }
} 