public class BookApp {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];

        // Create two new authors
        authors[0] = new Author("Pip Jones", "pjones@java.org", 'u');
        authors[1] = new Author("Bessie Carter", "b.carter@java.org", 'f');
        
        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummies", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()
    }
}