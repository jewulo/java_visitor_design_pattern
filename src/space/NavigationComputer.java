package space;

public class NavigationComputer implements SpaceShipItem {
    private Integer quantity = 0;

    public NavigationComputer(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void visit(MyVisitor visitor) {
        visitor.visit(this);
    }
}
