package homeworkfive;

public class Vinyl extends Item{
    public static final int MODERN   = 0;
    public static final int BAROQUE     = 1;
    public static final int ROMANTIC = 2;
    
    public Vinyl(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
        _type = "Vinyl";
    }
    
    public Vinyl(String title, int priceCode, double price) {
        _title = title;
        _priceCode = priceCode;
        _type = "Vinyl";
        _price = price;
    }
}
