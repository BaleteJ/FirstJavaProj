import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //firstCode();
        //sampleMethod();
        //sampleMethod2();
        //tryingArithmetic();
        //comparisonOperators();
        //operatorAssignment();
        //incrementDecrementOperators();
        //testingNestedLoops();
        //testingTypeCasting();
        //jadenCaseKyu();       // to do
        //conditionalStatements();
        //loopStatements();
        loopExercise();
        check();
    }

    static void firstCode() {
        //Primitive
        int wholeNumbers = 122;
        long largeDecimalNumbers = -12;
        short smallDecimalNumbers = 12;
        byte byteData = 120;
        float floatData = 12.3f;
        double doubleData = 45.5672;
        boolean booleanData = true;
        char charData = 'd';

        //Print all primitive types, output and run
        System.out.println("Int: " + wholeNumbers + " Long: " + largeDecimalNumbers + " Short: " + smallDecimalNumbers +
                " Byte: " + byteData + " Float: " + floatData + " Double: " + doubleData +
                " Boolean: " + booleanData + " Char: " + charData);
        //Non Primitive


        //If statement
        if (booleanData) {
            System.out.println("Statement true and display long: " + largeDecimalNumbers);
        }

        //Switch Statement

        switch (smallDecimalNumbers) {
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Day not found");
                break;
        }

        //for loops
        for (byte loop = 0; loop <= 9; loop++) {
            System.out.println("Loop value: " + loop);
        }
        System.out.println("Done with for loop");

        //while
        byte whileLoop = 0;
        while (whileLoop != 5) {
            System.out.print("While Loop " + whileLoop + " ");
            whileLoop++;
        }

        //do..while
        System.out.println();
        byte doWhileLoop = 0;
        do {
            System.out.print("Do While Loop: " + doWhileLoop + " ");
            doWhileLoop++;
        }
        while (doWhileLoop != 2);
        System.out.println();
        System.out.println("==============================================");

        //Trying arrays
        String[] cars = {"Volvo", "Nissan", "Ford"};
        byte stringLoop = 0;
        while (stringLoop < cars.length) {
            System.out.println(cars[stringLoop]);
            stringLoop++;
        }
    }

    static void sampleMethod() {
        System.out.println("This sample method is executed.");
        return;
    }

    static void sampleMethod2() {
        System.out.println();
        int[] numArray = {10, 20, 30, 40};
        byte methodLoop = 0;
        for (methodLoop = 0; methodLoop < numArray.length; methodLoop++) {
            System.out.println("numArray[" + methodLoop + "]: " + numArray[methodLoop]);
        }

        System.out.println("Sample Method 2 is executed");
    }

    static void tryingArithmetic() {
        int x = 0;
        int y = 0;
        int sum;
        int diff;
        int product;
        int div;
        int mod;
        Scanner getInput = new Scanner(System.in);

        System.out.println("Addition \nInput X:");
        x = getInput.nextInt();
        System.out.println("Input Y:");
        y = getInput.nextInt();

        sum = x + y;
        diff = x - y;
        product = x * y;
        div = x / y;
        mod = x % y;

        System.out.println("Sum: " + sum +
                "\nDifference: " + diff +
                "\nProduct: " + product +
                "\nDiv: " + div +
                "\nModulo: " + mod);
    }

    static void comparisonOperators() {
        int x = 0;
        int y = 0;
        int ans = 0;
        Scanner getInput = new Scanner(System.in);

        System.out.println("Addition \nInput X:");
        x = getInput.nextInt();
        System.out.println("Input Y:");
        y = getInput.nextInt();

        if (x > y) {
            System.out.println(x + " is greater than " + y);
        }
        if (x < y) {
            System.out.println(x + " is lesser than " + y);
        }
        if (x >= y) {
            System.out.println(x + " is greater than or equal to " + y);
        }
        if (x <= y) {
            System.out.println(x + " is lesser than or equal to " + y);
        }
        if (x == y) {
            System.out.println(x + " is equal to " + y);
        }
        if (x != y) {
            System.out.println(x + " is NOT equal to " + y);
        }

    }

    static void operatorAssignment() {
        //to add codes with var += var2 ...
    }

    static void incrementDecrementOperators() {
        int numberApples = 5;
        numberApples++;

        int numberOranges = 5;
        numberOranges--;

        System.out.println("numberApples: " + numberApples + "\nnumberOranges: " + numberOranges);

        int incrementOperatorA = 5;
        int incrementOperatorB = 3;

        int incrementOperatorC = incrementOperatorA * incrementOperatorB++;
        System.out.println(incrementOperatorC);
        System.out.println(incrementOperatorB);

        int incrementOperatorD = incrementOperatorA * --incrementOperatorB;
        System.out.println(incrementOperatorD);
        System.out.println(incrementOperatorB);

    }

    static void testingNestedLoops() {
        //int loop;
        char draw = '0';
        char undraw = ' ';
        byte inputRows = 0;
        byte inputColumns = 0;

        Scanner getInput = new Scanner(System.in);
        System.out.println("Input how many rows: ");
        inputRows = getInput.nextByte();
        System.out.println("Input how many columns: ");
        inputColumns = getInput.nextByte();


        for (int loop1 = 0; loop1 < inputRows; loop1++) {
            for (int loop2 = 0; loop2 < inputColumns; loop2++) {
                if (loop1 == 0 || loop1 == (inputRows - 1)) {
                    System.out.print(draw);
                } else {
                    if (loop2 == 0 || loop2 == (inputColumns - 1)) {
                        System.out.print(draw);
                    } else {
                        System.out.print(undraw);
                    }
                }

            }
            System.out.print("\n");
        }
    }

    static void testingTypeCasting() {
        byte number1 = 5;

        //Widening casting
        // byte => short => char => int => long => float => double
        short myShort = 9;
        double myDouble = myShort;

        System.out.println(myShort);
        System.out.println(myDouble);

        //Narrowing casting
        // byte <= short <= char <= int <= long <= float <= double
        double mySecondDouble = 9.78;
        short mySecondShort = (short) mySecondDouble;

        System.out.println(mySecondDouble);
        System.out.println(mySecondShort);

    }

    static void jadenCaseKyu() {
        String jadenTweet = "How can mirrors be real if our eyes aren't real";
        char[] sortTweet = jadenTweet.toCharArray();
        char[] jadenCaseArray = sortTweet;
        String jadenCaseString = "";
        boolean spaceFlag = false;


        for (byte loop = 0; loop < sortTweet.length; loop++) {
            if (loop == 0) {
                jadenCaseArray[loop] = sortTweet[loop];
            } else {
                if (sortTweet[loop] == ' ') {
                    spaceFlag = true;
                }
            }

            if (spaceFlag) {
                jadenCaseArray[loop] = Character.toUpperCase(sortTweet[loop]);
                spaceFlag = false;
            } else {
                jadenCaseArray[loop] = sortTweet[loop];
            }

        }

        System.out.println(jadenCaseArray);
    }

    static void conditionalStatements() {
        //If statement

        if (20 > 18) {
            System.out.println("20 is grater than 18");
        } else {
            // conditions here
            System.out.println("Statement..");
        }

        //ternary operator
        int time = 18;

        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        //Switch

        byte num = 0;
        System.out.println("Enter a number from 1-7: ");
        Scanner getDay = new Scanner(System.in);
        num = getDay.nextByte();

        switch (num) {
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            case 7:
                System.out.println("The day is Sunday");
                break;
            default:
                System.out.println("Number is invalid");
                break;
        }

        if (num == 1) {
            System.out.println("The day is Monday");
        } else if (num == 2) {
            System.out.println("The day is Tuesday");
        } else if (num == 3) {
            System.out.println("The day is Wednesday");
        } else if (num == 4) {
            System.out.println("The day is Thursday");
        } else if (num == 5) {
            System.out.println("The day is Friday");
        } else if (num == 6) {
            System.out.println("The day is Saturday");
        } else if (num == 7) {
            System.out.println("The day is Sunday");
        } else {
            System.out.println("Number is invalid");
        }

    }

    static void loopStatements() {
        //While loop

        byte whileLoop = 0;
        while (whileLoop != 10) {
            System.out.print("While Loop " + whileLoop + " ");
            whileLoop++;
        }
    }

    static void loopExercise() {


        //====================================================

        byte n = 11;
        byte loop = 0;

        while (loop < n) {
            System.out.print("[" + ++loop + "] ");
        }

        //====================================================

        byte x = 10;
        byte loop2 = 0;
        int sum = 0;

        while (loop2 < x) {
            sum += ++loop2;
        }

        System.out.println("\n\nSum from 1 to " + x + " is: " + sum);

        //==========================================================

        byte y = 11;
        byte loop3 = -1;

        do {
            System.out.print((++loop3 % 2 == 0) ? loop3 + 2 : " ");
        } while (loop3 < ((y - 1) * 2));

        //==========================================================
        System.out.println("\n");

        byte z = 7;
        int fibCurrent = 1;
        int fibLast = 0;
        int fibSum;

        for (byte loop4 = 0; loop4 < z; loop4++) {
            System.out.print(fibCurrent + " ");

            fibSum = fibCurrent + fibLast;
            fibLast = fibCurrent;
            fibCurrent = fibSum;
        }
    }

    static void check()
    {

    }
}