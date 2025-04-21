
public class TestSuite
{
    public static void run()
    {
        boolean pass = true;

        pass &= basicTest("1to10", 1, 10, 10);
        pass &= basicTest("1toN", 1, 100, 100);

        pass &= basicTest("XtoY", 5, 50, 1000);

        int min = Random.getRandom("1toN", 1, 10);
        int max = Random.getRandom("1toN", 1, 70) + 10;
        pass &= basicTest("XtoY", min, max, 10000);

        if (pass == true)
        {
            System.out.println("--- TEST PASSED! Congrats! ---");
        }
        else
        {
            System.out.println("--- TEST FAILED! :( ---");
        }
    }


    public static boolean basicTest(String type, int x, int y, int c)
    {
        System.out.println("Test for: " + type + " C: " + c + " X: " + x + " Y: " + y);
        int a = 0;
        int count = 0;
        double average = 0.0;

        for (int i=0; i<c; i++)
        {
            a = Random.getRandom(type, x, y);
            if ((a < x) || (a > y))
            {
                System.out.println("Error: " + a + " is out of bounds (min: " + x + " max: " + y + ").");
                return false;
            }
            count++;
            average += a;
        }

        if (count < c)
        {
            return false;
        }
        average /= count;

        System.out.println("PASS - Result: " + average);

        return true;
    }

}
