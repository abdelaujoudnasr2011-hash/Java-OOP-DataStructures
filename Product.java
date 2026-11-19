
package ecommercesystem;

public class Product {
  private int productId,quantity;
  private String name,category;
  private double price;
  
 

    public Product(int productId, int quantity, String name, String category, double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  
  public void displayProduct() {
    System.out.println("Product ID: " + productId);
    System.out.println("Name: " + name);
    System.out.println("Category: " + category);
    System.out.println("Price: " + price);
    System.out.println("Quantity: " + quantity);
}

public void updateQuantity(int amount) {
    if (this.quantity + amount >= 0) {
        this.quantity += amount;
    } else {
        System.out.println("Insufficient quantity available!");
    }
}
}
