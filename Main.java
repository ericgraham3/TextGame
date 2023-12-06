import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        // create a new game.Warrior

        Warrior testWarrior = new Warrior("Knight", "Ser Pounce", "Eric", "Good", "An honorable Knight with a longsword and a beaten shield.");
        System.out.println(testWarrior.getUniqueID());

        // create a new game.Skeleton

        Skeleton testSkeleton = new Skeleton("Mr. game.Skeleton", "Dead", 1, "A reanimated human skeleton wielding a rusty short sword.");
        System.out.println(testSkeleton.getUniqueID());

        Location location1 = new Location("The Cave", "A damp, unlit cave filled with the bones of fallen adventurers.");
        System.out.println(location1.getLocationId());

        location1.addEntity(testSkeleton);
        location1.addEntity(testWarrior);
        Item newItem = new Item("game.Treasure", "Gold Ring");
        System.out.println(newItem.getUniqueId());
        Item newItem2 = new Item("game.Treasure", "Silver ring");
        System.out.println(newItem2.getUniqueId());
        Item newItem3 = new Item("Junk", "Broken Dagger");
        System.out.println(newItem3.getUniqueId());
        Item newItem4 = new Item("Junk", "Empty potion bottle");
        System.out.println(newItem4.getUniqueId());
        Item newItem5 = new Item("Book", "Spellbook");
        System.out.println(newItem5.getUniqueId());
        location1.addItem(newItem);
        location1.addItem(newItem2);
        location1.addItem(newItem3);
        location1.addItem(newItem4);
        location1.addItem(newItem5);
//        game.Entity searchedSkeleton = location1.getEntity(testSkeleton.getName());
//        System.out.println("Testing that the game.Location array search works to find the game.Skeleton in the game.Location, whose name is " +searchedSkeleton.getName());

        Scanner scanner = new Scanner(System.in);
        int choice;

        // menu

        do {
            System.out.println(" ");
            System.out.println("In a " +location1.getDescription() +" a warrior named " +testWarrior.getName() +" stumbled across an undead skeletal warrior named " +testSkeleton.getName() +". What happens?");

            System.out.println(" ");
            System.out.println("1: Make Ser Pounce fight Mr. game.Skeleton");
            System.out.println("2: Make Mr. game.Skeleton attack Ser Pounce");
            System.out.println("3: See how much health Ser Pounce has");
            System.out.println("4: See how much health Mr. game.Skeleton has");
            System.out.println("5: Make Ser Pounce take the treasure from this location");
            System.out.println("6: Quit");
            System.out.println(" ");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    testWarrior.attack(testSkeleton);
                    break;
                case 2:
                    testSkeleton.attack(testWarrior);
                    break;
                case 3:
                    System.out.println("Ser Pounce has " +testWarrior.getCurrentHealth() +" hit points left.");
                    break;
                case 4:
                    System.out.println("Mr. game.Skeleton has " +testSkeleton.getCurrentHealth() +" hit points left.");
                    break;
                case 5:
                    System.out.println(location1.getLocation().size());
//                    game.Item testItem = location1.testGet(newItem);
//                    game.Item testItem2 = location1.testGet(newItem2);
//                    testWarrior.addToInventory(testItem);
//                    testWarrior.addToInventory(testItem2);
                    testWarrior.lootLocation(location1);
                    System.out.println(testWarrior.getInventory());
                    System.out.println(location1.getLocation().size());
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please enter the number that corresponds to your choice above.");
            }
        } while (choice!= 6);
    }
}