package goods;

import java.util.ArrayList;

public class Shop2 {

    static ArrayList<Goods> shoppingbag = new ArrayList<>();

    public static void main(String[] args){
        int items = 0;
        Food food1 = new Food("tufo", "Asian delight", 45,30);
        Book book1 = new Book("Michael Moore", "Design Patterns ", "A turtorial on design patterns", 34);
        Cloth cloth1 = new Cloth("Cardigan", "Blue Stripes", 35.50,38);

        shoppingbag.add(book1);
        shoppingbag.add(food1);
        shoppingbag.add(cloth1);

        System.out.println("The following items has shipping cost: ");
        for (Goods currentgoods : shoppingbag){
            if(currentgoods instanceof HasShippingCost){
                items++;
                System.out.println(currentgoods.name+ "has a shipping cost");
            }
        }
        System.out.println(items + "items has shipping cost");
    }
}
