public class AuthorApp {
    public static void main(String[] args) {
        // Create a new author
        Author osman = new Author("Richard Osman", "noone@nowhere.com", 'm');

        // Output the information about this author
        System.out.println(osman); // Test toString()

        // Test getters and setters
        osman.setEmail("osman@murderclub.com"); // Test setter
        System.out.println("name is: " + osman.getName()); // Test getter
        System.out.println("email is: " + osman.getEmail()); // Test getter
        System.out.println("gender is: " + osman.getGender()); // Test getter
    }
}