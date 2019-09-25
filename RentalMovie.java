package homeworkfive;
public class RentalMovie extends RentalItem {

    
    public RentalMovie(Movie movie, int daysRented) {
        _item      = movie;
        _daysRented = daysRented;
    }
    
	public double getAmount() {
		double amount = 0;
	
        // determine amounts for each line
        switch (this.getItem().getPriceCode()) {
            case Movie.REGULAR:
                amount += 2;
                if (this.getDaysRented() > 2) {
                    amount += (this.getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                amount += this.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                amount += 1.5;
                if (this.getDaysRented() > 3) {
                    amount += (this.getDaysRented() - 3) * 1.5;
                }
				break;
            }
		
		return amount;
	}
}