package project14;

public class Card implements Comparable {

    private String name;
    private String nationality;
    private int yearBorn;
    private int yearDied;

    public Card(String name, String nationality, int yearBorn, int yearDied) {
        this.name = name;
        this.nationality = nationality;
        this.yearBorn = yearBorn;
        this.yearDied = yearDied;
    }

    public String getName() {
        return name;
    }



    public int compareTo(Object o) {
        return this.getName().compareTo(((Card) o).getName());
    }

    public String toString(){
        if (this.yearDied == -1)
            return this.name + " (" + this.yearBorn + "-"
                    + "present) - " + this.nationality;
        else return this.name + " (" + this.yearBorn + "-"
                + this.yearDied +
                ") - " + this.nationality;
    }


}
