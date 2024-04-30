package org.assesment.answer;

import java.util.Arrays;

public class ElementLength {
    public static void main(String[] args) {
        int[] inputArray = {5, 9, 2, 1, 7, 3, 0, 1, 7, 5, 3, 8, 11, 10};

        long count = Arrays.stream(inputArray).count();
        System.out.println("Jumlah elemen: " + count);
    }
}
