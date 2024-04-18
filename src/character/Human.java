package character;

public class Human {
	private String name;
	private String soda;
	private int money;
	
	public Human(String name, int money, String soda) {
		this.name = name;
		this.money = money;
		this.soda = soda;
	}

	
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
	
	public void talk(String text) {
		System.out.println("(" + name + " ) - " + text);
	}
	
	public void sayHi() {
		talk("Hey ! I'm " + name + " and I like " + soda);
	}
	public void drink() {
		talk("Mmm, that's a good " + soda + " ! GLOUPS !");
	}
	public void gainMoney(int price) {
		money += price; 
	}
	public void looseMoney(int price) {
		money -= price;
	}
	public void buy(String object, int price) {
		if(money >= price) {
			talk("I got " + money + " in my pocket. I will buy a drink which costs " + price);
			looseMoney(price);
		}
		else {
			talk("I only have " + money + " in my pocket. I can't even afford this " + object + " which costs " + price);
		}
		
	}

	
	public static void main(String[] args) {
	}
}
