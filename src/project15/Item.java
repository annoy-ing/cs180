package project15;

public class Item {

    private String name;
    private double listCost;
    private User owner;
    private boolean forSale;

    public Item(String name, double listCost, User owner, boolean forSale) {
        this.name = name;
        this.listCost = roundingToTwoDecimals(listCost);
        this.owner = owner;
        this.forSale = forSale;
    }

    public static double roundingToTwoDecimals(double a) {
        return (Math.floor(a*100.00)/100.00);
    }

    public String getName() {
        return name;
    }

    public double getListCost() {
        return listCost;
    }

    public User getOwner() {
        return owner;
    }

    public boolean isForSale() {
        return forSale;
    }

    public void setListCost(double listCost) {
        this.listCost = listCost;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void toggleForSale(){
        forSale = !forSale;
    }

    public void purchaseItem(User a, double b) {
        toggleForSale();
        this.setOwner(a);
        a.updateBalance(b);
    }

    @Override
    public String toString() {
        return this.getName() + " ($" + this.getListCost() + " - " + this.getOwner().getName() + ")";
    }
}
