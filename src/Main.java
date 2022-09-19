import models.PizzaMenu;
import models.PizzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("Hello again!");

        int num = 10;
        int num2 = 15;

        if (num == num2){
            System.out.println("num==num2");
        }
        else if (num < num2){
            System.out.println("num<num2");
        }

        String text = "aaa";
        String text2 = "aaa";

        if (text.equals(text2)){
            System.out.println("==");
        }
        else{
            System.out.println("!=");
        }


        PizzaMenuItem item1 = new PizzaMenuItem(125, "Hawai", "pineapple pizza");
        PizzaMenuItem item2 = new PizzaMenuItem(125, "Hawai", "pineapple pizza");
        PizzaMenuItem item3 = item1;
        PizzaMenuItem item4 = new PizzaMenuItem(189, "Polo", "polo");

        System.out.println(item1);

        item2.setPrice(200);


        List<PizzaMenuItem> pizzaItems = new ArrayList<>();
        pizzaItems.add(item1);
        pizzaItems.add(item2);
        pizzaItems.add(item3);
        pizzaItems.add(item4);

        for (PizzaMenuItem item : pizzaItems){
            System.out.println(item);
        }

        System.out.println("-----------------------");

        PizzaMenu menu1 = new PizzaMenu();
        menu1.addItem(new PizzaMenuItem(189, "Polo", "polo"));
        menu1.addItem(new PizzaMenuItem(199, "Hawaii", "hawaii"));


        PizzaMenu menu2 = new PizzaMenu();
        menu1.addItem(new PizzaMenuItem(189, "Polo", "polo"));
        menu1.addItem(new PizzaMenuItem(199, "Hawaii", "hawaii"));



    }
}
