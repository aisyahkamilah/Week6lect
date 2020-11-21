public class Token {
	private String name;
	private int currentPosition = 0;
	private String color;

	public Token() { }//default

	public Token(String name, String color) { //overloading constructor
		this.name = name;
		this.color = color;
	}

	public int updatePosition (int steps) {
	currentPosition += steps;
	return currentPosition;
	}

	public String toString() {
		return color + " " + name 
		   + " is at position " + currentPosition;
	}
}