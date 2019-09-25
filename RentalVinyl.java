package homeworkfive;
public class RentalVinyl extends RentalItem {

    
    public RentalVinyl(Vinyl vinyl, int daysRented) {
        _item      = vinyl;
        _daysRented = daysRented;
    }
    
	public double getAmount() {
		double amount = 0;
	
        // determine amounts for each line
        switch (this.getItem().getPriceCode()) {
            case Vinyl.MODERN:
                amount += 5;
                if (this.getDaysRented() > 2) {
                    amount += (this.getDaysRented() - 2) * 1.5;
                }
                break;
            case Vinyl.BAROQUE:
                amount += this.getDaysRented() * 0.1;
                break;
            case Vinyl.ROMANTIC:
            	amount += this.getDaysRented() * 0.1;
				break;
            }
		
		return amount;
	}
}