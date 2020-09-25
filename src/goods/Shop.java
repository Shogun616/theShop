package goods;

public class Shop {

    public static void main(String[] args) {

        Food food1 = new Food("tufo", "Asian delight", 45,30);
        Book book1 = new Book("Michael Moore", "Design Patterns ", "A turtorial on design patterns", 34);
        Cloth cloth1 = new Cloth("Cardigan", "Blue Stripes", 35.50,38);

        food1.showInformation();
        book1.showInformation();
        cloth1.showInformation();

        System.out.println("Price is: " + food1.price + "\n");
        System.out.println("Shipping cost for " + book1.name + "is: "
                + book1.calculateCost(34) + book1.name + "\n");
        System.out.println("Total cost for" + book1.name + "is: "
                +(book1.calculateCost(34) + book1.price) + "\n");

        System.out.println("Shipping cost for " + cloth1.name + "is: "
                + cloth1.calculateCost(4) + "\n");
    }
}
