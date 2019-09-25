package homeworkfive;
public class RentalXbox extends RentalItem {

    
    public RentalXbox(Xbox xbox, int daysRented) {
        _item      = xbox;
        _daysRented = daysRented;
    }
    
	public double getAmount() {
		double amount = 0;
	
        // determine amounts for each line
        switch (this.getItem().getPriceCode()) {
            case Xbox.ONEX:
                amount += 60;
                if (this.getDaysRented() > 2) {
                    amount += (this.getDaysRented() - 2) * 15;
                }
                break;
            case Xbox.ONES:
                amount += 80;
                if (this.getDaysRented() > 3) {
                    amount += (this.getDaysRented() - 3) * 15;
                }
				break;
            }
		
		return amount;
	}
}