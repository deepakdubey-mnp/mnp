package io.mnp.sorter;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class AbstractSorting<T extends Comparable> {

    public abstract void sort(T[] arr, int arrSize);

    public Integer findMinPos(T[] arr, int start, int end) {
        T min;
        if (start < 0 || start > end || end >= arr.length) {
            return null;
        } else {
            int minPos = start;
            for (int i = start + 1; i <= end; i++) {
                if (arr[minPos].compareTo(arr[i]) > 0) {
                    minPos = i;
                }
            }
            return minPos;
        }
    }

    public Integer findMaxPos(T[] arr, int start, int end) {
        T min;
        if (start < 0 || start > end || end >= arr.length) {
            return null;
        } else {
            int maxPos = start;
            for (int i = start + 1; i <= end; i++) {
                if (arr[maxPos].compareTo(arr[i]) < 0) {
                    maxPos = i;
                }
            }
            return maxPos;
        }
    }

    public void print(T[] arr) {
        System.out.println(Arrays.stream(arr).map(t -> t.toString()).collect(Collectors.joining("-->")));
    }
}
