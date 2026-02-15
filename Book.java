public class Book {
    // Private attributes
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    // Constructors
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    // Getter and Setter methods
    public String getName() {
        return this.name;
    }
    public Author[] getAuthors() {
        return this.authors;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return this.qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString() {
        // Construct string of all authors
        String stringOfAuthors = authors[0].toString();
        for (int i = 1; i < authors.length; i++) {
            stringOfAuthors = String.join(",", stringOfAuthors, authors[i].toString());
        }
        return "Book[name="+this.name+",authors={"+stringOfAuthors+"},price="+this.price+",qty="+this.qty+"]";
    }
    public String getAuthorNames() {
        // Construct string of all author's names
        String stringOfAuthorsNames = authors[0].getName();
        for (int i = 1; i < authors.length; i++) {
            stringOfAuthorsNames = String.join(", ", stringOfAuthorsNames, authors[i].getName());
        }
        return stringOfAuthorsNames;
    }
}