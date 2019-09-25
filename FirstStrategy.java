package homeworkfive;
import java.util.Enumeration;
import java.util.Vector;


public class  FirstStrategy extends FrequentRenterPointsStrategy
{
	public double frequentRenterPoints(Transaction transaction){
	
        
        Enumeration rentals              = transaction.getRentals().elements();
        
        while (rentals.hasMoreElements()) {
			
			RentalItem each       = (RentalItem) rentals.nextElement();
            
			// add frequent renter points
			transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() + 1);
			switch (each.getItem().getType()) {
				case "Movie":
					if ((each.getItem().getPriceCode() == Movie.NEW_RELEASE) && (each.getDaysRented() > 1)) {
						transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() + 1);
					}
					break;
				case "Book":
					if ((each.getItem().getPriceCode() == Book.NEW_RELEASE) && (each.getDaysRented() > 1)) {
						transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() + 1);
					}
					break;
				case "CD":
					if ((each.getItem().getPriceCode() == CD.NEW_RELEASE) && (each.getDaysRented() > 1)) {
						transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() + 1);
					}
					break;
				case "Game":
					if ((each.getItem().getPriceCode() == Game.CHILDRENS) && (each.getDaysRented() > 1)) {
						transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() + 1);
					}
					break;
				case "Ps4":
					if ((each.getItem().getPriceCode() == Ps4.PRO) && (each.getDaysRented() > 1)) {
						transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() + 1);
					}
					break;
				case "Vinyl":
					if ((each.getItem().getPriceCode() == Vinyl.MODERN) && (each.getDaysRented() > 1)) {
						transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() + 1);
					}
					break;
				case "Xbox":
					if ((each.getItem().getPriceCode() == Xbox.ONEX) && (each.getDaysRented() > 1)) {
						transaction.setFrequentRenterPoints(transaction.getFrequentRenterPoints() + 1);
					}
					break;
				default:
					break;
			}
			// add bonus for a two day new release rental
			
        }
        
		return transaction.getFrequentRenterPoints();
    }
}
