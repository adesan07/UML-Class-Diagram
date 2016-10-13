package Items;
public class Book extends Item {

	
	public void showPreview() {
		System.out.println("[book->showPreview] showing preview of book");
	}

	public Book(String title, Double price) {
		super(title, price);
	}

}
