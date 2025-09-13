package ThisStaticFinalInstancOf;

class Student {
    // Static
    static String universityName = "Global University";
    private static int totalStudents = 0;

    // Instance + Final
    private String name;
    private final int rollNumber;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println(name + "'s grade updated to " + grade);
        }
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Yemen", 21, 'A');
        Student s2 = new Student("Poland", 31, 'B');

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();

        System.out.println();
        displayTotalStudents();

        System.out.println();
        s2.updateGrade('A');
        s2.displayDetails();
    }
}

