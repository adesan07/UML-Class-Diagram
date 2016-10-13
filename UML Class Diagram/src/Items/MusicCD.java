package Items;
public class MusicCD extends Item {
	
	public void playSample() {
		System.out.println("[musiccd->playSample] playing sample of music cd");
	}

	public MusicCD(String title, Double price) {
		super(title, price);
	}

}
