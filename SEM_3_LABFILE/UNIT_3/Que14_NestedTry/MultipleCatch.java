package SEM_3_LABFILE.UNIT_3.Que14_NestedTry;

class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            int index = 4;
            int divisor = 0;

            int result = numbers[index] / divisor;

            System.out.println("Result: " + result);
        } 
	catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } 
	catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred: Division by zero is not allowed.");
        } 
	catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }

        System.out.println("Program continues after handling the exception.");
    }
}

