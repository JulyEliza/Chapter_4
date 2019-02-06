import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		int hours;
		int rate;
		String employee;
		double pay = 1;

		Scanner input = new Scanner(System.in);

		System.out.print("The employee or -1 to quit: ");
		employee = input.nextLine();

		System.out.print("Enter the number of hours worked last week or -1 to quit: ");
		hours = input.nextInt();

		System.out.print("Enter the hourly rates or -1 to quit: ");
		rate = input.nextInt();

		
		while (rate != -1 & hours != -1) {
			pay = hours * rate;
			if (hours > 40)
				pay = pay + ((hours - 40) * 0.5 * rate);

			System.out.print("The employee or -1 to quit: ");
			employee = input.nextLine();

			System.out.print("Enter the number of hours worked last week or -1 to quit: ");
			hours = input.nextInt();

			System.out.print("Enter the hourly rates or -1 to quit: ");
			rate = input.nextInt();
		}

		System.out.printf("%s display $%.2f gross pay", employee, pay);
		input.close();
	}

}
