package goods;

public interface HasShippingCost {

    double COSTPERMILE = 2.1;

    double calculateCost(double distance);
}
