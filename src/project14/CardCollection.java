package project14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CardCollection {

    private String owner;
    private List<Card> myCollection;

    public CardCollection(String owner) {
        this.owner = owner;
        myCollection = new ArrayList<Card>();

    }

    public List<Card> getMyCollection() {
        return myCollection;
    }

    public boolean addCard(Card a) {
        for (Card b: myCollection) {
            if (a.compareTo(b) == 0) return false;
        }
        myCollection.add(a);
        myCollection.sort(new Comparator<Card>() {
            @Override
            public int compare(Card card, Card t1) {
                return card.getName().compareTo(t1.getName());
            }
        });
        return true;
    }

    public void removeCard(int cardIndex) {
        myCollection.remove(cardIndex);
    }

    public void removeCard(Card c) {
        myCollection.remove(c);
    }

    public int getSize() {
        return myCollection.size();
    }

    public List<Card> mergeCollection(CardCollection b) {
        List<Card> dublicates = new ArrayList<Card>();

        for (Card c: b.getMyCollection()) {
            if (!this.addCard(c)) {
                dublicates.add(c);

            }
        }

        dublicates.sort(new Comparator<Card>() {
            @Override
            public int compare(Card card, Card t1) {
                return card.getName().compareTo(t1.getName());
            }
        });
        for (Card c: dublicates
             ) {
            b.removeCard(c);
        }

        return dublicates;
    }


    public String toString() {
        String toReturn = owner;
        toReturn += "\n";
        for (int i = 0; i < owner.length(); i++) {
            toReturn += "-";
        }
        toReturn += "\n";

        for (Card c: myCollection) {
            toReturn += c.toString();
            toReturn += "\n";
        }

        return toReturn;
    }



}
