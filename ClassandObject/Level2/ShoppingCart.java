import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    private List<CartItem> items;
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        this.items.add(item);
        System.out.println(item.getItemName() + " was added to the cart.");
    }

    public void removeItem(String itemName) {
        boolean removed = this.items.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
        
        if (removed) {
            System.out.println(itemName + " was removed from the cart.");
        } else {
            System.out.println(itemName + " not found in cart.");
        }
    }

    public void displayTotalCost() {
        double totalCost = 0.0;
        
        for (CartItem item : this.items) {
          
            totalCost += item.getItemTotalCost();
        }

        System.out.println("--------------------");
        System.out.printf("Shopping Cart Total Cost: $%.2f\n", totalCost);
    }


    public static void main(String[] args) {
        
        ShoppingCart cart = new ShoppingCart();
        CartItem item1 = new CartItem("Apple", 0.99, 10); 
        CartItem item2 = new CartItem("Bread", 3.50, 2);  

        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayTotalCost(); 

        System.out.println();

        cart.removeItem("Apple");
        cart.displayTotalCost(); 
    }
}

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return this.itemName;
    }
    
    public double getItemTotalCost() {
        return this.price * this.quantity;
    }
}