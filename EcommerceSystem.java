package ecommercesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();

        Order currentOrder = null;

        for (;;) {
            System.out.println("\n=== E-Commerce Management System ===");
            System.out.println("1. Add Customer");
            System.out.println("2. Display All Customers");
            System.out.println("3. Add Product");
            System.out.println("4. Display All Products");
            System.out.println("5. Update Product Quantity");
            System.out.println("6. Create New Order");
            System.out.println("7. Add Product to Current Order");
            System.out.println("8. Calculate Order Total");
            System.out.println("9. Display All Orders");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    int cId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String cName = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String cEmail = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String cAddress = scanner.nextLine();

                    customers.add(new Customer(cId, cName, cEmail, cAddress));
                    System.out.println("Customer added successfully!");
                    break;

                case 2:
                    if (customers.isEmpty()) {
                        System.out.println("No customers found.");
                    } else {
                        for (int i = 0; i < customers.size(); i++) {
                            customers.get(i).displayInfo();
                            System.out.println("-----------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    int pId = scanner.nextInt();
                    System.out.print("Enter Quantity: ");
                    int pQty = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String pName = scanner.nextLine();
                    System.out.print("Enter Category: ");
                    String pCat = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double pPrice = scanner.nextDouble();

                    products.add(new Product(pId, pQty, pName, pCat, pPrice));
                    System.out.println("Product added successfully!");
                    break;

                case 4:
                    if (products.isEmpty()) {
                        System.out.println("No products found.");
                    } else {
                        for (int i = 0; i < products.size(); i++) {
                            products.get(i).displayProduct();
                            System.out.println("-----------------");
                        }
                    }
                    break;

                case 5:
                    if (products.isEmpty()) {
                        System.out.println("No products to update.");
                    } else {
                        System.out.print("Enter Product ID to update quantity: ");
                        int targetId = scanner.nextInt();
                        boolean found = false;
                        for (int i = 0; i < products.size(); i++) {
                            if (products.get(i).getProductId() == targetId) {
                                System.out.print("Enter New Quantity: ");
                                int newQty = scanner.nextInt();
                                products.get(i).setQuantity(newQty);
                                System.out.println("Quantity updated!");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Product not found.");
                        }
                    }
                    break;

                case 6:
                    if (customers.isEmpty()) {
                        System.out.println("Add at least one customer first!");
                    } else {
                        System.out.print("Enter Order ID: ");
                        int oId = scanner.nextInt();
                        System.out.println("Select Customer by Index:");
                        for (int i = 0; i < customers.size(); i++) {
                            System.out.println(i + ". " + customers.get(i).getName());
                        }
                        int cIndex = scanner.nextInt();
                        if (cIndex >= 0 && cIndex < customers.size()) {
                            currentOrder = new Order(oId, customers.get(cIndex));
                            orders.add(currentOrder);
                            System.out.println("Order created successfully!");
                        } else {
                            System.out.println("Invalid customer selection.");
                        }
                    }
                    break;

                case 7:
                    if (currentOrder == null) {
                        System.out.println("Please create an order first!");
                    } else if (products.isEmpty()) {
                        System.out.println("No products available to add.");
                    } else {
                        System.out.println("Select Product by Index:");
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println(i + ". " + products.get(i).getName());
                        }
                        int pIndex = scanner.nextInt();
                        if (pIndex >= 0 && pIndex < products.size()) {
                            currentOrder.addProduct(products.get(pIndex));
                            System.out.println("Product added to current order!");
                        } else {
                            System.out.println("Invalid product selection.");
                        }
                    }
                    break;

                case 8:
                    if (currentOrder == null) {
                        System.out.println("No active order to calculate.");
                    } else {
                        currentOrder.calculateTotal();
                        System.out.println("Total Price Calculated: " + currentOrder.getTotalPrice());
                    }
                    break;

                case 9:
                    if (orders.isEmpty()) {
                        System.out.println("No orders found.");
                    } else {
                        for (int i = 0; i < orders.size(); i++) {
                            System.out.println("=================================");
                            orders.get(i).displayOrder();
                        }
                    }
                    break;

                case 10:
                    System.out.println("Exiting System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
