package PQTest;

public class PQTestRunner {
     public static void main(String[] args) {
            String [] testCases = {"one two three four five six seven",
                          "1 2 3 4 5 one two three four five",
                          "a p h j e f m c i d k l g n o b"
                         };

            for (String testCase : testCases) {
                   PQTest test = new PQTest(testCase);
                   System.out.println("toString() - " + test);
                   System.out.println("getMin() - " + test.getMin());
                   System.out.println("getNaturalOrder() - " + test.getNaturalOrder() + "\n\n");
            }
     }
}