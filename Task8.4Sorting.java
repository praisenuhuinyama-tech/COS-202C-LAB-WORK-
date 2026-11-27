//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 8 
/*
 * Task 8.4: Sorting. Implement bubble sort and selection sort. 
 * Test with sorted, reversed and random data. Compare with Arrays.sort.
 */

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void testDataset(String label, int[] baseData) {
        int[] bubbleArr = Arrays.copyOf(baseData, baseData.length);
        int[] selectionArr = Arrays.copyOf(baseData, baseData.length);
        int[] javaSortArr = Arrays.copyOf(baseData, baseData.length);

        long start = System.nanoTime();
        bubbleSort(bubbleArr);
        long bubbleTime = System.nanoTime() - start;

        start = System.nanoTime();
        selectionSort(selectionArr);
        long selectionTime = System.nanoTime() - start;

        start = System.nanoTime();
        Arrays.sort(javaSortArr);
        long javaSortTime = System.nanoTime() - start;

        System.out.println("=== " + label + " Data (n=" + baseData.length + ") ===");
        System.out.printf("Bubble Sort:    %,d ns | Matches Arrays.sort: %b%n", bubbleTime, Arrays.equals(bubbleArr, javaSortArr));
        System.out.printf("Selection Sort: %,d ns | Matches Arrays.sort: %b%n", selectionTime, Arrays.equals(selectionArr, javaSortArr));
        System.out.printf("Arrays.sort:    %,d ns%n%n", javaSortTime);
    }

    public static void main(String[] args) {
        int size = 1000;
        int[] sorted = new int[size];
        int[] reversed = new int[size];
        int[] random = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            sorted[i] = i;
            reversed[i] = size - i;
            random[i] = rand.nextInt(10000);
        }

        testDataset("Sorted", sorted);
        testDataset("Reversed", reversed);
        testDataset("Random", random);
    }
}
