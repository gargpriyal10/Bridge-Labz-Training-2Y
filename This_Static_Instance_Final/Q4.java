package ThisStaticFinalInstancOf;

class Product {
    // 1. Static
    static double discount = 10.0;
    private static int productCounter = 0;

    // 2. Instance + Final
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = ++productCounter;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    public double calculateTotal() {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    public void displayDetails() {
        if (this instanceof Product) { // Using instanceof
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total after discount: $" + calculateTotal());
        }
    }
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 800, 1);
        Product p2 = new Product("Headphones", 50, 2);

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();

        System.out.println("\n--- Updating Discount ---");
        Product.updateDiscount(20);

        System.out.println();
        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
    }
}
