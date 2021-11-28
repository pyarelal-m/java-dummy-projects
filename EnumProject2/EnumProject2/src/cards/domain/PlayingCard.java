package cards.domain;

public class PlayingCard {
	Suit suit;
	int rank;
	public PlayingCard() {
		// TODO Auto-generated constructor stub
	}
	public PlayingCard(int rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getRank() {
		return rank;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	

}
