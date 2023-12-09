public class Main {

    public static void main(String[] args) {
        // test new character creation methods for Warrior
        Archer testArcher = new Archer("Legolas, of Course", "Eric", "Good", "Looks like Orlando Bloom with long, silky hair");
        Berserker testBerserker = new Berserker("Amleth", "Eric", "Neutral", "Looks like if Alexander Skarsgard got jacked af, totally natural");
        Knight testKnight = new Knight("Ser Pounce", "Eric", "Good", "An adorable kitten in full armor, carrying a longsword and shield");

        // create test Skeleton
        Skeleton testSkeleton = new Skeleton();

        // create test location
        Location testLocation = new Location("Plato's Cave", "An ordinary cave with a large fire in the middle, around which a handful of humans sit, transfixed by the shadows they see on the wall. Also, a skeleton is here.");

        // put three warriors and a skeleton in a room
        testLocation.addEntity(testArcher);
        testLocation.addEntity(testBerserker);
        testLocation.addEntity(testKnight);
        testLocation.addEntity(testSkeleton);

        // make them fight
        testArcher.attack(testSkeleton);
        testSkeleton.attack(testArcher);
        testBerserker.attack(testSkeleton);
        testKnight.attack(testSkeleton);
        System.out.println("Archer health: " +testArcher.getCurrentHitPoints());
        System.out.println("Berserker health: " +testBerserker.getCurrentHitPoints());
        System.out.println("Knight health: " +testKnight.getCurrentHitPoints());
        System.out.println("Skeleton health: " +testSkeleton.getCurrentHitPoints());
        System.out.println("Is the skeleton alive?" +testSkeleton.isAlive());1
    }
}