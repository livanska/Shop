package shoesshop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoesManager {
    private List<Shoes> shoeslist;

    public ShoesManager() {
        this.shoeslist = new ArrayList<>();
    }
    public void addItem(Shoes shoes) {
        shoeslist.add((Shoes) shoes);
    }
    public void deleteItem(int id) {
        for (Shoes element : shoeslist){
            if (element.getId() == id){
                shoeslist.remove(shoeslist.indexOf(element));
            }
        }
    }
}