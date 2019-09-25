package homeworkfive;

public class CD extends Item{
    public static final int CHILDRENS   = 0;
    public static final int REGULAR     = 1;
    public static final int NEW_RELEASE = 2;
    
    public CD(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
        _type = "CD";
    }
    
    public CD(String title, int priceCode, double price) {
        _title = title;
        _priceCode = priceCode;
        _type = "CD";
        _price = price;
    }
}
