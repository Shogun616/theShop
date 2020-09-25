package goods;

public class Cloth extends Goods implements HasShippingCost{

    double size;

    public Cloth(String name, String description, double price, double size) {
        super(name, description, price);
        this.size = size;
    }

    @Override
    void showInformation() {
        super.showInformation();
        System.out.println("Size: " +size);
    }

    @Override
    public double calculateCost(double distance) {
        return (distance*COSTPERMILE/2);
    }
}
