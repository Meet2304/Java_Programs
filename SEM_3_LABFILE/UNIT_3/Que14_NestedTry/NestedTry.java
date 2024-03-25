package SEM_3_LABFILE.UNIT_3.Que14_NestedTry;
public class NestedTry {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            int divisor = 0;
            
            try {
                for (int i = 0; i <= numbers.length; i++) {
                    try {
                        int result = numbers[i] / divisor;
                        System.out.println("Result at index " + i + ": " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Inner Catch: Division by zero is not allowed.");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index is out of bounds.");
            }
        } catch (Exception e) {
            System.out.println("Outer Catch: Some exception occurred.");
        }

        System.out.println("Program continues after handling the exceptions.");
    }
}

