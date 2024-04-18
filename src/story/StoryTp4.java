package story;
import character.Human;

public class StoryTp4 {
	public static void main(String[] args) {
		Human Prof = new Human("Prof", 54, "kombucha");
		Prof.sayHi();
		Prof.buy("kombucha", 12);
		Prof.drink();
		Prof.buy("jeu", 2);
		Prof.buy("kimono", 50);
		
	}
}
