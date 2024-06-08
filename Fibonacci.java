import java.util.Scanner;

public class Fibonacci {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcom to the Fibonacci Application!");
	
		int seriesLength;
		do {
			seriesLength = 0;
			System.out.print("Please enter how many numbers in the sequence you want displayed: ");
			try {
				seriesLength = scan.nextInt();
				if (seriesLength <= 0) {
					System.out.println("Please enter a number larger than 0!");
					scan.nextLine();
				}
			}
			catch (Exception e) {
				System.out.println("Please enter a valid number!");
				scan.nextLine();
			}
		}
		while (seriesLength <= 0);
		
		long num1 = 0L;
		long num2 = 1L;
		long currentNum;
		System.out.println("Here is your Fibonacci series:");
		for (int i = 0; i < seriesLength; i++) {
			if (i < 2) {
				if (i == seriesLength - 1)
					System.out.print(i);
				else
					System.out.print(i + ", ");
			}
			else {
				currentNum = num1 + num2;
				if (i == seriesLength - 1)
					System.out.print(currentNum);
				else
					System.out.print(currentNum + ", ");
				num1 = num2;
				num2 = currentNum;
			}		
		}
		
		System.out.println("\nProgram Terminated");
		scan.close();
	}
}

//I think there is a much better way to output the Fibonacci series but this worked for me.
