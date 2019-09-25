package homeworkfive;
import java.util.Enumeration;
import java.util.Vector;


public class  SecondStrategy extends FrequentRenterPointsStrategy
{
	public double frequentRenterPoints(Transaction transaction){
	
        
        Enumeration rentals              = transaction.getRentals().elements();
		int priceCode = -1;
		boolean ifBonus = false;
        
        while (rentals.hasMoreElements()) {
			
			RentalItem each       = (RentalItem) rentals.nextElement();
			
			if (each.getItem().getType().equals("Movie")) {
				if (priceCode == -1)
				{
					priceCode = each.getItem().getPriceCode();
				}
	            if (priceCode != each.getItem().getPriceCode())
	            {
					ifBonus = true;
	            }
			}
			// add frequent renter points
			transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() + 1);
						
        }
		
		if (ifBonus)
		{
			transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() * 2);
		}
		return transaction.getFrequentRenterPoints();
	}
}