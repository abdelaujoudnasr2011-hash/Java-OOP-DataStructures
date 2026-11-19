
package ecommercesystem;

public class Customer extends Person {
    private String email;
    private String phoneNumber;
    
    @Override
    public void displayInfo(){
    System.out.println("ID: " + getId());
    System.out.println("Name: " + getName());
    System.out.println("Email: " + email);
    System.out.println("Phone: " + phoneNumber);
        
    }
    public Customer(){
    }
    
    public Customer(int id, String name, String email, String phoneNumber) {
    super(id, name);
    this.email = email;
    this.phoneNumber = phoneNumber;
}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
        
}
