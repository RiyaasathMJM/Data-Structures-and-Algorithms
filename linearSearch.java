import java.util.*;
public class linearSearch {
    public static int LinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; //index found
            }
        }
        return -1; // index not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int key = 30;

        int result = LinearSearch(numbers, key);

        if (result != -1) {
            System.out.println("Element fount. The  index is : " + result);
        } else {
            System.out.println("Element was not found.");
        }
    }
}
