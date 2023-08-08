package space;

import java.util.ArrayList;
import java.util.List;

public class VisitorDesignPatternDemo {
    public static void main(String[] args) {
        List<SpaceShipItem> myitems = new ArrayList<>();

        myitems.add(new LunchBox("Bananas", 4));
        myitems.add(new LunchBox("Steak", 2));
        myitems.add(new LunchBox("Frozen Yogurt", 40));
        myitems.add(new LunchBox("Apple", 1));

        myitems.add(new NavigationComputer(10));
        myitems.add(new NavigationComputer(2));
        myitems.add(new NavigationComputer(3));
        myitems.add(new NavigationComputer(4));

        PriceHandler priceHandler = new PriceHandler();
        for (SpaceShipItem item : myitems) {
            item.visit(priceHandler);
        }

        System.out.println("This is the financial value: " + priceHandler.getValue());
    }
}
