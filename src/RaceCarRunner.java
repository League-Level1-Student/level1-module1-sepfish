

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
			RaceCar wehehe = new RaceCar("strangely named", 5);
		// 2. Print the RaceCar's position in the race
			System.out.println(wehehe.getPositionInRace());
		// 3. Crash the RaceCar
			wehehe.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
			if (wehehe.damaged == true) {
				wehehe.pit();
			}
		// 5. Help the car move into first place.
			wehehe.overtake();
			wehehe.overtake();
			wehehe.overtake();
			wehehe.overtake();
			wehehe.overtake();
			wehehe.overtake();
			wehehe.overtake();

	}
}
