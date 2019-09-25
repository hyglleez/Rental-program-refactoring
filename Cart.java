package homeworkfive;
import java.util.Scanner;

public class Cart
{
	Transaction transaction;
	Scanner scanner = new Scanner(System.in);
	String option;
	Cart (Customer c)
	{
		System.out.println("What kind of strategy do you want?(Type 1, 2 or 3)");
		option = scanner.nextLine();
		if (option.equals("1"))
		{
			transaction = new Transaction(c).newFirstStrategy();
		}
		else if (option.equals("2"))
		{
			transaction = new Transaction(c).newSecondStrategy();
		}
		else if (option.equals("3"))
		{
			transaction = new Transaction(c).newThirdStrategy();
		}
		else
		{
			System.out.println("You typed a wrong number");
		}


	}

	public Transaction getTransaction()
	{
		return transaction;
	}
} 
