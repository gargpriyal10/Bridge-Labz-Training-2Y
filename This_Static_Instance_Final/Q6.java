package ThisStaticFinalInstancOf;

class Vehicle {
    static double registrationFee = 5000.0;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Sonic", "Car", "AA01AB1212");
        Vehicle v2 = new Vehicle("Tails", "Bike", "AA02AB91214");

        v1.displayDetails();
        System.out.println();
        v2.displayDetails();

        System.out.println("\n--- Updating Registration Fee ---");
        Vehicle.updateRegistrationFee(6000);

        System.out.println();
        v1.displayDetails();
        System.out.println();
        v2.displayDetails();
    }
}
