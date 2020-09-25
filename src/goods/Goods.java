package goods;

class Goods {
    String name;
    double price;
    String description;

    public Goods(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    void showInformation(){
        System.out.println("Name: "+name+ " Description: " + description + "Price: " + price);
    }
}
