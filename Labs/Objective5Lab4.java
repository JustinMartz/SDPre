import java.util.Scanner;

public class Objective5Lab4 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int userNum;

		System.out.println("Please enter a number: ");
		userNum = userInput.nextInt();

		if(userNum % 2 == 0) {
			System.out.println("The number is even.");
		}
		else {
			System.out.println("The number is odd.");
		}

		userInput.close();
	}
}
