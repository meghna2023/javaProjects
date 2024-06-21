import java.util.Scanner;
import java.util.Random;
class NumberGuess
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			Random rand = new Random();
			int randNum = rand.nextInt(1000);
			int guess=-1;
			int tries=0;
			while(guess!=randNum)
			{
				System.out.println("guess number between 0 to 1000: ");
				guess=sc.nextInt();
				tries++;
				if(guess==randNum)
				{
					System.out.println("Awesome! your guess is correct");
					System.out.println("it took " +tries + " try" );
					System.out.println("Would you like to play again? Yes or No");
					play=sc.next().toLownerCase();
				}
				else if(guess>randNum)
				{
					System.out.println("Your guess is too high");
				}
				else
				{
					System.out.println("your Guess is too low");
				}
			}
			
	}
}
