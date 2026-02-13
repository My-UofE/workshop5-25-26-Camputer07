public class StringFormatApp {
    public static void main(String[] args) {
        if (args.length == 3) {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            double height = Double.parseDouble(args[2]);

            // Output the information
            System.out.printf("name: %-20s Age: %3d Height: %-4.2fm%n", name, age, height);
            
            // Output the person's height in space
            System.out.printf("My space height would be %.1fcm%n", height * 1.023);
        
            // Output your age in martian years
            System.out.printf("On Mars I would be approximately %.0f years old.%n", age / 1.88f);
        } else {
            System.out.println("Enter 3 args: name, age, height!");
        }
    }
}