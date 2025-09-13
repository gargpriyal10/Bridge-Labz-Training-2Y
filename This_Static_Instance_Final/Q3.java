package ThisStaticFinalInstancOf;

class Employee {
    // 1. Static
    static String companyName = "Tech Solutions Pvt Ltd";
    private static int totalEmployees = 0;

    // 2. Instance + Final
    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void displayDetails() {
        if (this instanceof Employee) {  // Using instanceof
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Farhan", 191, "Software Engineer");
        Employee e2 = new Employee("Yassir", 171, "Project Manager");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();

        Employee.displayTotalEmployees();
    }
}
