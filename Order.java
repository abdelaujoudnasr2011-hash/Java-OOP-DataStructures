
package ecommercesystem;
import java.util.ArrayList;

public class Order {
 private int orderId;
    private Customer customer;
    private ArrayList<Product> products;
    private double totalPrice;
    
   public Order(int orderId, Customer customer) {
    this.orderId = orderId;
    this.customer = customer;
    this.products = new ArrayList<>();
    this.totalPrice = 0.0;
}

   

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void addProduct(Product product) {
    products.add(product);
}
    public void calculateTotal() {
    totalPrice = 0.0;
    for (Product p : products) {
        totalPrice += p.getPrice();
    }
}
    public void displayOrder() {
    System.out.println("Order ID: " + orderId);
    System.out.println("--- Customer Details ---");
    customer.displayInfo();
    System.out.println("--- Purchased Products ---");
    for (Product p : products) {
        p.displayProduct();
        System.out.println("-----------------");
    }
    System.out.println("Total Price: " + totalPrice);
}
    
    
}
