package Assignment;

import java.util.Scanner;

public class SwitchCaseAssignmet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the id");
		int id = sc.nextInt();
		switch (id) {
		case 1:
			System.out.println("Poor Performance");
			break;
		case 2:
			System.out.println("Need Improve");
			break;
		case 3:
			System.out.println("Good Performance");
			break;
		case 4:
			System.out.println("Excellent Performance");
			break;
		case 5:
			System.out.println("Employee of the year");
			break;

		default:
			System.out.println("Invalid Id");
			break;
		}
		sc.close();
	}

}
