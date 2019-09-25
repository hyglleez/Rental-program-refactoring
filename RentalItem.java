package homeworkfive;

public abstract class RentalItem extends Rental{
    protected Item _item;
    protected int   _daysRented;
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public Item getItem() {
        return _item;
    }

	public abstract double getAmount();
	

	public String getResult(){
		
		String result = "";
	
	        // show figures for this rental
        result += ("\t" + "Rental" +
        			"\t" + _item.getType() +
        		  "\t" + this.getItem().getTitle() +
                  "\t" + String.valueOf(this.getAmount()) + 
                  "\t" +  getDaysRented() + " day(s)" + "\n");
		
		return result;
	}
	
}
