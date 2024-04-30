package org.assesment.answer;

import java.util.stream.IntStream;

public class CharacterPyramid {
    public static void main(String[] args) {
        int rows = 5;
        char character = '+';

        IntStream.range(0, rows).forEach(row -> {
            IntStream.range(0, rows - row - 1).forEach(i -> System.out.print(" "));
            IntStream.range(0, 2 * row + 1).forEach(i -> System.out.print(character));
            System.out.println();
        });
    }
}
