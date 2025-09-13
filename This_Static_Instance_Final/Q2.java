package ThisStaticFinalInstancOf;

class Book {
    // 1. Static
    static String libraryName = "City Central Library";

    // 2. Instance + Final
    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        if (this instanceof Book) { // Using instanceof
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
    public static void main(String[] args) {
        Book.displayLibraryName();
        System.out.println();

        Book b1 = new Book("The Alchemist", "Paulo Coelho", "978-0061122415");
        Book b2 = new Book("The Kingkiller Chronicle", "Patrick Rothfuss", "978-0575081406");

        b1.displayDetails();
        System.out.println();
        b2.displayDetails();
    }
}
