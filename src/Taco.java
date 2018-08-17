
public class Taco {
	private String meat;
	private String sauce;
	
	Taco(){
		System.out.println("You decide to make a taco.");
	}
	
	void getMeat() {
		if (meat == null) {
			System.out.println("You still need to put meat in your taco.");
		} else {
			System.out.println("You have a " + meat + " taco.");
		}
	}
	
	void getSauce() {
		if (sauce == null) {
			System.out.println("You still need to put sauce in your taco.");
		} else {
			System.out.println("The taco has " + sauce + ".");
		}
	}
	
	void setMeat(String meat) {
		this.meat = meat;
		System.out.println("You put " + meat + " in your taco.");
	}
	
	void setSauce(String sauce) {
		this.sauce = sauce;
		System.out.println("You pour " + sauce + " in your taco.");
	}
	
	
	public static void main(String[] args) {
		Taco taco = new Taco();
		taco.getMeat();
		taco.setMeat("chicken");
		taco.getMeat();
		taco.setSauce("barbeque sauce");
		taco.getSauce();
	}
}
