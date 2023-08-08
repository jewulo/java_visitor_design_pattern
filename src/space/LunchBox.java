package space;

public class LunchBox implements SpaceShipItem {
    private String foodtype = "Tomatoes";
    private Integer quantity = 0;

    public LunchBox(String foodtype, Integer quantity) {
        this.foodtype = foodtype;
        this.quantity = quantity;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public void visit(MyVisitor visitor) {
        visitor.visit(this);     // calls MyVisitor::visit(LunchBox)
    }
}
