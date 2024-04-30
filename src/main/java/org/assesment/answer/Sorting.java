package org.assesment.answer;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {81, -12, 90, 100, 2, 3, -1};
        mergeSort(numbers);
    }

    public static void mergeSort(int[] numbers) {
        System.out.println("Before Sorting");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        numbers = separate(numbers);

        System.out.println("\n\nSorted");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static int[] separate(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }

        int middleNumbers = numbers.length / 2;
        int[] left = new int[middleNumbers];
        int[] right;

        if (numbers.length % 2 == 0) {
            right = new int[middleNumbers];
        } else {
            right = new int[middleNumbers + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = numbers[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = numbers[middleNumbers + i];
        }

        left = separate(left);
        right = separate(right);

        int[] result = new int[numbers.length];
        result = merge(left, right);

        return result;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] mergeResult = new int[left.length + right.length];
        int leftIdx = 0, rightIdx = 0, mergeIdx = 0;

        while (leftIdx < left.length || rightIdx < right.length) {

            if (leftIdx < left.length && rightIdx < right.length) {
                if (left[leftIdx] < right[rightIdx]) {
                    mergeResult[mergeIdx] = left[leftIdx];
                    mergeIdx++;
                    leftIdx++;
                } else {
                    mergeResult[mergeIdx] = right[rightIdx];
                    mergeIdx++;
                    rightIdx++;
                }

            } else if (leftIdx < left.length) {
                mergeResult[mergeIdx] = left[leftIdx];
                mergeIdx++;
                leftIdx++;
            } else if (rightIdx < right.length) {
                mergeResult[mergeIdx] = right[rightIdx];
                mergeIdx++;
                rightIdx++;
            }
        }
        return mergeResult;
    }

//    public static int[] selectionSort(int[] array) {
//        int[] sortedArray = IntStream.range(0, array.length)
//                .map(i -> {
//                    int minIndex = IntStream.range(i, array.length)
//                            .reduce((a, b) -> array[a] < array[b] ? a : b)
//                            .getAsInt();
//                    int temp = array[i];
//                    array[i] = array[minIndex];
//                    array[minIndex] = temp;
//                    return array[i];
//                })
//                .toArray();
//        return sortedArray;
//    }
}
