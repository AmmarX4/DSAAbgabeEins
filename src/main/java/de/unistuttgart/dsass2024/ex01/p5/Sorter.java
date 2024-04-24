package de.unistuttgart.dsass2024.ex01.p5;

import com.sun.security.jgss.InquireType;

public class Sorter {

    /**
     * Performs selection sort on provided list, works directly on list object,
     * hence no return value
     *
     * @param <T>  The type of list element
     * @param list List to apply the sorting to; unsorted list at first, sorted list
     *             in the end
     */
    public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {

        //Outer Loop that compares every Element with the first one on the unsorted sublist
        for (int i = 0; i < list.getSize() - 1; i++) { // no need to go to the end of the list because the last element will be automatically sorted
            T biggestElem = list.getElement(i); // assume the first element is the biggest
            int indexOfBiggestElem = i; // we need this variable so we can swap the elements at the end, we need to memorise the index

            // this loop iterates over the unsorted sublist
            for (int j = i + 1; j < list.getSize(); j++) {
                if (list.getElement(j).compareTo(biggestElem) > 0) { //compareTo() is greater than 0 if the first is greater than the second
                    biggestElem = list.getElement(j); //Set the biggest element to the current one in this loop
                    indexOfBiggestElem = j; //update the index of the biggest element
                }
            }
            list.swapElements(i, indexOfBiggestElem); // Swap the positions of the first element in the unsorted sublist with the biggest elem found
        }
    }


    /**
     * Performs insertion sort on provided list, works directly on list object,
     * hence no return value
     *
     * @param <T>  The type of list element
     * @param list List to apply the sorting to; unsorted list at first, sorted list
     *             in the end
     */
    public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {

    }

    /**
     * Performs bubble sort on provided list, works directly on list object, hence
     * no return value
     *
     * @param <T>  The type of list element
     * @param list List to apply the sorting to; unsorted list at first, sorted list
     *             in the end
     */
    public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {

    }
}