package randomTask;

public class Book {

    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed


    String name;
    String author;
    int price;


    Book(String name, String author, int price){
        this(name, author);
        this.price= price;

    }
    Book(String name, String author){
        this.name = name;
        this.author=author;

    }
void displayInfo(){

    System.out.println("Book name: " + name +" Author:  "+author+" Price: "+price);
}
    public static void main(String[] args) {
        Book book = new Book("The Kite Runner", "Khaled Hosseini", 20);
        book.displayInfo();
    }
}
