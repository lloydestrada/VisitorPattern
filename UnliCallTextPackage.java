public class UnliCallTextPackage implements TelcoVisitor {
    public void visit(TelcoSubscription telco) {
        if (telco.getUnliCallText()) {
            System.out.println(telco.getTelcoName() + " unlimited calls and text package: Unlimited calls and texts to all networks");
        } else {
            System.out.println(telco.getTelcoName() + " unlimited calls and text package: No unlimited calls and texts");
        }
    }

    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (unliCallText) {
            return telcoName + " unlimited calls and text package: Unlimited calls and texts to all networks";
        } else {
            return telcoName + " unlimited calls and text package: No unlimited calls and texts";
        }
    }
}