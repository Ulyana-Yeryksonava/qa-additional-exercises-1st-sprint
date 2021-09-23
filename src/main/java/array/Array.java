package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array? e.g. 5");
        // There's no check for negative array length
        int arrayLength = scanner.nextInt();

        int[] myArray = new int[arrayLength];
        int counter = 0;
        while (counter < myArray.length){
            myArray[counter] = randomInt(100);
            counter++;
        }

        // 1.
        System.out.println("Array elements (first->last):");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%d ", myArray[i]);
        }

        System.out.println("\nArray elements (last->first):");
        for (int i = myArray.length-1; i >= 0; i--) {
            System.out.printf("%d ", myArray[i]);
        }

        // 2.
        System.out.print("\nElements equals to zero: ");
        int elementsEqualZeroCounter = 0;
        for (int i : myArray) {
            if (i == 0) {
                System.out.printf("%d ", i);
                elementsEqualZeroCounter ++;
            }
        }
        if (elementsEqualZeroCounter == 0) {
            System.out.print("absent");
        }

        // 3.
        System.out.print("\nIndex of elements equals to zero: ");
        int indexOfElement = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                System.out.printf("%d ", myArray[i]);
                indexOfElement = i;
            }
        }
        if (indexOfElement < 0) {
            System.out.print("none");
        }


        // 4.
        System.out.println("\nArray with swapped i-(i+1) elements:");
        for (int i = 0; i < myArray.length-1; i+=2) {
            swap(i, i+1, myArray);
        }
        printArrayElements(myArray);

        // 5.
        System.out.println("Array with swapped i-(length-1-i) elements:");
        for (int i = 0; i < myArray.length-1; i++) {
            swap(i, myArray.length-1-i, myArray);
        }
        printArrayElements(myArray);

        // 6.
        int minElement = myArray[0];
        int maxElement = myArray[0];
        for (int i = 1; i < myArray.length-1; i++) {
            if (myArray[i] < minElement) {
                minElement = myArray[i];
            }
            if (myArray[i] > maxElement){
                maxElement = myArray[i];
            }
        }
        System.out.printf("The min element: %d\n", minElement);
        System.out.printf("The max element: %d\n", maxElement);

        // 7.
        boolean isIncreasingArray = true;
        for (int i = 0; i < myArray.length-2; i++) {
            if (myArray[i] > myArray[i+1]) {
                isIncreasingArray = false;
                break;
            }
        }
        String order = isIncreasingArray ? " increasing" : "n't increasing";
        System.out.printf("The array is%s", order);

        // 8.
        System.out.println("\nArray with swapped i-(i+2) elements:");
        for (int i = 0; i < myArray.length-2; i++) {
            swap(i, i+2, myArray);
        }
        printArrayElements(myArray);

        // Additional exercises:

        // 1.
        System.out.println("Additional exercises:");
        int[][] myTwoDimensionalArray = new int[arrayLength][arrayLength];
        for (int i = 0; i < myTwoDimensionalArray.length; i++) {
            for (int j = 0; j < myTwoDimensionalArray[i].length; j++) {
               myTwoDimensionalArray[i][j] = randomInt(100);
            }
        }

        int minElementTwoDimensional = myTwoDimensionalArray[0][0];
        int maxElementTwoDimensional = myTwoDimensionalArray[0][0];

        System.out.println("Two dimensional array elements (first-last):");
        for (int i = 0; i < myTwoDimensionalArray.length; i++) {
            printArrayElements(myTwoDimensionalArray[i]);

            for (int j = 0; j < myTwoDimensionalArray[i].length; j++) {
                int arrayItem = myTwoDimensionalArray[i][j];
                // Find min element:
                if (minElementTwoDimensional > arrayItem) {
                    minElementTwoDimensional = arrayItem;
                }
                // Find max element:
                if (maxElementTwoDimensional < arrayItem) {
                    maxElementTwoDimensional = arrayItem;
                }
            }
        }

        System.out.println("Two dimensional array elements (last-first):");
        for (int i =  myTwoDimensionalArray.length-1; i >= 0; i--) {
            printArrayElements(myTwoDimensionalArray[i], myTwoDimensionalArray[i].length-1, 0);
        }

        System.out.printf("The min element: %d\n", minElementTwoDimensional);
        System.out.printf("The max element: %d\n", maxElementTwoDimensional);

        // 2.
        ArrayList<Integer> myArrayList = new ArrayList<>();
        int arrayListCapacity = 5;
        for (int i = 0; i < arrayListCapacity; i++) {
            myArrayList.add(randomInt(100));
        }

        System.out.println("The array list elements: ");
        for (int i : myArrayList) {
            System.out.printf("%d ", i);
            myArrayList.set(myArrayList.indexOf(i), (i + randomInt(100)));
            myArrayList.remove((Integer) i);
        }

        myArrayList.clear();
        if (myArrayList.isEmpty()) {
            System.out.println("\nAll items were deleted");
        }
    }

    // Methods for more DRY code:
    public static void swap(int i, int j, int[] array) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void printArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void printArrayElements(int[] array, int startIndex, int endIndex) {
        for (int i = startIndex; i >= endIndex; i--) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static int randomInt(int range) {
        return (int) (Math.random()*range);
    }
}
