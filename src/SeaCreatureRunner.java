
public class SeaCreatureRunner {
	// 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
		// 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
	
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		spongebob.eat();
		spongebob.laugh();
		
		SeaCreature patrick = new SeaCreature("Patrick");
		patrick.getName();
		patrick.eat();
		patrick.laugh();
		
		SeaCreature squidward = new SeaCreature("Squidward");
		squidward.getName();
		squidward.eat();
		squidward.laugh();
		
	}

}
