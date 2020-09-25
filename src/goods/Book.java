package goods;

public class Book extends Goods implements HasShippingCost{
    String author;

    public Book(String author, String name, String description, double price) {
        super(name, description, price);
        this.author=author;
    }

    @Override
    void showInformation() {
        super.showInformation();
        System.out.println("Author: " + author);
    }

    @Override
    public double calculateCost(double distance) {
        return (distance* COSTPERMILE);
    }
}
