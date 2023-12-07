import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // create a new Warrior

        Warrior testWarrior = new Warrior("Knight", "Ser Pounce", "Eric", "Good", "An honorable Knight with a longsword and a beaten shield.");
        System.out.println(testWarrior.getUniqueID());

        // create a new Skeleton

        Skeleton testSkeleton = new Skeleton("Mr. Skeleton", "Dead", 1, "A reanimated human skeleton wielding a rusty short sword.");
        System.out.println(testSkeleton.getUniqueID());

        Location location1 = new Location("The Cave", "A damp, unlit cave filled with the bones of fallen adventurers.");
        System.out.println(location1.getUniqueID());

        location1.addEntity(testSkeleton);
        location1.addEntity(testWarrior);
        Item newItem = new Item("Treasure", "Gold Ring");
        System.out.println(newItem.getUniqueID());
        Item newItem2 = new Item("Treasure", "Silver ring");
        System.out.println(newItem2.getUniqueID());
        Item newItem3 = new Item("Junk", "Broken Dagger");
        System.out.println(newItem3.getUniqueID());
        Item newItem4 = new Item("Junk", "Empty potion bottle");
        System.out.println(newItem4.getUniqueID());
        Item newItem5 = new Item("Book", "Spellbook");
        System.out.println(newItem5.getUniqueID());
        location1.addItem(newItem);
        location1.addItem(newItem2);
        location1.addItem(newItem3);
        location1.addItem(newItem4);
        location1.addItem(newItem5);

        Scanner scanner = new Scanner(System.in);
        int choice;

        // menu

        do {
            System.out.println(" ");
            System.out.println("In a " +location1.getDescription() +" a warrior named " +testWarrior.getName() +" stumbled across an undead skeletal warrior named " +testSkeleton.getName() +". What happens?");

            System.out.println(" ");
            System.out.println("1: Make Ser Pounce fight Mr. Skeleton");
            System.out.println("2: Make Mr. Skeleton attack Ser Pounce");
            System.out.println("3: See how much health Ser Pounce has");
            System.out.println("4: See how much health Mr. Skeleton has");
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
                    System.out.println("Mr. Skeleton has " +testSkeleton.getCurrentHealth() +" hit points left.");
                    break;
                case 5:
                    System.out.println(location1.getLocation().size());
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