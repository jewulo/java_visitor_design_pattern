package space;

public class PriceHandler implements MyVisitor {
    private Double value = 0.0d;

    public Double getValue() {
        return value;
    }

    @Override
    public void visit(LunchBox lunchBox) {
        value += 10.0d * lunchBox.getQuantity();
    }

    @Override
    public void visit(NavigationComputer navigationComputer) {
        value += 1250.0d * navigationComputer.getQuantity();
    }
}
