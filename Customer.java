package homeworkfive;
import java.util.Enumeration;
import java.util.Vector;

public class Customer extends Person{
    private String _name;
	private Integer _age;
    private Vector _rentals = new Vector<RentalMovie>();
	private double _frequentRenterPoints = 0;
    
    public Customer (String name, Integer age) {
        super(name);
		_name = name;
		_age = age;
    }
    
    public void addRental(RentalMovie arg) {
        _rentals.addElement(arg);
    }
    
    public String getName() {
        return _name;
    }
    
	public Integer getAge() {
        return _age;
    }

	public double getFrequentRenterPoints() {
		return _frequentRenterPoints;
	}

	public void setFrequentRenterPoints(double frequentRenterPoints) {
		_frequentRenterPoints = frequentRenterPoints;
	}

}