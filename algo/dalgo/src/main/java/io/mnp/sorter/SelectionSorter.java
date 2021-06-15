package io.mnp.sorter;

public class SelectionSorter extends AbstractSorting {


    @Override
    public void sort(Comparable[] arr, int arrSize) {
        int minId;
        for (int i = 0; i < arr.length; i++) {
            minId = findMinPos(arr, i, arrSize - 1);
            Comparable temp = arr[i];
            arr[i] = arr[minId];
            arr[minId] = temp;
        }
    }
}
