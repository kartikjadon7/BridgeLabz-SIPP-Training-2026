abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    abstract int getLoanDuration();

    public void displayItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Loan Duration : " + getLoanDuration() + " days");
    }
}

class Book extends LibraryItem {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Book book = new Book(101, "Java Programming", "James Gosling");
        Magazine magazine = new Magazine(102, "Science Today", "ABC Publications");
        DVD dvd = new DVD(103, "Inception", "Christopher Nolan");

        System.out.println("Book Details:");
        book.displayItemDetails();

        System.out.println();

        System.out.println("Magazine Details:");
        magazine.displayItemDetails();

        System.out.println();

        System.out.println("DVD Details:");
        dvd.displayItemDetails();
    }
}