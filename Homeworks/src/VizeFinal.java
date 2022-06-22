import java.util.Scanner;

public class VizeFinal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int midtermExam, finalExam;
		
		System.out.println("Enter your Midterm Exam result: ");
		midtermExam = scan.nextInt();
		System.out.println("Enter your Final Exam result: ");
		finalExam = scan.nextInt();
		float average = (midtermExam + finalExam) / 2;
		if (average < 50) {
			System.out.println("Failed!");
		} else if (average == 50) {
			System.out.println("Passed! ");
		} else if (average > 50 && average < 70) {
			System.out.println("Passed! Score: BB ");
		} else if (average >= 70 && average < 85) {
			System.out.println("Passed! Score: BA ");
		} else if (average >= 85 && average <= 100) {
			System.out.println("Passed! Score: AA ");
		} else {
			System.out.println("Invalid Grades Entered");
		}
	}

}
