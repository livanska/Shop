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
        if(shoeslist.isEmpty())
            shoes.setId(1);
        else
            shoes.setId(shoeslist.get((shoeslist.size()-1)).getId()+1);
        shoeslist.add(shoes);
    }

    public void deleteItem(int id) {
        for (Shoes element : shoeslist) {
            if (element.getId() == id) {
                shoeslist.remove(shoeslist.indexOf(element));
                break;
            }

        }
    }
    public void showAll() {
        showList(shoeslist);
    }

    public double findSumById(int id) {
        for (Shoes element : shoeslist) {
            if (element.getId() == (id)) {
                System.out.println("Customer bought  "+ element.getBrand() + " (" + element.getSize() + ") for " + element.getPrice()+"$");
                return element.getPrice();
            }
        }

        return -1;
    }
    public void sortByBrand(boolean type) {  //anonymous inner class
        BrandComparator brandComparator = new BrandComparator(){

            public int compare(Shoes s1, Shoes s2) {
                return s1.getBrand().compareTo(s2.getBrand());
            }
        };
        System.out.println("SORTED BY BRAND:");
        if (type){
            Collections.sort(shoeslist, brandComparator);
        }
        else
        {
            Collections.sort(shoeslist, Collections.reverseOrder(brandComparator));
        }
    }
    public void sortBySize(boolean type) {
        System.out.println("SORTED BY SIZE:");
        if (type){
            Collections.sort(shoeslist, new Shoes().new ShoesSizeComparator());
        }
        else
        {
            Collections.sort(shoeslist, Collections.reverseOrder(new Shoes().new ShoesSizeComparator()));
        }
    }

    public void sortByPrice(boolean type) {
        System.out.println("SORTED BY PRICE:");
        if (type){
            Collections.sort(shoeslist, new Shoes.ShoesPriceComparator());
        }
        else
        {
            Collections.sort(shoeslist, Collections.reverseOrder(new Shoes.ShoesPriceComparator()));
        }
    }
    public void findSize(int size) {
        List<Shoes> sizeShoes = new ArrayList<>();
        for (Shoes element : shoeslist) {
            if (element.getSize() == size) {
                sizeShoes.add(element);
            }
        }
        showList(sizeShoes);
    }
    public void findType(EShoesCategory type) {
        List<Shoes> typeShoes = new ArrayList<>();
        for (Shoes element : shoeslist) {
            if (element.type == type) {
                typeShoes.add(element);
            }
        }
        showList(typeShoes);
    }
    public void showList(List<Shoes> list) {
        if (list.isEmpty()) {
            System.out.println("No such items");
        } else {
            for (Shoes element : list)
                System.out.println("[" + element.getId() + "] " + element.getBrand() + "    (" + element.getSize() + ")  type: " + element.getType() + "   " + element.getPrice()+"$");
        }
        System.out.println();

    }
}