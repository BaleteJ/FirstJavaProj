public class Main {
    public static void main(String[] args){
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
                " Byte: " + byteData + " Float: " + floatData +" Double: " + doubleData +
                " Boolean: " + booleanData + " Char: " + charData);
        //Non Primitive


        //If statement
        if(booleanData)
        {
            System.out.println("Statement true and display long: "+largeDecimalNumbers);
        }

        //Switch Statement

        switch (smallDecimalNumbers){
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Day not found");
                break;
        }

        //for loops
        for(byte loop = 0; loop <= 9 ; loop++)
        {
            System.out.println("Loop value: " + loop);
        }
        System.out.println("Done with for loop");

        //while
        byte whileLoop = 0;
        while(whileLoop != 5)
        {
            System.out.print("Loop " + whileLoop + " ");
            whileLoop++;
        }

        //do..while
    }
}