package cards.test;
import cards.domain.PlayingCard;

public class Demo {
	public static void main(String[] args) {
		PlayingCard ob=new PlayingCard(PlayingCard.HEARTS,2);
		System.out.println(ob.getSuit() + "  "+ob.getRank() );

		PlayingCard ob1=new PlayingCard(47,2);
		System.out.println(ob1.getSuit() + "  "+ob1.getRank() );
	}

}
