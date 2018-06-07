package project15;

public class SaleItem extends Item {

    private double discount;


    public SaleItem(String name, double listCost, User owner, double discount) {
        super(name, listCost, owner, true);
        this.discount = discount;


    }

    public String getDiscount() {
        return Math.floor(discount*100) + "%";
    }


    public void purchaseItem(User a) {
        super.purchaseItem(a, this.getListCost()*(1-discount));
    }

    public String toString() {
        return super.toString();
    }


}
