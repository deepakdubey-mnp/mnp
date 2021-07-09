package io.mnp.sorter;

public class IntegreSelectionSorter implements Sorting<Comparable> {


    @Override
    public void sort(Comparable[] arr, int arrSize) {
        int minId;
        for (var i = 0; i < arr.length; i++) {
            minId = findMinPos(arr, i, arrSize - 1);
            Comparable temp = arr[i];
            arr[i] = arr[minId];
            arr[minId] = temp;
        }
    }
}
