import java.util.Random;
public abstract class Mechanics {
        public static int rollDice(int size, int bonus) {
            if (size != 2 && size != 3 && size != 4 && size != 6 && size != 8 && size != 10 && size != 12 && size != 20) {
                throw new IllegalArgumentException("Invalid die size. Supported sizes are 4, 6, 8, 10, 12, and 20.");
            }

            Random random = new Random();
            int result = random.nextInt(size) + 1; // Generate a random number between 1 and the size of the die
            result += bonus; // Add the bonus to the result

            return result;
        }
        public static boolean contestedRoll(int dieSize, int bonus1, int bonus2){
            int result1 = rollDice(dieSize, bonus1);
            result1 += bonus1;
            int result2 = rollDice(dieSize, bonus2);
            result2 += bonus2;
            return result1 >= result2;
        }
        public static boolean check(int difficulty, int bonus){
            int result = rollDice(20, bonus);
            return result >= difficulty;
        }
    }


