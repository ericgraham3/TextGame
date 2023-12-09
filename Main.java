public class Main {

    public static void main(String[] args) {
        // test new character creation methods for Warrior
        Archer testArcher = new Archer("Legolas (of Course)", "Eric", "Good", "Looks like Orlando Bloom with long, silky hair");
        Berserker testBerserker = new Berserker("Amleth", "Eric", "Neutral", "Looks like Alexander Skarsgard if he got shredded af without the aid of any steroids, I'm sure");
        Knight testKnight = new Knight("Ser Pounce", "Eric", "Good", "An adorable kitten in full armor, carrying a longsword and shield");

        // create test Skeleton
        Skeleton testSkeleton = new Skeleton();

        // create test location
        Location testLocation = new Location("Plato's Cave", "An ordinary cave with a large fire in the middle, around which a handful of humans sit, transfixed by the shadows they see on the wall. Also, an animated skeleton with a rusty short sword is here, and he attacks you!.");

        // put three warriors and a skeleton in a room
        testLocation.addEntity(testArcher);
        testLocation.addEntity(testBerserker);
        testLocation.addEntity(testKnight);
        testLocation.addEntity(testSkeleton);

        // make them fight
        System.out.println(testLocation.getDescription());
        System.out.println(" ");
        while (testSkeleton.isAlive() && (testBerserker.isAlive() && testKnight.isAlive() && testArcher.isAlive())){
            switch (Mechanics.rollDice(3, 0)) {
                case 1:
                    testSkeleton.attack(testArcher);
                    break;
                case 2:
                    testSkeleton.attack(testBerserker);
                    break;
                case 3:
                    testSkeleton.attack(testKnight);
                    break;
            }
            testArcher.attack(testSkeleton);
            testBerserker.attack(testSkeleton);
            testKnight.attack(testSkeleton);
            System.out.println("Archer health: " +testArcher.getCurrentHitPoints());
            System.out.println("Berserker health: " +testBerserker.getCurrentHitPoints());
            System.out.println("Knight health: " +testKnight.getCurrentHitPoints());
            System.out.println("Skeleton health: " +testSkeleton.getCurrentHitPoints());
        }

    }
}