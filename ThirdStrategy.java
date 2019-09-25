package homeworkfive;
import java.util.Enumeration;
import java.util.Vector;


public class  ThirdStrategy extends FrequentRenterPointsStrategy
{
	public double frequentRenterPoints(Transaction transaction){
	
        
        Enumeration rentals              = transaction.getRentals().elements();
		boolean newRelease = false;
        
        while (rentals.hasMoreElements()) {
			
			RentalItem each       = (RentalItem) rentals.nextElement();
            
			// add frequent renter points
			transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() + 1);
						
			if (each.getItem().getPriceCode() == 1 && (each.getItem().getType().equals("Movie") || each.getItem().getType().equals("Book") || each.getItem().getType().equals("CD")))
			{
				newRelease = true;
			}
        }

		if (newRelease && (transaction.getAge() >= 18 && transaction.getAge() <= 22))
		{
			transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() * 2);
		}
        
		return transaction.getFrequentRenterPoints();
    }
}