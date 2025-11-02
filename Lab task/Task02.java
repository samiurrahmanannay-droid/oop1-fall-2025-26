public class Task02 {
    public static void main(String[] args) {
        // Task 1: Combine first and last name
        String firstName = "Samiur";
        String lastName = "Rahman";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Task 2: 
        String productName = "Laptop";
        int productId = 12345;
        String productCode = productName + "-" + productId;
        System.out.println("Product Code: " + productCode);

        // Task 3: 
        String email = "samiurrahman@example.com";
        String username = email.substring(0, email.indexOf("@"));
        System.out.println("Username: " + username);

        // Task 4: 
        String message = "Hello, how are you?";
        int charCount = message.length();
        System.out.println("Character Count: " + charCount);

        // Task 5:
        String sentence = "Java is fun!";
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        // Task 6: 
        String originalSentence = "I love Apple.";
        String replacedSentence = originalSentence.replace("Apple", "Mango");
        System.out.println("Replaced Sentence: " + replacedSentence);
    }
}
