package homeworkfive;
public class RentalGame extends RentalItem {

    
    public RentalGame(Game game, int daysRented) {
        _item      = game;
        _daysRented = daysRented;
    }
    
	public double getAmount() {
		double amount = 0;
	
        // determine amounts for each line
        switch (this.getItem().getPriceCode()) {
            case Game.CHILDRENS:
                amount += 2;
                if (this.getDaysRented() > 2) {
                    amount += (this.getDaysRented() - 2) * 3;
                }
                break;
            case Game.FPS:
                amount += this.getDaysRented() * 3;
                break;
            case Game.RTS:
                amount += 1.5;
                if (this.getDaysRented() > 3) {
                    amount += (this.getDaysRented() - 3) * 3;
                }
				break;
            }
		
		return amount;
	}
}