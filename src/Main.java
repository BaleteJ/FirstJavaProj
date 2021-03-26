public class Main {
    public static void main(String[] args) {
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
        int[] numArray = {10, 20, 30, 40};
        byte stringLoop = 0;
        while (stringLoop < cars.length) {
            System.out.println(cars[stringLoop]);
            stringLoop++;
        }

        sampleMethod();
    }

    //Trying methods
    static void sampleMethod(){
        System.out.println("This sample method is executed.");
        return;
    }
}