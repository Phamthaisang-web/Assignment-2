import java.util.Scanner; // Import the Scanner class

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        int n = sc.nextInt(); // Read user input
        sc.close(); // Close the Scanner to avoid resource leaks
        
        for (int i = n; i >= -n; i--) {
            System.out.print(i + " "); // Print each number followed by a space
        }
    }
}