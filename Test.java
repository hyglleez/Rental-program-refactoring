package homeworkfive;
public class Test 
{
	public static void main(String[] args) 
	{
		Movie a = new Movie("a", 1);
		Movie b = new Movie("b", 2);
		Movie c = new Movie("c", 0);
		Movie d = new Movie("d", 2);
		Ps4 e = new Ps4("e", 2);
		Movie f = new Movie("f", 2);
		Game g = new Game("g", 2);
		Movie h = new Movie("h", 2);
		Movie j = new Movie("j", 0, 100);
		Movie a1 = new Movie("a1", 1);
		Movie b1 = new Movie("b1", 2);
		CD c1 = new CD("c1", 0);
		Movie d1 = new Movie("d1", 2);
		Movie e1 = new Movie("e1", 2);
		Xbox f1 = new Xbox("f1", 2);
		Movie g1 = new Movie("g1", 2);
		Movie h1 = new Movie("h1", 2);
		Book i = new Book("i", 0);
		Book i1 = new Book("i1", 0, 200);
		Vinyl v = new Vinyl("v", 0, 30);
		RentalMovie ra = new RentalMovie(a, 2);
		RentalMovie rb = new RentalMovie(b, 2);
		RentalMovie rc = new RentalMovie(c, 2);
		RentalMovie rd = new RentalMovie(d, 2);
		RentalPs4 re = new RentalPs4(e, 2);
		RentalMovie rf = new RentalMovie(f, 2);
		RentalGame rg = new RentalGame(g, 2);
		RentalMovie rh = new RentalMovie(h, 2);
		RentalMovie ra1 = new RentalMovie(a1, 2);
		RentalMovie rb1 = new RentalMovie(b1, 2);
		RentalCD rc1 = new RentalCD(c1, 2);
		RentalMovie rd1 = new RentalMovie(d1, 2);
		RentalMovie re1 = new RentalMovie(e1, 2);
		RentalXbox rf1 = new RentalXbox(f1, 2);
		RentalMovie rg1 = new RentalMovie(g1, 2);
		RentalMovie rh1 = new RentalMovie(h1, 2);
		RentalBook ri = new RentalBook(i, 2);
		SaleItem rj = new SaleItem(j);
		SaleItem ri1 = new SaleItem(i1);
		SaleItem rv = new SaleItem(v);
		
		Customer cs = new Customer("Tom", 18);
		Cart cart = new Cart(cs);
		Transaction t = cart.getTransaction();
		t.addRental(ra);
		t.addRental(rb);
		t.addRental(rc);
		t.addRental(rd);
		t.addRental(re);
		t.addRental(rf);
		t.addRental(rg);
		t.addRental(rh);
		t.addRental(ra1);
		t.addRental(rc1);
		t.addRental(rd1);
		t.addRental(re1);
		t.addRental(rf1);
		t.addRental(rg1);
		t.addRental(rh1);
		t.addRental(ri);
		t.addSale(rj);
		t.addSale(ri1);
		t.addSale(rv);
		t.frequentRenterPoints();
		System.out.println(t.getStatement());
	}
}
