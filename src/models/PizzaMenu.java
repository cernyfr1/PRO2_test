package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PizzaMenu {

    private List<PizzaMenuItem> menuItems;
    private LocalDateTime lastUpdate;

    public PizzaMenu(){
        menuItems = new ArrayList<>();
    }

    public void addItem(PizzaMenuItem itemToAdd){
        menuItems.add(itemToAdd);
        lastUpdate = LocalDateTime.now();
    }

    public void removeItem(PizzaMenuItem itemToRemove){
        menuItems.remove(itemToRemove);
    }

    @Override
    public boolean equals(Object obj) {
        return ((PizzaMenu)obj).menuItems.size()==menuItems.size();
    }

    public void removeItem(String name){
        PizzaMenuItem itemToDelete = null;
        for (PizzaMenuItem item : menuItems){
            if(item.getName().equals(name)){
                itemToDelete = item;
            }
            break;
        }

        if(itemToDelete!=null){
            menuItems.remove(itemToDelete);
            lastUpdate = LocalDateTime.now();
        }
    }
}
