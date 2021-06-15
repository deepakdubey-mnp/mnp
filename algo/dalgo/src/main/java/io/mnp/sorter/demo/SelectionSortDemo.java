package io.mnp.sorter.demo;

import io.mnp.sorter.SelectionSorter;

import java.util.Random;
import java.util.stream.IntStream;

public class SelectionSortDemo {


    public static void main(String[] args) {
        SelectionSorter selectionSorter= new SelectionSorter();
        Integer[]arr =new Integer[5];
        Random random= new Random();
        IntStream.range(0,5).forEach(i->arr[i]=random.nextInt());
        selectionSorter.sort(arr, arr.length);
        selectionSorter.print(arr);
    }
}
