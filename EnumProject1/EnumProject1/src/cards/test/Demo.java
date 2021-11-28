package cards.test;
import cards.domain.PlayingCard;
import cards.domain.Suit;

public class Demo {
	public static void main(String[] args) {
		PlayingCard ob=new PlayingCard(2,Suit.HEARTS);
		System.out.println(ob.getSuit() + "  "+ob.getRank() );

		//PlayingCard ob1=new PlayingCard(2,47);
		//System.out.println(ob1.getSuit() + "  "+ob1.getRank() );
	}

}
