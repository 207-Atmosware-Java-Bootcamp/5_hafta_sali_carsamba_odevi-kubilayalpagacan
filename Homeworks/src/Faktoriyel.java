import java.util.Scanner;
public class Faktoriyel {
public static void main(String[] args) {
		
		// faktöriyel hesaplama
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		System.out.println("Factorial: " + factorial);
	}
}
