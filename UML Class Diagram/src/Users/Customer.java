package Users;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Customer.Cart;
import Customer.CreditCard;
import Items.Item;
@SuppressWarnings("unused")
public class Customer extends User {
	private String homeAddress;
	private Cart cart;
	Set<CreditCard> creditCards = new HashSet<CreditCard>();
	
	public void addToCart(Item T) {
		System.out.println(String.format("[customer->addToCart] Adding '%s' to your cart for $%s", T.getTitle(), T.getPrice()));
		cart.addItem(T);
	}
	public void checkOutCart() {
		cart.printinfo();
		cart.listCart();
		
		System.out.println("[customer->checkOutCart] Calculating combined price");
		System.out.println("Please pay: $"+cart.calculateCombinedPrice());
	}
	
	public void listCards(){
		System.out.println("-----------Credit cards-----------");
		Iterator<CreditCard> i = creditCards.iterator();
		while(i.hasNext())
		{
			CreditCard current = i.next();
			current.print();
		}
		System.out.println("----------------------------------");
	}

	public Customer(String name, String username, String password) {
		super(name, username, password);
		this.cart = new Cart(this);
		this.creditCards.add(new CreditCard(1234567, "10/09", 123, this));
	}

}
