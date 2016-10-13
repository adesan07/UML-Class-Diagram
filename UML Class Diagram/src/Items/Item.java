package Items;

public class Item {
	
	private String title;
	private Double price;
	public String type(){
		return this.getClass().getSimpleName();
	};
	
	public Double getPrice(){
		return this.price;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	
	
	public Item(String title, Double price){
		this.title = title;
		this.price = price;
	}
}
