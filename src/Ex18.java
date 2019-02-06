import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		int accountNumber;
		int balanceInitial;
		int itemsCharged;
		int credits;
		int allowedLimit;
		int limit = 0;

		Scanner input = new Scanner(System.in);
		
		System.out.print("The account number: ");
		accountNumber = input.nextInt();
		
		System.out.print("Enter the balance at the beginning of the month: ");
		balanceInitial = input.nextInt();
		
		System.out.print("Enter the total of all items charged this month: ");
		itemsCharged = input.nextInt();
		
		System.out.print("Enter the total of all credits this month: ");
		credits = input.nextInt();
		
		System.out.print("Enter the allowed credit limit: ");
		allowedLimit = input.nextInt();
		
		input.close();
		
		limit = balanceInitial + itemsCharged - credits;
		if (limit > allowedLimit) {
			System.out.printf("User %d, your credit limit exceeded! ", accountNumber);
		}
		else {
			System.out.printf("User %d, your credit limit not exceeded! ", accountNumber);
		}
	}

}
