
public class Employee {
    
    private String name;
    private int id;
    private double salary;

  
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public void displayDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Salary: $" + this.salary);
    }


    public static void main(String[] args) {
      
        Employee emp1 = new Employee("Jane Doe", 101, 75000.00);

    
        System.out.println("--- Employee Details ---");
        emp1.displayDetails();
    }
}