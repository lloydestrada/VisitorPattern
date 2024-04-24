# VisitorPattern

Imagine you are looking for a new mobile plan for your smartphone. Three major telecommunication providers are offering enticing deals: Smart, Globe, and Ditto.

#### Smart
- **Data Allowance:** 15 GB
- **Price:** ₱500 per month
- **Additional Info:** No free calls or texts. Charges apply per use.

#### Globe
- **Data Allowance:** 10 GB
- **Price:** ₱450 per month
- **Additional Info:** Unlimited calls and texts to subscribers within their network. Extra charges for calls and texts to other networks.

#### Ditto
- **Data Allowance:** 8 GB
- **Price:** ₱400 per month
- **Additional Info:** Unlimited calls and texts to all networks within the country.

### Implementation Details

Implement the visitor design pattern based on the given diagram. Refer to [this link](#) for further details.

### Test Program

```java
public class TelcoPromo {
  public static void main(String[] args) {
    TelcoSubscription smart = new Telco(15, 500, Smart, false);
    TelcoSubscription globe = new Telco(10, 450, Globe, true);
    TelcoSubscription ditto = new Telco(8, 400, Ditto, true);

    UsagePromo promo = new TelcoAllowance();
    UnliCallOffer unli = new UnliCallTextPackage();    

    System.out.println("Smart Data Usage Offer and Price: " + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
    System.out.println("Globe Data Usage Offer and Price: " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
    System.out.println("Ditto Data Usage Offer and Price: " + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

    System.out.println("\nSmart Unlimited Calls and Text Package: " +
                                  unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
    System.out.println("Globe Unlimited Calls and Text Package: " +
                                  unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
    System.out.println("Ditto Unlimited Calls and Text Package: " +
                                  unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
  }
}
![3BSCS1_Estrada_VisitorPatternSW](https://github.com/lloydestrada/VisitorPattern/assets/142376663/d8327d14-cda2-4c64-87a2-05253cee3ad9)

