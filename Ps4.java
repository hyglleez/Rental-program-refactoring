package homeworkfive;

public class Ps4 extends Item{
    public static final int PRO   = 0;
    public static final int SLIM     = 1;
    public static final int ORIGINAL = 2;
    
    public Ps4(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
        _type = "Ps4";
    }
    
    public Ps4(String title, int priceCode, double price) {
        _title = title;
        _priceCode = priceCode;
        _type = "Ps4";
        _price = price;
    }
}
