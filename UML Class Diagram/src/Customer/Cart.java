package Customer;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Items.Item;
import Users.Customer;

public class Cart {
	private Customer owner;
	private Set<Item> items = new HashSet<Item>();
	public Double calculateCombinedPrice() {
		Double result = (double) 0;
		Iterator<Item> i = items.iterator();
		while(i.hasNext())
		{
			Item current = i.next();
			result += current.getPrice();
		}
		result = result + (result * .0825); //tax :p
		DecimalFormat twoDForm = new DecimalFormat("#.##");
	    return Double.valueOf(twoDForm.format(result));
	}
	public void orderByPrice() {
		System.out.println("[cart->orderByPrice] Ordering cart by price");
	}
	
	public void printinfo(){
		System.out.println(String.format("Hello, %s (%s)", owner.name(), owner.username()));
	}
	
	public void listCart(){
		System.out.println("-----------------------List Cart-----------------------");
		Iterator<Item> i = items.iterator();
		while(i.hasNext())
		{
			Item current = i.next();
			System.out.println(String.format("%s - $%s", current.getTitle(), current.getPrice()));
			
		}
		System.out.println("-------------------------------------------------------");
	}
	
	public void addItem(Item T)
	{
		System.out.println(String.format("[cart->addItem] Adding '%s' to your cart for $%s", T.getTitle(), T.getPrice()));
		items.add(T);
	}

	public Cart(Customer owner) {
		this.owner = owner;
	}

}
