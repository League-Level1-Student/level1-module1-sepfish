
public class SmurfRunner {
	/*
	* 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
		 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
		 * 3&4 see comments in code below
		 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
		 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
		 */
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		handy.eat();
		handy.getName();
		
		Smurf papa = new Smurf("Papa");
		papa.getName();
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		
		Smurf smurfette = new Smurf("Smurfette");
		smurfette.getName();
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
	}
}
