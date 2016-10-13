package Users;

import Items.Item;
@SuppressWarnings("unused")
public class User {

	
	private String name;
	private String userName;
	private String password;	
		
	public void browseItem(Item T) {
		System.out.println(String.format("[User->browseItem] browsing item %s", T.getTitle()));
		
	}
	
	public void register(String name, String username, String password) {
		System.out.println(String.format("[User->register] registering user %s", username));
		this.name = name;
		this.userName = username;
		this.password = password;
	}
	
	public String name(){
		return this.name;
	}
	
	public String username(){
		return this.userName;
	}
	
	public User(String name, String username, String password) {
		this.register(name, username, password);
	}

}
