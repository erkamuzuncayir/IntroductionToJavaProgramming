public class ChapterOne {
    public static void main(String[] args) {

        System.out.println("\r");
        System.out.println("Exercise 1");
        /**
         * 1.1 (Display three messages) Write a program that displays Welcome to Java,
         * Welcome to Computer Science, and Programming is fun.
         */
        System.out.println("----------------------");


        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");


        System.out.println("\r");
        System.out.println("Exercise 2");
        /**
         * 1.2 (Display five messages) Write a program that displays Welcome to Java five times
         */
        System.out.println("----------------------");

        for (int i = 0; i< 5; i++)
        {
            System.out.println("Welcome to Java");
        }


        System.out.println("\r");
        System.out.println("Exercise 3");
        /**
         * *1.3 (Display a pattern) Write a program that displays the following pattern:
         * J A V V A
         * J A A V V A A
         * J J AAAAA V V AAAAA
         * J J A A V A A
         */
        System.out.println("----------------------");

        System.out.println("   J     A   V     V    A");
        System.out.println("   J    A A   V   V    A A");
        System.out.println("J  J   AAAAA   V V    AAAAA");
        System.out.println(" JJ   A     A   V    A     A");


        System.out.println("\r");
        System.out.println("Exercise 4");
        /**
         * 1.4 (Print a table) Write a program that displays the following table:
         * a a^2 a^3
         * 1 1 1
         * 2 4 8
         * 3 9 27
         * 4 16 64
         */
        System.out.println("----------------------");

        int tableRow = 0;
        while (tableRow < 5)
        {
            switch (tableRow) {
                case 0 -> {
                    System.out.println("a   a^2   a^3");
                    tableRow++;
                }
                case 1 -> {
                    System.out.println("1    1    1");
                    tableRow++;
                }
                case 2 -> {
                    System.out.println("2    4    8");
                    tableRow++;
                }
                case 3 -> {
                    System.out.println("3    9    27");
                    tableRow++;
                }
                case 4 -> {
                    System.out.println("4    16   64");
                    tableRow++;
                }
            }
        }


        System.out.println("\r");
        System.out.println("Exercise 5");
        /**
         * 1.5 (Compute expressions) Write a program that displays the result of
         * <p>
         * 9.5 * 4.5 - 2.5 * 3
         * 45.5 - 3.5
         */
        System.out.println("----------------------");

        double resultOfExpression = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
        System.out.println("Result of (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5) is: " +
resultOfExpression);


        System.out.println("\r");
        System.out.println("Exercise 6");
        /**
         * 1.6 (Summation of a series) Write a program that displays the result of
         * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.
         */
        System.out.println("----------------------");

        int summationOfSeries = 0;
        for(int j = 0; j < 10; j++)
        {
            summationOfSeries += j;
        }
        System.out.println(summationOfSeries);

        System.out.println("\r");
        System.out.println("Exercise 7");
        /**
         * 1.7 (Approximate &Pi;) &Pi; can be computed using the following formula:
         * Write a program that displays the result of 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13).
         * Use 1.0 instead of 1 in your program.
         */
        System.out.println("----------------------");

        double positives = 0;
        for (int k = 1; k < 14; k = k + 4)
        {
            positives += 1.0/k;
        }
        double negatives = 0;
        for (int l = 3; l < 12; l = l + 4)
        {
            negatives += 1.0/l;

        }
        double sumOfPi = 4 * (positives - negatives);
        System.out.println("Approximating PI is: " + sumOfPi);
    }
}
