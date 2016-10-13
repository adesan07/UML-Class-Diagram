package Users;
import Items.Item;
@SuppressWarnings("unused")
public class Manager extends User {
	private String employerID;
	
	public void createItem() {
		System.out.println(String.format("[manager->createItem] creating item"));
	}
	public void updateItem(Item T) {
		System.out.println(String.format("[manager->updateItem] updating item %s", T.getTitle()));
	}
	public void deleteItem(Item T) {
		System.out.println(String.format("[manager->deleteItem] deleting item %s", T.getTitle()));
	}
	public void createCustomer() {
		System.out.println(String.format("[manager->createCustomer] creating customer"));
	}
	public void updateCustomer(Customer C) {
		System.out.println(String.format("[manager->updateCustomer] updating customer"));
	}
	public void deleteCustomer(Customer C) {
		System.out.println(String.format("[manager->deleteCustomer] deleting customer"));
	}
	
	
	public Manager(String name, String username, String password) {
		super(name, username, password);
	}

}
