/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    public boolean addDrivable(String ID, Drivable obj){
        if(drivable_map.containsKey(ID)){
            return false;
        }
        else {
            drivable_map.put(ID, obj);
            return true;
        }
    }



    public boolean hasFasterThan(int speed) {
        for (String i : drivable_map.keySet()) {
            if (drivable_map.get(i) instanceof Drivable){
                if (( drivable_map.get(i)).getMaxSpeed() >= speed){
                    return true;
                }
            }
        }
        return false;
    }



    public List getTradable(){
        List temp;
        temp = new ArrayList();
        for (String i : drivable_map.keySet()) {
            if (drivable_map.get(i) instanceof Tradable){
                temp.add(drivable_map.get(i));
                }
            }
        return temp;
        }
    }



    
