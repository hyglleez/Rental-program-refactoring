package homeworkfive;

public class Xbox extends Item{
    public static final int ONEX   = 0;
    public static final int ONES     = 1;

    
    public Xbox(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
        _type = "Xbox";
    }
    
    public Xbox(String title, int priceCode, double price) {
        _title = title;
        _priceCode = priceCode;
        _type = "Xbox";
        _price = price;
    }
}
