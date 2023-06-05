package andrew.nestedClasses;

import java.util.ArrayList;
import java.util.Objects;

public class Game {
    ArrayList<Player.Inventory> items = new ArrayList<>();

    public ArrayList<Player.Inventory> getItems() {
        return items;
    }

    void addItem(String item, String description){
        Player.Inventory inventoryItem = new Player.Inventory(item, description);
        items.add(inventoryItem);
    }

    void removeItem(String item){
        items.removeIf(i -> Objects.equals(i.item, item));
    }

    static class Player{
        public Player() {

        }

        static class Inventory{
            String item;
            String description;

            public Inventory(String item, String description) {
                this.item = item;
                this.description = description;
            }

            @Override
            public String toString() {
                return "Inventory{" +
                        "item='" + item + '\'' +
                        ", description=" + description +
                        '}';
            }

        }
    }

    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("Starting Inventory: ");
        for(Player.Inventory item : game.getItems()){
            System.out.println(item + ", ");
        }

        game.addItem("sword", "strong and sharp");  //+sword
        game.addItem("bow", "long and wooden");  //+bow
        game.addItem("rock", "blunt & heavy");  //+rock
        game.removeItem("sword");  //-sword

        System.out.println("\nEnding Inventory: ");
        for(Player.Inventory item : game.getItems()){
            System.out.println(item + ", ");
        }

    }

}
