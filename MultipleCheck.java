import java.util.Scanner;

public class MultipleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 7 == 0) {
            System.out.println("Multiple of 3 and 7");
        } else if (n % 3 == 0) {
            System.out.println("Multiple of 3");
        } else if (n % 7 == 0) {
            System.out.println("Multiple of 7");
        } else {
            System.out.println("Not a multiple of 3 or 7");
        }
    }
}