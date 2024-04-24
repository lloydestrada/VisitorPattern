public class Telco implements TelcoSubscription {
    private int dataAllowance;
    private int promoPrice;
    private boolean unliCallText;
    private TelcoType telcoType;

    public Telco(int dataAllowance, int promoPrice, TelcoType telcoType, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoType = telcoType;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoType.getName();
    }

    public int getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    public void accept(TelcoVisitor visitor) {
        visitor.visit(this);
    }
}