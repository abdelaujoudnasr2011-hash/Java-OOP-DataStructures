
package library.book.management.system;

public class LibraryBookManagementSystem {

    public static void main(String[] args) {
        Book b1 = new Book(1,"ABC","AAA","BBB",true);
        Book b2 = new Book(2,"DEF","DDD","EEE",true);
        Book b3 = new Book(3,"ASD","DSA","WSX",true);
        
        System.out.println("Befor");
        b1.disPlayBookInfo();
        b2.disPlayBookInfo();
        b3.disPlayBookInfo();
        
        System.out.println("*******************************");
        b1.borrowBook();
        b1.borrowBook();
        b2.borrowBook();
        
        
        
    }
}
