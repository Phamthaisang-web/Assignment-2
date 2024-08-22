import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen a");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen b");
        int b = sc.nextInt();
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        System.out.println("a / b = "+ (a/b));
        System.out.println("a % b = "+ (a%b));
    }
}
