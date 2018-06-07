package project15;

public class AuctionItem extends Item {

    private int daysLeft;
    private double currentBid;
    private User highBidder;


    public AuctionItem(String name, double listCost, User owner, int days) {
        super(name, listCost, owner, true);
        this.daysLeft = days;
        this.currentBid = listCost;
        this.highBidder = null;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public void advanceDay() {
        if (this.isForSale() && this.getDaysLeft() == 0) {
            this.purchaseItem(highBidder,currentBid);
            this.getOwner().updateBalance(-currentBid);
        }
        else if (this.getDaysLeft() > 0) daysLeft--;

    }

    public String makeBid(User a, double bid) {
        if (bid > currentBid) {
            this.highBidder = a;
            this.currentBid = bid;
        }
        return this.highBidder.getName();
    }

    public void resetAuction(double startingBid, int days) {
        if (highBidder == null) {
            this.currentBid = startingBid;
            this.daysLeft = days;
        }
    }

    @Override
    public String toString() {
        if (this.highBidder != null) {
            return this.getName() + " ($" + this.getCurrentBid() + ", " + this.highBidder.getName()
                    + ", "  + this.getDaysLeft() + " days left)";

        }
        else
            return this.getName() + " ($" + this.getCurrentBid() + ", " + "None"
                    + ", "  + this.getDaysLeft() + " days left)";
    }
}
