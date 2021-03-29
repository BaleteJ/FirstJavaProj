import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //firstCode();
        //sampleMethod();
        //sampleMethod2();
        //tryingArithmetic();
        //comparisonOperators();
        //operatorAssignment();
        incrementDecrementOperators();
    }

    static void firstCode()
    {
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

    //Trying methods
    static void sampleMethod(){
        System.out.println("This sample method is executed.");
        return;
    }

    static void sampleMethod2(){
        System.out.println();
        int[] numArray = {10, 20, 30, 40};
        byte methodLoop = 0;
        for(methodLoop = 0 ; methodLoop < numArray.length ; methodLoop++)
        {
            System.out.println("numArray[" +  methodLoop + "]: " + numArray[methodLoop] );
        }

        System.out.println("Sample Method 2 is executed");
    }

    static void tryingArithmetic()
    {
        int x = 0; int y = 0;
        int sum; int diff; int product; int div; int mod;
        Scanner getInput = new Scanner(System.in);

        System.out.println("Addition \nInput X:" );
        x = getInput.nextInt();
        System.out.println("Input Y:" );
        y = getInput.nextInt();

        sum = x+y; diff = x-y; product = x*y; div = x/y; mod = x%y;

        System.out.println("Sum: " + sum +
                            "\nDifference: " + diff +
                            "\nProduct: " + product +
                            "\nDiv: " + div +
                            "\nModulo: " + mod);
    }

    static void comparisonOperators()
    {
        int x = 0; int y = 0; int ans = 0;
        Scanner getInput = new Scanner(System.in);

        System.out.println("Addition \nInput X:" );
        x = getInput.nextInt();
        System.out.println("Input Y:" );
        y = getInput.nextInt();

        if(x > y) {
            System.out.println(x + " is greater than " + y);
        }
        if (x < y)
        {
            System.out.println(x + " is lesser than " + y);
        }
        if (x >= y)
        {
            System.out.println(x + " is greater than or equal to " + y);
        }
        if (x <= y)
        {
            System.out.println(x + " is lesser than or equal to " + y);
        }
        if (x == y)
        {
            System.out.println(x + " is equal to " + y);
        }
        if (x != y)
        {
            System.out.println(x + " is NOT equal to " + y);
        }

    }

    static void operatorAssignment()
    {
        //to add codes with var += var2 ...
    }

    static void incrementDecrementOperators()
    {
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
}