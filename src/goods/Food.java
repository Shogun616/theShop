package goods;

class Food extends Goods{

    double weight;

    public Food(String name, String description, double price, double weight) {
        super(name, description, price);
        this.weight = weight;
    }

    @Override
    void showInformation() {
        super.showInformation();
        System.out.println("Weight: " + weight);
    }
}
