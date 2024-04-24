public class TelcoAllowance implements TelcoVisitor {
    public void visit(TelcoSubscription telco) {
        System.out.println(telco.getTelcoName() + " Data Usage Offer and price: " + telco.getPromoPrice() + " with " + telco.getPromoPrice() / 100 + " GB data allowance");
    }

    public String showAllowance(String telcoName, int promoPrice) {
        return telcoName + " Data Usage Offer and price: " + promoPrice + " with " + promoPrice / 100 + " GB data allowance";
    }
}