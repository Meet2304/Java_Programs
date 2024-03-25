package SEM_3_LABFILE.UNIT_3.Que15_BinarySearchException;
import java.util.Arrays;

class BinarySearchExample {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int key = 25;  //int key = 23;

        try {
            int index = binarySearch(arr, key);
            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found in the array.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: Element not present in the array.");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // If element is not found, instead of returning -1, you can throw ArrayIndexOutOfBoundsException
        throw new ArrayIndexOutOfBoundsException();
    }
}


