
public class Pig {
	public static void main(String[] args)
	{
		int Score0 = 0;
		int Score1 = 0;
		int Player = 0;
		int random;
		
		while ((Score0 < 100) && (Score1 < 100)) {
			int points = 0;
			StdOut.println("Score: " + Score0 + "-" + Score1 + ".");
			random = ((int) (Math.random() * 6)) + 1;
			StdOut.println("Player " + Player + ", you rolled a " + random + ".");
			if (random == 1) {
				if (Player == 0) {
					Player = 1;
				} else {
					Player = 0;
				}
				StdOut.println("");
				continue;
			}
			points = points + random;
			StdOut.println("You have " + points + " points.");
			StdOut.print("Keep going (y/n)? ");
			if (StdIn.readLine().equals("n")) {
				if (Player == 0) {
					Player = 1;
					Score0 = Score0 + points;
				} else {
					Player = 0;
					Score1 = Score1 + points;
				}
				StdOut.println("");
				continue;
			}
			while (true) {
				random = ((int) (Math.random() * 6)) + 1;
				StdOut.println("You rolled a " + random + ".");
				if (random == 1) {
					if (Player == 0) {
						Player = 1;
					} else {
						Player = 0;
					}
					break;
				}
				points = points + random;
				StdOut.println("You have " + points + " points.");
				StdOut.print("Keep going (y/n)? ");
				if (StdIn.readLine().equals("n")) {
					if (Player == 0) {
						Player = 1;
						Score0 = Score0 + points;
					} else {
						Player = 0;
						Score1 = Score1 + points;
					}
					break;
				}
			}
			StdOut.println("");
		}					
		StdOut.println("Game over. Final score: " + Score0 + "-" + Score1 + ".");
	}
}
