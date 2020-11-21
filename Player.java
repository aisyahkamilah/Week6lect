//base or super or parent class
public class Player {
	// private String name;
	// private double totalCashInHand;
	// private Token selectedToken;

	protected String name;
	protected double totalCashInHand;
	protected Token selectedToken;

	public Player() { } //default constuctor

	public Player (String name, Token selectedToken) { //association
		this.name = name;
		this.selectedToken = selectedToken;
		totalCashInHand = 500_000;
	}

	//polymorphism
	public void updatetotalCashInHand(double totalCashInHand) {
		this.totalCashInHand += totalCashInHand;
	}

	public String toString() { //association sebab selectedtoken merujuk kepada object kat main jadi dia gi ke class object tu iaitu token
		return "Player name " + name
		   + " with token " + selectedToken 
		   + " has RM " + totalCashInHand;
	}
}