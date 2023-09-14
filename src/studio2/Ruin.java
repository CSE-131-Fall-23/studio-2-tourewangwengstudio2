package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the amount of money you are starting with?");
		double startAmount = in.nextDouble();
		System.out.println("What is the probability that you win a single play?");
		double winChance = in.nextDouble();
		System.out.println("What is the amount of money you recieve after a successful day");
		double winLimit = in.nextDouble();
		
		
		if(startAmount>0)
		{
			double chance = Math.random();
			boolean win = chance > 0.5;
			if (win)
			{
				startAmount++;
			}
		else
		{
			startAmount--;
		}
		System.out.println(startAmount);
			}
	}
}
