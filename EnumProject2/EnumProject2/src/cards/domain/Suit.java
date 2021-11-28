package cards.domain;

public enum Suit {
	SPADES("Black"),
	CLUBS("Black"),
	HEARTS("Red"),
	DIAMONDS("Red");
	
	private String color;
	private Suit(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	
}


/*
  		final static	Suit SPADES=new Suit("Black");
  
  */
