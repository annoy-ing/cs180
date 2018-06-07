package project14;

public class Test {

    public static void main(String[] args) {
        Card a1 = new Card("Oleg","Ukrainian",1978,-1);

        Card a2 = new Card("Stas", "Bulgarian", 1973,2005);
        Card a3 = new Card("Pasha", "Bulgarian", 1973,2005);
        Card a4 = new Card("Vasya", "Bulgarian", 1973,2005);
        Card a5 = new Card("Kolya", "Bulgarian", 1973,2005);

        CardCollection c1 = new CardCollection("Lyuda");
        c1.addCard(a1);
        c1.addCard(a1);
        c1.addCard(a2);
        c1.addCard(a3);
        CardCollection c2 = new CardCollection("Evstoliya");
        c2.addCard(a3);
        c2.addCard(a3);
        c2.addCard(a4);
        c2.addCard(a5);
        System.out.println(c1);
        System.out.println("\n\n");
        System.out.println(c2);
        System.out.println("\n\n");
        System.out.println("merging collection");
        System.out.println("duplicates:\n");
        for (Card c: c1.mergeCollection(c2)
             ) {
            System.out.println(c);
        }
        System.out.println("\n\n");
        System.out.println(c1);
        System.out.println("\n\n");
        System.out.println(c2);
        System.out.println("\n\n");
        System.out.println("remove element");
        c2.removeCard(0);
        System.out.println("\n\n");
        System.out.println(c2);
        System.out.println("remove element");
        c2.removeCard(0);
        System.out.println("\n\n");
        System.out.println(c2);



    }
}
