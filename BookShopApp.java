import java.util.ArrayList;

public class BookShopApp {
    public static void main(String[] args) {
        // Create a dynamic list of books
        ArrayList<Book> stockList = new ArrayList<Book>();
        String searchFor = "making software";
        System.out.println("Search for term(s) '" + searchFor + "' in title...");

        // Create some new books and insert them into the list
        // Book 1
        stockList.add(new Book("Data Mining Handbook", 
            new Author[] {new Author("Robert Nisbet","",'u')},
            27.95,
            10
        ));

        // Book 2
        stockList.add(new Book("Mastering COBOL", 
            new Author[] {new Author("Roger Hutty","",'u')},
            4.95,
            10
        ));

        // Book 3
        stockList.add(new Book("Introduction to COBOL", 
            new Author[] {new Author("Paul Murrill","",'u')},
            7.35,
            4
        ));

        // Book 4
        stockList.add(new Book("Making Software", 
            new Author[] {new Author("Andy Oram","",'u')},
            35.00,
            5
        ));

        // Book 5
        stockList.add(new Book("OO Deisgn Using Java", 
            new Author[] {new Author("James Nino","",'u'), new Author("Frederick Hosch","",'u')},
            30.00,
            6
        ));

        // Book 6
        stockList.add(new Book("Objects First with java", 
            new Author[] {new Author("David Barnes","",'u'), new Author("Michael Kolling","",'u')},
            29.50,
            4
        ));

        // Output the stocklist
        OutputStockList(stockList);

        for (Book b3 : stockList) {
            if (b3.getName().toLowerCase().equals(searchFor)) {b3.setQty(b3.getQty()-1);}
        }

        // Output the updated stocklist
        OutputStockList(stockList);

        // Remove any book with the name "cobol" in
        String removeAll = "cobol";
        System.out.println("\nRemoving all books with term '" + removeAll + "' in title..."); 
        
        // Iterate through each book and remove if necessary
        int originalSize = stockList.size();
        stockList.removeIf(b4 -> b4.getName().toLowerCase().contains(removeAll));
        int numberOfBooksRemoved = originalSize - stockList.size();
        System.out.println("Removed "+numberOfBooksRemoved+" books");

        // Output the updated stocklist
        OutputStockList(stockList);
    }

    public static void OutputStockList(ArrayList<Book> stockList) {
        // Initialise the column widths
        int firstCol = 0, secondCol = 0, thirdCol = 0, fourthCol = 0;
        
        // Iterate through each book to determine the width for each column
        for (Book b1 : stockList) {
            if (b1.getName().length() > firstCol) {firstCol = b1.getName().length();}
            if (b1.getAuthorNames().length() > secondCol) {secondCol = b1.getAuthorNames().length();}
            if (Double.toString(b1.getPrice()).length() > thirdCol) {thirdCol = Double.toString(b1.getPrice()).length();}
            if (Integer.toString(b1.getQty()).length() > fourthCol) {fourthCol = Integer.toString(b1.getQty()).length();}
        }

        System.out.println("\nStocklist");
        // Output each book
        for (Book b2 : stockList) {
            System.out.printf("| %-"+firstCol+"s | %-"+secondCol+"s | %"+(thirdCol+1)+".2f | %0"+fourthCol+"d |%n", 
            b2.getName(), b2.getAuthorNames(), b2.getPrice(), b2.getQty());
        }
    }
}