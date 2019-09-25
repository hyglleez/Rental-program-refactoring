package homeworkfive;
public class RentalPs4 extends RentalItem {

    
    public RentalPs4(Ps4 ps4, int daysRented) {
        _item      = ps4;
        _daysRented = daysRented;
    }
    
	public double getAmount() {
		double amount = 0;
	
        // determine amounts for each line
        switch (this.getItem().getPriceCode()) {
            case Ps4.PRO:
                amount += 20;
                if (this.getDaysRented() > 2) {
                    amount += (this.getDaysRented() - 2) * 15;
                }
                break;
            case Ps4.SLIM:
                amount += this.getDaysRented() * 30;
                break;
            case Ps4.ORIGINAL:
                amount += 15;
                if (this.getDaysRented() > 3) {
                    amount += (this.getDaysRented() - 3) * 15;
                }
				break;
            }
		
		return amount;
	}
}