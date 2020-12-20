package se.lexicon.asha;

import java.util.Arrays;

public class exercise7 {

    public static void main(String[] args) {
        int[] Array;
        Array = new int[] {1, 2, 4, 7, 9, 12};
        {
            System.out.println("Array: " + Arrays.toString(Array));
            System.out.print("Odd Arrays: ");
        }

        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 != 0) {
                System.out.print(Array[i]+" ");
            }
        }
    }
}
