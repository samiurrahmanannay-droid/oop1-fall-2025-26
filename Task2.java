public class Task2 {
    public static void main(String[] args) {
        // Task 1: Combine first and last name
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Task 2: Generate product code
        String productName = "Widget";
        int productId = 12345;
        String productCode = productName + "-" + productId;
        System.out.println("Product Code: " + productCode);

        // Task 3: Extract username from email
        String email = "johndoe@example.com";
        String username = email.substring(0, email.indexOf("@"));
        System.out.println("Username: " + username);

        // Task 4: Count characters in a message
        String message = "Hello, how are you?";
        int charCount = message.length();
        System.out.println("Character Count: " + charCount);

        // Task 5: Convert sentence to uppercase and lowercase
        String sentence = "Java is fun!";
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        // Task 6: Replace a specific word in a sentence
        String originalSentence = "I love Java programming.";
        String replacedSentence = originalSentence.replace("Java", "Python");
        System.out.println("Replaced Sentence: " + replacedSentence);
    }
}