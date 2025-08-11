// write a java project to build Online Shopping Cart Features : Add product to cart, remove product, view cart items, checkout.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return name + " - $" + price + " (Qty: " + quantity + ")";
    }
}

class ShoppingCart {
    private List<Product> cart;
    private double total;

    public ShoppingCart() {
        cart = new ArrayList<>();
        total = 0.0;
    }
    public void addProduct(Product product) {
        for (Product p : cart) {
            if (p.getName().equals(product.getName())) {
                p.setQuantity(p.getQuantity() + product.getQuantity());
                total += product.getPrice() * product.getQuantity();
                return;
            }
        }
        cart.add(product);
        total += product.getPrice() * product.getQuantity();
    }
    public void removeProduct(String productName) {
        for (int i = 0; i < cart.size(); i++) {
            Product p = cart.get(i);
            if (p.getName().equals(productName)) {
                total -= p.getPrice() * p.getQuantity();
                cart.remove(i);
                return;
            }
        }
        System.out.println("Product not found in cart.");
    }
    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("Items in your cart:");
        for (Product p : cart) {
            System.out.println(p);
        }
        System.out.println("Total: $" + total);
    }
    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty. Cannot checkout.");
            return;
        }
        System.out.println("Checking out...");
        System.out.println("Total amount: $" + total);
        cart.clear();
        total = 0.0;
        System.out.println("Thank you for your purchase!");
    }
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option: 1. Add Product 2. Remove Product 3. View Cart 4. Checkout 5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    Product product = new Product(name, price, quantity);
                    shoppingCart.addProduct(product);
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String productName = scanner.nextLine();
                    shoppingCart.removeProduct(productName);
                    break;
                case 3:
                    shoppingCart.viewCart();
                    break;
                case 4:
                    shoppingCart.checkout();
                    break;
                case 5:
                    System.out.println("Exiting the shopping cart.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}