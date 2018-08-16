
public class HarryPRunner {
	// Create a HarryRunner class with a main method that:
			// 1. makes harry potter
			// 2. become invisible
			// 3. spy on Professor Snape
			// 4. become visible again
			// 5. cast a “stupefy” spell
	public static void main(String[] args) {
		HarryPotter albusSeverus = new HarryPotter();
		albusSeverus.makeInvisible(true);
		albusSeverus.spyOnSnape();
		albusSeverus.makeInvisible(false);
		albusSeverus.castSpell("avada kedavra");
	}
}
