package homeworkfive;

public class SaleItem {
    private Item _item;
    
    SaleItem(Item item){
    	_item = item;
    }
    
    public Item getItem() {
        return _item;
    }

    public double getAmount() {
    	return _item.getPrice();
    }
	

	public String getResult(){
		
		String result = "";
	
	        // show figures for this rental
        result += ("\t" + "Sale" +
        		"\t" + _item.getType() +
        		  "\t" + this.getItem().getTitle() +
                  "\t" + String.valueOf(this.getAmount()) + "\n");
		
		return result;
	}
}
