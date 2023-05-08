package com.example.designpatterns.strategy.sorting;


public class SortingTester {
    public static void main(String[] args) {
        SortingAlgorithm merge = new MergeSortAlgorithm();
        SortingAlgorithm quick = new QuickSortAlgorithm();
        SortingAlgorithm hashMap = new HashMapSortAlgorithm();

        int[] numbers = { };

        Sorter sorter = new Sorter(merge);
        sorter.sort(numbers);
        sorter.setAlgorithm(quick);
        sorter.sort(numbers);
        sorter.setAlgorithm(hashMap);
        sorter.sort(numbers);


    }
}
