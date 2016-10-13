import Items.Book;
import Items.MusicCD;
import Users.Customer;

public class Demo {



	public static void main(String[] args) {
		Customer demo1 = new Customer("Jorge Dominguez", "jorge", "123");

		
		demo1.addToCart(new MusicCD("Daft Punk - Homework", 14.99));
		demo1.addToCart(new MusicCD("Gorillaz - Gorillaz", 9.99));
		demo1.addToCart(new MusicCD("Justice - Cross", 12.99));
		demo1.addToCart(new Book("To Kill a Mockingbird", 4.99));
		Book hhg = new Book("The Hitchhiker's Guide to the Galaxy ", 5.99);
		demo1.addToCart(hhg);
		System.out.println();
		demo1.checkOutCart();
		demo1.listCards();
		
		System.out.println();
		System.out.println(hhg.getTitle()+" is of type "+hhg.type());
		
		
	}

}
