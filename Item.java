package homeworkfive;

public abstract class Item {
	protected String _title;
	protected int    _priceCode;
	protected String _type;
	protected double _price;
    
	public int getPriceCode() {
        return _priceCode;
    }
    
    public void setPriceCode(int priceCode) {
        _priceCode = priceCode;
    }
    
    public String getTitle() {
        return _title;
    }
    
    public String getType() {
    	return _type;
    }
    
    public double getPrice() {
    	return _price;
    }
}
