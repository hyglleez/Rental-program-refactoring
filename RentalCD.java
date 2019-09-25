package homeworkfive;
public class RentalCD extends RentalItem {

    
    public RentalCD(CD cd, int daysRented) {
        _item      = cd;
        _daysRented = daysRented;
    }
    
	public double getAmount() {
		double amount = 0;
	
        // determine amounts for each line
        switch (this.getItem().getPriceCode()) {
            case CD.REGULAR:
                amount += 2;
                if (this.getDaysRented() > 2) {
                    amount += (this.getDaysRented() - 2) * 2;
                }
                break;
            case CD.NEW_RELEASE:
                amount += this.getDaysRented() * 4;
                break;
            case CD.CHILDRENS:
                amount += 1.5;
                if (this.getDaysRented() > 3) {
                    amount += (this.getDaysRented() - 3) * 2;
                }
				break;
            }
		
		return amount;
	}
}