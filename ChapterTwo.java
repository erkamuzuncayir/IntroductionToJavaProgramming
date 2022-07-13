public class ChapterTwo {
    public static void main(String[] args) {
        final double PI = 3.14;
        /**Getting input with JOptionPane:
         String JOptionPaneInput = JOptionPane.showInputDialog(null, "Enter a:", "Enter a input!", JOptionPane.QUESTION_MESSAGE);

         Getting input with scanner:
         Scanner scannerGetInput = new Scanner(System.in);
         System.out.print("Enter a: ");
         var scannerInput = scannerGetInput.next();
         */

        /** 2.1
         * Reads Celsius in double value from the console and converts it to Fahrenheit


         Scanner scannerGetInput = new Scanner(System.in);
         System.out.print("Enter a degree in Celsius: ");
         var scannerInput = scannerGetInput.next();
         var celsius = Double.parseDouble(scannerInput);
         double fahrenheit = (9.0 / 5.0 ) * celsius + 32;
         System.out.print(scannerInput + " Celsius is " + fahrenheit + " Fahrenheit");

         ---

         System.out.print("Enter a radius value: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var scannerInputRadius = scannerGetInputOne.next();
         System.out.print("Enter a length value: ");
         Scanner scannerGetInputTwo = new Scanner(System.in);
         var scannerInputLength = scannerGetInputTwo.next();
         double radius = Double.parseDouble(scannerInputRadius);
         double length = Double.parseDouble(scannerInputLength);
         double area = Math.pow(radius,2)*PI;
         double volume = area * length;

         System.out.println("The area is: " + area);
         System.out.println("The volume is: " + volume);

         ---

         System.out.print("Enter a feet value: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var scannerInputOne = scannerGetInputOne.next();
         double feet = Double.parseDouble(scannerInputOne);
         double meter = feet * 0.305;
         System.out.println(feet + " feet is " + meter);

         ---

         System.out.print("Enter a pound value: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var scannerInputOne = scannerGetInputOne.next();
         double pound = Double.parseDouble(scannerInputOne);
         double kilogram = pound * 0.454;
         System.out.println(pound + " pound is " + kilogram);

         ---


         System.out.print("Enter the subtotal and a gratuity rate: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var scannerInputOne = scannerGetInputOne.nextDouble();
         var scannerInputTwo = scannerGetInputOne.nextDouble();

         double gratuity = (scannerInputOne * scannerInputTwo) / 100;
         double total = scannerInputOne + gratuity;

         System.out.println("The gratuity is " + gratuity + " and total is " + total);

         ---

         System.out.print("Enter a number between 0 and 1000: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var scannerInputOne = scannerGetInputOne.nextInt();
         var firstDigit = scannerInputOne % 10;
         var secondDigit = (scannerInputOne / 10) % 10;
         var thirdDigit = (scannerInputOne / 100) % 10;
         var result = thirdDigit + secondDigit + firstDigit;

         System.out.println("The sum of the digits is :" + result);

         ---

         System.out.print("Enter the desired minutes to convert to years and days: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var scannerInputOne = scannerGetInputOne.nextLong();

         var totalHours = scannerInputOne / 60;
         var totalDays = totalHours / 24;
         var calculatedYears = totalDays / 365;
         var calculatedDays = totalDays % 365;

         System.out.println(scannerInputOne + " minutes is approximately " + calculatedYears + " years and " + calculatedDays + " days");

         ---

         System.out.print("Enter an ASCII code: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var scannerInputOne = scannerGetInputOne.nextInt();
         char result = (char)scannerInputOne;

         System.out.println("The sum of the digits is :" + result);

         ---

         System.out.print("Enter desired amount of money with last digits represent the cents: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var scannerInputOne = scannerGetInputOne.nextInt();
         var centDigitOne = scannerInputOne % 10;
         var centDigitTwo = (scannerInputOne / 10) % 10;
         var cents = centDigitOne + (centDigitTwo * 10);
         var dollars = (scannerInputOne - cents) / 100;

         System.out.println("The amount of money is " + dollars + " dollars and " + cents + " cents.");

         ---

         String JOptionPaneInput = JOptionPane.showInputDialog(null, "Enter desired amount of money with last digits represent the cents: ", "Enter a input!", JOptionPane.QUESTION_MESSAGE);
         var input = Integer.parseInt(JOptionPaneInput);
         var centDigitOne = input % 10;
         var centDigitTwo = (input / 10) % 10;
         var cents = centDigitOne + (centDigitTwo * 10);
         var dollars = (input - cents) / 100;

         JOptionPane.showMessageDialog(null, "The amount of money is " + dollars + " dollars and " + cents + " cents.");

         ---

         System.out.print("Enter employee's name: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var name = scannerGetInputOne.next();
         System.out.print("Enter number of hours worked in a week: ");
         Scanner scannerGetInputTwo = new Scanner(System.in);
         var workHours = scannerGetInputTwo.nextDouble();
         System.out.print("Enter hourly pay rate: ");
         Scanner scannerGetInputThree = new Scanner(System.in);
         var hourlyPayRate = scannerGetInputThree.nextDouble();
         System.out.print("Enter federal tax withholding rate: ");
         Scanner scannerGetInputFour = new Scanner(System.in);
         var fedTaxWithholdingRate = scannerGetInputFour.nextDouble();
         System.out.print("Enter state tax withholding rate: ");
         Scanner scannerGetInputFive = new Scanner(System.in);
         var stateTaxWithholdingRate = scannerGetInputFive.nextDouble();

         System.out.println("Employee Name: " + name);
         System.out.println("Hours Worked: " + workHours);
         System.out.println("Pay Rate: " + hourlyPayRate);
         var grossPay = hourlyPayRate * workHours;
         System.out.println("Gross Pay: " + grossPay);

         System.out.println("Deductions:");
         var federalWithholding = (grossPay * fedTaxWithholdingRate) /100;
         System.out.println("\t Federal Withholding (" + fedTaxWithholdingRate + "%): $" + federalWithholding);
         var stateWithholding = (grossPay * stateTaxWithholdingRate) /100;
         System.out.println("\t State Withholding (" + stateTaxWithholdingRate + "%): $" + stateWithholding);
         var totalDeductions = federalWithholding + stateWithholding;
         System.out.println("\t Total Deduction: " + totalDeductions);
         var netPay = grossPay - totalDeductions;
         System.out.println("Net Pay: " + netPay);

         ---

         System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var balance = scannerGetInputOne.nextDouble();
         var interestRate = scannerGetInputOne.nextDouble();

         var interest = balance * (interestRate / 1200);

         System.out.println("The interest is: " + interest);

         ---

         System.out.println("Enter investment amount: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var investmentAmount = scannerGetInputOne.nextInt();
         System.out.println("Enter monthly interest rate: ");
         Scanner scannerGetInputTwo = new Scanner(System.in);
         var interestRate = scannerGetInputTwo.nextDouble();
         System.out.println("Enter number of years: ");
         Scanner scannerGetInputThree = new Scanner(System.in);
         var years = scannerGetInputThree.nextInt();

         var futureInvestmentValue = (investmentAmount * Math.pow((1 + interestRate), (years * 12)));
         System.out.println("Accumulated value is: " + (float)futureInvestmentValue);

         ---

         System.out.println("Enter weight in pounds: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var weight = scannerGetInputOne.nextDouble();
         System.out.println("Enter height in inches: ");
         Scanner scannerGetInputTwo = new Scanner(System.in);
         var height = scannerGetInputOne.nextDouble();

         var BMI = (weight * 0.45359237) / Math.pow((height * 0.0254), 2);

         System.out.println("BMI is: " + BMI);

         ---

         System.out.println("Enter investment amount: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var investmentAmount = scannerGetInputOne.nextInt();
         System.out.println("Enter monthly interest rate: ");
         Scanner scannerGetInputTwo = new Scanner(System.in);
         var interestRate = scannerGetInputTwo.nextDouble();
         System.out.println("Enter number of months: ");
         Scanner scannerGetInputThree = new Scanner(System.in);
         var months = scannerGetInputThree.nextInt();

         int checker = 0;
         double compoundValue = 0;
         while (checker < months) {
         compoundValue = (investmentAmount + compoundValue) * (1 + interestRate / 12);
         checker++;
         System.out.println(checker);
         }
         System.out.println("Compound value is: " + compoundValue);

         ---

         System.out.println("Enter the amount of water in kilogram: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var amountOfWater = scannerGetInputOne.nextDouble();
         System.out.println("Enter the initial temperature: ");
         Scanner scannerGetInputTwo = new Scanner(System.in);
         var initialTemperature = scannerGetInputTwo.nextDouble();
         System.out.println("Enter the final temperature: ");
         Scanner scannerGetInputThree = new Scanner(System.in);
         var finalTemperature = scannerGetInputThree.nextDouble();

         var neededEnergy = amountOfWater * (finalTemperature - initialTemperature) * 4184;

         System.out.println("The energy needed is: " + neededEnergy);

         ---

         System.out.println("Enter the temperature in Fahrenheit: ");
         Scanner scannerGetInputOne = new Scanner(System.in);
         var temperature = scannerGetInputOne.nextDouble();
         System.out.println("Enter the wind speed miles per hour: ");
         Scanner scannerGetInputTwo = new Scanner(System.in);
         var windSpeed = scannerGetInputTwo.nextDouble();

         var windChillIndex = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));

         System.out.println("The wind chill index is: " + windChillIndex);

         ---

        var a = 1;
        var b = 2;
        System.out.println("a   b   pow(a, b)");
        System.out.println(a + "   " + b + "   " + (int) Math.pow(a, b));
        a++;
        b++;
        System.out.println(a + "   " + b + "   " + (int) Math.pow(a, b));
        a++;
        b++;
        System.out.println(a + "   " + b + "   " + (int) Math.pow(a, b));
        a++;
        b++;
        System.out.println(a + "   " + b + "   " + (int) Math.pow(a, b));
        a++;
        b++;
        System.out.println(a + "   " + b + "   " + (int) Math.pow(a, b));

        ---

        long randomLongNumber = System.currentTimeMillis();
        int randomNumber = (int) (randomLongNumber % 26) + 65;
        char randomChar = (char) randomNumber;
        System.out.println(randomChar);

         */


    }
}
