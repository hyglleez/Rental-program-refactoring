package homeworkfive;

public class Book extends Item{
    public static final int CHILDRENS   = 0;
    public static final int REGULAR     = 1;
    public static final int NEW_RELEASE = 2;
    
    public Book(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
        _type = "Book";
    }
    
    public Book(String title, int priceCode, double price) {
        _title = title;
        _priceCode = priceCode;
        _type = "Book";
        _price = price;
    }
    

}
