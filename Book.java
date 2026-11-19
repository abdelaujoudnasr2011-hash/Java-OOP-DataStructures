
package library.book.management.system;

public class Book {
private int id;
private String author;
private String category;
private String title;
private boolean isAvailable;

 public Book (int id,String author,String category,String title,boolean isAvailable){
    this.id=id;
    this.author=author;
    this.category=category;
    this.title=title;
    this.isAvailable=isAvailable;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
 
    public void disPlayBookInfo(){
        System.out.println("id:"+id);
        System.out.println("author:"+author);
        System.out.println("category:"+category);
        System.out.println("title:"+title);
        System.out.println("isAvailable:"+isAvailable);
       System.out.println("*******************************");
    }
    
    public void borrowBook(){
        if(isAvailable){
            isAvailable=false;
        System.out.println(title + "borrowBook Successfull");
        }else{
       System.out.println("Sorry" + title + "is already borrowBook");
        } 
    }
    public void returnBook(){
        if(!isAvailable){
        isAvailable=true;
        System.out.println(title + "return Successfull" );
        }else{
           System.out.println(title + "is already available"); 
        }
    }
    
    
}
