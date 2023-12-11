import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Location location1 = new Location("The Cave", "This is the description of the cave, which is suspiciously free of skeletons");
        AdventureView view = new AdventureView();
        AdventureController controller = new AdventureController(location1, view);

        controller.addLocationMenu("narrative1", "Text for Narrative 1");
        controller.addLocationMenu("search", "Text for Search");
        controller.adventureMenu();

//        // create an array of locations and put skeletons with them
//        ArrayList<Location> locations = new ArrayList<>();
//        Location loc1 = new Location("entry", "first room, has a door to the left and a door to the right. And there is a skeleton here.");
//        Location loc2 = new Location("right room", "The room to the right of the entry. And there is a skeleton here.");
//        Location loc3 = new Location("left room", "The room to the left of the entry. And there is a skeleton here.");
//
//        Skeleton skel1 = new Skeleton();
//        loc1.addEntity(skel1);
//        Skeleton skel2 = new Skeleton();
//        loc2.addEntity(skel2);
//        Skeleton skel3 = new Skeleton();
//        loc3.addEntity(skel3);
//
//        locations.add(loc1);
//        locations.add(loc2);
//        locations.add(loc3);
//
//        System.out.println(locations);
//        System.out.println(loc1);
//        System.out.println(loc2);
//        System.out.println(loc3);
    }
}