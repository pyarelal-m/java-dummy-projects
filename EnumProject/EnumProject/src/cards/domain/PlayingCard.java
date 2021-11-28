package cards.domain;

public class PlayingCard {
	public final static int SPADES=0;
	public final static int CLUBS=1;
	public final static int HEARTS=2;
	public final static int DIAMONDS=3;
	
	int suit;
	int rank;
	public PlayingCard() {
		// TODO Auto-generated constructor stub
	}
	public PlayingCard(int suit, int rank) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getRank() {
		return rank;
	}
	public int getSuit() {
		return suit;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	

}
