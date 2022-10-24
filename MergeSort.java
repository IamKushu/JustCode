import java.util.Arrays;
import java.util.Scanner;
/**
* Java program to implement Binary Search. We have implemented Iterative
* version of Binary Search Algorithm in Java
*
* @author Javin Paul
*/
public class IterativeBinarySearch {

    public static void main(String args[]) {

        int[] list = new int[]{23, 43, 31, 12};
        int number = 12;
        Arrays.sort(list);
        System.out.printf("Binary Search %d in integer array %s %n", number,
                           Arrays.toString(list));
        binarySearch(list, 12);

        System.out.printf("Binary Search %d in integer array %s %n", 43, 
                           Arrays.toString(list));
        binarySearch(list, 43);

        list = new int[]{123, 243, 331, 1298};
        number = 331;
        Arrays.sort(list);
        System.out.printf("Binary Search %d in integer array %s %n", number, 
                           Arrays.toString(list));
        binarySearch(list, 331);

        System.out.printf("Binary Search %d in integer array %s %n", 331, 
                           Arrays.toString(list));
        binarySearch(list, 1333);

        // Using Core Java API and Collection framework
        // Precondition to the Arrays.binarySearch
        Arrays.sort(list);

        // Search an element
        int index = Arrays.binarySearch(list, 3);

    }

    /**
     * Perform a binary Search in Sorted Array in Java
     *
     * @param input
     * @param number
     * @return location of element in array
     */
    public static void binarySearch(int[] input, int number) {
        int first = 0;
        int last = input.length - 1;
        int middle = (first + last) / 2;

        while (first <= last) {
            if (input[middle] &lt; number) {
                first = middle + 1;
            } else if (input[middle] == number) {
                System.out.printf(number + " found at location %d %n", middle);
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first &gt; last) {
            System.out.println(number + " is not present in the list.\n");
        }
    }
}
