/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.ArrayList;
import java.util.List;
public class DrivableTrader extends Trader{
    private final List<Drivable> inventory;
    private final List<Drivable> wishlist;
    private int money;
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(money);
        this.inventory = inventory;
        this.wishlist = wishlist;
    }

    public DrivableTrader(int money){
        super(money);
        this.inventory = new ArrayList<>();
        this.wishlist = new ArrayList<>();
    }

    @Override
    public int getSellingPrice(Object obj){
        if(obj instanceof Drivable){
            return (((Drivable) obj).getMaxSpeed() + ((Tradable) obj).getPrice());
        }
        else{
            return super.getSellingPrice(obj);
        }
    }
}