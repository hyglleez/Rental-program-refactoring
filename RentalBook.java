package homeworkfive;

public class RentalBook extends RentalItem{
    public RentalBook(Book book, int daysRented) {
        _item      = book;
        _daysRented = daysRented;
    }
    
	public double getAmount() {
		double amount = 0;
	
        // determine amounts for each line
        switch (this.getItem().getPriceCode()) {
            case Book.REGULAR:
                amount += 2;
                if (this.getDaysRented() > 2) {
                    amount += (this.getDaysRented() - 2) * 2.5;
                }
                break;
            case Book.NEW_RELEASE:
                amount += this.getDaysRented() * 5;
                break;
            case Book.CHILDRENS:
                amount += 1.5;
                if (this.getDaysRented() > 3) {
                    amount += (this.getDaysRented() - 3) * 2.5;
                }
				break;
            }
		
		return amount;
	}

	

}
