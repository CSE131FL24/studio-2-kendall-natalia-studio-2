package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("The amount of money that you start with: ");
		double startAmount = in.nextDouble();
		System.out.println("The win probability, or the probability that you win a single play: ");
		double winChance = in.nextDouble();
		System.out.println("If you reach this amount of money you had a successful day and leave: ");
		double winLimit = in.nextDouble();
		double currentAmount = startAmount;
		while (currentAmount < winLimit && currentAmount > 0) {
			boolean result = true;
			double randomNumber = Math.random();
			if (randomNumber < winChance) { 
			
			
			}	
		}
	}

}