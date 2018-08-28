import java.util.Scanner;

public class ModulusPractice
	{
		public static void main(String[]args)
		{
			determineLeapYear();
			playFizzBuzz();
		}
		
		public static void determineLeapYear()
		{
			Scanner userInput = new Scanner (System.in);
			System.out.println("Please input a year. I will determine if your chosen year is a leap year or not.");
			int chosenYear = userInput.nextInt();
			
			if (chosenYear%4 == 0 && chosenYear%100 != 0)
				{
					System.out.println("The year " + chosenYear + " is a leap year.");
				}
			else if (chosenYear%100 == 0 && chosenYear%400 == 0)
				{
					System.out.println("The year " + chosenYear + " is a leap year.");
				}
			else
				{
					System.out.println("The year " + chosenYear + " is not a leap year.");
				}
			
		}
		
		public static void playFizzBuzz()
		{
			System.out.println("LETS PLAY FIZZ BUZZ");
			for (int i = 1; i <= 100; i++)
				{
					if (i%3 == 0 && i%5 == 0)
						{
							System.out.println("FIZZBUZZ");
						}
					else if (i%3 == 0)
						{
							System.out.println("FIZZ");
						}
					else if (i%5 == 0)
						{
							System.out.println("BUZZ");
						}
					else 
						{
							System.out.println(i);
						}
				}
		}
	}
