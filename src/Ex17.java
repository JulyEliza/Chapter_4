import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		int milles;
		int gallons;
		int totalMilles = 0;
		int totalGallons = 0;
		double millesPerGallon = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter milles or -1 to quit: ");
		milles = input.nextInt();
		
		System.out.println("Enter gallons or -1 to quit: ");
		gallons = input.nextInt();
		
		while (milles != -1 & gallons != -1) {
			totalMilles += milles;
			totalGallons += gallons;
			
			System.out.println("Enter milles or -1 to quit: ");
			milles = input.nextInt();
			
			System.out.println("Enter gallons or -1 to quit: ");
			gallons = input.nextInt();
		}
		
		if (milles != 0 & gallons != 0) {
			 millesPerGallon = totalMilles / totalGallons;
             System.out.println("Miles per gallon used is: " + millesPerGallon);
		}
		else{
            System.out.println("No miles or gallons entered");
        }
		
		input.close();
	}

}
