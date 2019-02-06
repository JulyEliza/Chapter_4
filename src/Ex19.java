import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		final int percent=9;
		final double basic_salary = 200;
		double item=0;
		double total_items=0; 
		int count=1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Item price or -1 to quit:");
		while (item>=0) {
			System.out.printf("%d. ",count);
			item = input.nextDouble();
			System.out.println();
			if(item>=0) {
				total_items+=item;
				count++;
			}
		}
		input.close();
		
		System.out.printf("%nSeller sold: $%.2f this week.%n", total_items);
		double salary = basic_salary + (total_items * percent / 100);
		System.out.printf("%nSalary: $%.2f + %d%% = $%.2f%n", basic_salary, percent,salary);

	}

}
