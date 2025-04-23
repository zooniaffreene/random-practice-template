import java.util.Random;

public class Random {

    // generates a random integer from 1 - 10, inclusive
    public static int random1To10() {
        return (int)(Math.random() * 10) + 1;
    }

    public static int random1ToN(int n) {
        return (int)(Math.random() * n) + 1;
    }

    public static int randomXtoY(int x, int y) {
        return (int)(Math.random() * (y - x + 1)) + x;
    }

    public static int getRandom(String type, int x, int y) {
        if (type.equals("1to10")) {
            return random1To10();
        } else if (type.equals("1toN")) {
            return random1ToN(y);
        } else if (type.equals("XtoY")) {
            return randomXtoY(x, y);
        } else {
            System.out.println("Error! Unknown type.");
        }
        return 0;
    }
}
