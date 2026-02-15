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

        // Iterate through each book to determine the width for each column
        int firstCol = 0;
        int secondCol = 0;
        int thirdCol = 0;
        int fourthCol = 0;
        for (Book b2 : stockList) {
            if (b2.getName().length() > firstCol) {firstCol = b2.getName().length();}
            if (b2.getAuthorNames().length() > secondCol) {secondCol = b2.getAuthorNames().length();}
            if (Double.toString(b2.getPrice()).length() > thirdCol) {thirdCol = Double.toString(b2.getPrice()).length();}
            if (Integer.toString(b2.getQty()).length() > fourthCol) {fourthCol = Integer.toString(b2.getQty()).length();}
        }

        System.out.println("\nStocklist");
        // Output each book
        for (Book b : stockList) {
            System.out.printf("| %-"+firstCol+"s | %-"+secondCol+"s | %"+(thirdCol+1)+".2f | %0"+fourthCol+"d |%n", 
            b.getName(), b.getAuthorNames(), b.getPrice(), b.getQty());
        }

        for (Book b3 : stockList) {
            if (b3.getName().toLowerCase().equals(searchFor)) {b3.setQty(b3.getQty()-1);}
        }

        // Output the updated stocklist
        System.out.println("\nUpdated Stocklist");
        for (Book b : stockList) {
            System.out.printf("| %-"+firstCol+"s | %-"+secondCol+"s | %"+(thirdCol+1)+".2f | %0"+fourthCol+"d |%n", 
            b.getName(), b.getAuthorNames(), b.getPrice(), b.getQty());
        }
    }
}