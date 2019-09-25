package homeworkfive;
import java.util.Enumeration;
import java.util.Vector;
import java.util.Scanner;

public class Transaction
{
	private static Customer _customer;
    private Vector _rentals = new Vector();
    private Vector _sales = new Vector();
	private FrequentRenterPointsStrategy frequentRenterPointsStrategy;
    
	public Transaction (Customer customer) {
		_customer = customer;
    }

	public Transaction (Customer customer, FrequentRenterPointsStrategy strategy) {
		_customer = customer;
		frequentRenterPointsStrategy = strategy;
    }

	//Three Strategies
	public static Transaction newFirstStrategy() {
		return new Transaction(getCustomer(), new FirstStrategy()); }

	public static Transaction newSecondStrategy() {
		return new Transaction(getCustomer(), new SecondStrategy()); }

	public static Transaction newThirdStrategy() {
		return new Transaction(getCustomer(), new ThirdStrategy()); }
	
	public void addRental(RentalItem arg) {
        _rentals.addElement(arg);
    }
	
	public void addSale(SaleItem arg) {
        _sales.addElement(arg);
    }

	public String getName() {
        return _customer.getName();
    }

	public Integer getAge() {
        return _customer.getAge();
    }

	public Vector getRentals() {
        return _rentals;
    }
	
	public Vector getSales() {
        return _sales;
    }	

	public static Customer getCustomer() {
        return _customer;
    }
	
	public double getFrequentRenterPoints() {
		return _customer.getFrequentRenterPoints();
	}

	public void setFrequentRenterPoints(double frequentRenterPoints) {
		_customer.setFrequentRenterPoints(frequentRenterPoints);
	}

	public double frequentRenterPoints(){


		return frequentRenterPointsStrategy.frequentRenterPoints(this);
		
	}

	public String getStatement() {
    
        double      totalAmount          = 0;
        Enumeration rentals              = _rentals.elements();
        Enumeration sales              = _sales.elements();
        String      result               = "Rental & Sale Record for " + getName() + "\n";
		Scanner scanner = new Scanner(System.in);
		String title;
		

		while (rentals.hasMoreElements()) {
            

            RentalItem each       = (RentalItem) rentals.nextElement();


			result += each.getResult();

        }
		
		rentals              = _rentals.elements();
		
		while (sales.hasMoreElements()) {
            

            SaleItem each       = (SaleItem) sales.nextElement();


			result += each.getResult();

        }
		
		sales              = _sales.elements();

		while (getFrequentRenterPoints() >= 10)
		{
			System.out.println("Would you want to spend your Frequent Renter Points? (Y/N)");
			if (scanner.nextLine().equals("Y"))
			{
				System.out.println("What's the movie's title you want to make free?");
				title = scanner.nextLine();
				while (rentals.hasMoreElements()) {
					RentalItem each       = (RentalItem) rentals.nextElement();
					if (title.equals(each.getItem().getTitle()) && each.getItem().getType().equals("Movie"))
					{
						
						_rentals.remove(each);
						setFrequentRenterPoints(getFrequentRenterPoints() - 10);
						break;
					}
					if (rentals.hasMoreElements() == false)
					{
						System.out.println("You typed a wrong title.");
					}
				}
				
				
			}
			else
				break;
			rentals              = _rentals.elements();
		}
        
		rentals              = _rentals.elements();

		while (rentals.hasMoreElements()) {
            
            double thisAmount = 0;
            RentalItem each       = (RentalItem) rentals.nextElement();
            
			thisAmount = each.getAmount();


            totalAmount += thisAmount;
        }
		
		while (sales.hasMoreElements()) {
            
            double thisAmount = 0;
            SaleItem each       = (SaleItem) sales.nextElement();
            
			thisAmount = each.getAmount();


            totalAmount += thisAmount;
        }
        
		result += addFooterLines(totalAmount, getFrequentRenterPoints());
        return result;
    }
	
	public String addFooterLines(double totalAmount, double frequentRenterPoints){
		String result = "";
	    // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                  " frequent renter points";
		return result;
	
	}

}