//derive or sub or child class
public class PropertyOwner extends Player {
	// private String name;
	// private double totalCashInHand;
	// private Token selectedToken;
	private String nameOwnedProperty; //extra

	public PropertyOwner() { }

	public PropertyOwner (String name, Token selectedToken) {
		// this.name = name;
		// this.selectedToken = selectedToken;
		// totalCashInHand = 500_000;
		super(name, selectedToken); //nak ambil dari player 
		nameOwnedProperty = " No property yet"; //extra
	}

	//extra
	public void buyProperty(String nameOwnedProperty) {
		this.nameOwnedProperty = nameOwnedProperty;
	}

	@Override //java jaga supaya tetap override
	public void updatetotalCashInHand(int totalCashInHand) {
		//this.totalCashInHand += totalCashInHand; //marah sbb kita dah tutup
		//super.updatetotalCashInHand(totalCashInHand); //nak ambil dari player(superclass)
		super.totalCashInHand += totalCashInHand; //protected
	}

	public String toString() {
		// return "Player name " + name
		//    + " with token " + selectedToken 
		//    + " has RM " + totalCashInHand
		return super.toString()
		   + " and has " + nameOwnedProperty; //extra
	}

}