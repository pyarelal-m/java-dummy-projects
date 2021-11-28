package cards.test;
import cards.domain.PlayingCard;
//import cards.domain.Suit;
import static cards.domain.Suit.*;
import static java.lang.System.out;
public class Demo {
	public static void main(String[] args) {
		//PlayingCard ob=new PlayingCard(2,Suit.HEARTS);
		PlayingCard ob=new PlayingCard(2,HEARTS);
		System.out.println(ob.getSuit() + "  "+ob.getRank() );
		out.println(ob.getSuit().getColor());

		//PlayingCard ob1=new PlayingCard(2,47);
		//System.out.println(ob1.getSuit() + "  "+ob1.getRank() );
	}

}
