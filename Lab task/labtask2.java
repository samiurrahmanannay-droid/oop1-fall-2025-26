public class labtask2 {
     public static void main(String[] args) {
        double originalPrice = 250.0;
        double discountRate = 15.0; // in percent

        double discountAmount = originalPrice * discountRate / 100;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discount: $" + discountAmount);
        System.out.println("Final Price after 15% discount: $" + finalPrice);
    }

}
