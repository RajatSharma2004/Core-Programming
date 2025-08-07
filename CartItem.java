import java.util.ArrayList;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();

        CartItem item1 = new CartItem("Pen", 10.0, 5);
        CartItem item2 = new CartItem("Notebook", 50.0, 2);

        cart.add(item1);
        cart.add(item2);

        // Display items and total cost
        double grandTotal = 0;
        for (CartItem item : cart) {
            System.out.println("Item: " + item.itemName + ", Price: ₹" + item.price + ", Quantity: " + item.quantity);
            grandTotal += item.getTotalCost();
        }

        System.out.println("Total Cart Cost: ₹" + grandTotal);
    }
}
