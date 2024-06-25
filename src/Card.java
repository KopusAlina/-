import java.util.*;

public class Card {
    private final String suit;
    private final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(suit, card.suit) && Objects.equals(rank, card.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    private static final String TREF = "треф";
    private static final String KRESTI = "крести";
    private static final String CHERVI = "черви";
    private static final String PIKA = "пика";

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    public static void main(String[] args) {
    Card card1 = new Card(TREF, "6");
    Card card2 = new Card(TREF, "7");
    Card card3 = new Card(TREF, "8");
    Card card4 = new Card(TREF, "9");
    Card card5 = new Card(TREF, "10");
    Card card6 = new Card(TREF, "валет");
    Card card7 = new Card(TREF, "дама");
    Card card8 = new Card(TREF, "король");
    Card card9 = new Card(TREF, "туз");
    Card card10 = new Card(KRESTI, "6");
    Card card11 = new Card(KRESTI, "7");
    Card card12 = new Card(KRESTI, "8");
    Card card13 = new Card(KRESTI, "9");
    Card card14 = new Card(KRESTI, "10");
    Card card15 = new Card(KRESTI, "валет");
    Card card16 = new Card(KRESTI, "дама");
    Card card17 = new Card(KRESTI, "король");
    Card card18 = new Card(KRESTI, "туз");
    Card card19 = new Card(CHERVI, "6");
    Card card20 = new Card(CHERVI, "7");
    Card card21 = new Card(CHERVI, "8");
    Card card37 = new Card(CHERVI, "8");
    Card card40 = new Card(CHERVI, "8");
    Card card38 = new Card(CHERVI, "8");
    Card card39 = new Card(CHERVI, "8");
    Card card22 = new Card(CHERVI, "9");
    Card card23 = new Card(CHERVI, "10");
    Card card24 = new Card(CHERVI, "валет");
    Card card25 = new Card(CHERVI, "дама");
    Card card26 = new Card(CHERVI, "король");
    Card card27 = new Card(CHERVI, "туз");
    Card card28 = new Card(PIKA, "6");
    Card card29 = new Card(PIKA, "7");
    Card card30 = new Card(PIKA, "8");
    Card card31 = new Card(PIKA, "9");
    Card card32 = new Card(PIKA, "10");
    Card card33 = new Card(PIKA, "валет");
    Card card34 = new Card(PIKA, "дама");
    Card card35 = new Card(PIKA, "король");
    Card card36 = new Card(PIKA, "туз");

        List<Card> cardList = new ArrayList<>();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        cardList.add(card6);
        cardList.add(card7);
        cardList.add(card8);
        cardList.add(card9);
        cardList.add(card10);
        cardList.add(card11);
        cardList.add(card12);
        cardList.add(card13);
        cardList.add(card14);
        cardList.add(card15);
        cardList.add(card16);
        cardList.add(card17);
        cardList.add(card18);
        cardList.add(card19);
        cardList.add(card20);
        cardList.add(card21);
        cardList.add(card22);
        cardList.add(card23);
        cardList.add(card24);
        cardList.add(card25);
        cardList.add(card26);
        cardList.add(card27);
        cardList.add(card28);
        cardList.add(card29);
        cardList.add(card30);
        cardList.add(card31);
        cardList.add(card32);
        cardList.add(card33);
        cardList.add(card34);
        cardList.add(card35);
        cardList.add(card36);
        cardList.add(card37);
        cardList.add(card38);
        cardList.add(card39);
        cardList.add(card40);

        Set<Card> cardSet = new HashSet<>(cardList);

        for (Card card : cardSet) {
            System.out.println(card);
            System.out.println(cardSet.size());
        }

    }
}