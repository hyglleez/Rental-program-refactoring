package homeworkfive;
public class Movie extends Item{
   
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS   = 2;
    
    
    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
        _type = "Movie";
    }
    
    public Movie(String title, int priceCode, double price) {
        _title = title;
        _priceCode = priceCode;
        _type = "Movie";
        _price = price;
    }
    

}