package Sample.sorting;

public class Sorting {
    static void bubbleSort(int[] array, int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j] and array[j+1]
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            
                if (!swapped) {
                    break;
                }
            }
        }
    }

    static void SelectionSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 36, 25, 12, 22, 11, 90};
        int size = array.length;

        System.out.println("Unsorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        bubbleSort(array, size);
        
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
