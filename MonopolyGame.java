public class MonopolyGame {
	public static void main(String args[]) {
	Token wheelbarrow = new Token("wheelbarrow","blue");
	wheelbarrow.updatePosition(5);
	System.out.println(wheelbarrow);

	Player p1 = new Player("Aisyah", wheelbarrow);
	System.out.println(p1);

	Token hat = new Token("hat", "green");
	PropertyOwner po1 = new PropertyOwner("Aisyah", hat);
	po1.buyProperty("Mydin Sdn. Bhd. ");
	System.out.println(po1);

	Token car = new Token ();
	}
}