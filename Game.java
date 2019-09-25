package homeworkfive;

public class Game extends Item{
    public static final int CHILDRENS   = 0;
    public static final int FPS     = 1;
    public static final int RTS = 2;
    
    public Game(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
        _type = "Game";
    }
    
    public Game(String title, int priceCode, double price) {
        _title = title;
        _priceCode = priceCode;
        _type = "Game";
        _price = price;
    }
}
