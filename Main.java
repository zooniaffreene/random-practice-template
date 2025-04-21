public class Main {
    public static void main(String[] args) {

        // Test individual methods:
        System.out.println("Random 1 - 10: " + Random.random1To10());
        System.out.println("Random 1 to N: "  + Random.random1ToN(50));
        System.out.println("Random X to Y: " + Random.randomXtoY(0,5));

        // Test Suite
        TestSuite.run();
  }
}
