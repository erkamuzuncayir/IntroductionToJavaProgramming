public class ChapterOne {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");

        System.out.println("----------------------");

        for (int i = 0; i< 5; i++)
        {
            System.out.println("Welcome to Java");
        }

        System.out.println("----------------------");

        System.out.println("   J     A   V     V    A");
        System.out.println("   J    A A   V   V    A A");
        System.out.println("J  J   AAAAA   V V    AAAAA");
        System.out.println(" JJ   A     A   V    A     A");

        System.out.println("----------------------");

        int tableRow = 0;
        while (tableRow < 5)
        {
            switch (tableRow)
            {
                case 0:
                    System.out.println("a   a^2   a^3");
                    tableRow++;
                    break;
                case 1:
                    System.out.println("1    1    1");
                    tableRow++;
                    break;
                case 2:
                    System.out.println("2    4    8");
                    tableRow++;
                    break;
                case 3:
                    System.out.println("3    9    27");
                    tableRow++;
                    break;
                case 4:
                    System.out.println("4    16   64");
                    tableRow++;
                    break;
            }
        }

        System.out.println("----------------------");

        double resultOfExpression = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
        System.out.println("Result of (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5) is: " +
resultOfExpression);

        System.out.println("----------------------");

        int summationOfSeries = 0;
        for(int j = 0; j < 10; j++)
        {
            summationOfSeries += j;
        }
        System.out.println(summationOfSeries);

        System.out.println("----------------------");

        double positives = 0;
        for (int k = 1; k < 14; k = k + 4)
        {
            positives += 1.0/k;
            System.out.println(positives);

        }
        double negatives = 0;
        for (int l = 3; l < 12; l = l + 4)
        {
            negatives += 1.0/l;

        }
        double sumOfPi = 4 * (positives - negatives);
        System.out.println("Approximating Pi is : " + sumOfPi);
    }
}
