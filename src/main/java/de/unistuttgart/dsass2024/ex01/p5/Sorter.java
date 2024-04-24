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
        int currentIndex = 0;

        for (int i = currentIndex; i < list.getSize(); i++) {
            int indexGap= 1;
            int frontier = currentIndex;

            for (int j = frontier + indexGap ; j < list.getSize(); j++) {
                if(list.getElement(frontier).compareTo(list.getElement(j))>0){
                    indexGap++;
                } else {
                    frontier = j;
                }
            }

            list.swapElements(currentIndex,frontier);
            currentIndex++;
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