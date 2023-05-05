package com.example.designpatterns.strategy.sorting;

public class Sorter {
    private SortingAlgorithm algorithm;

    public Sorter(SortingAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(SortingAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(int[] arr) {
        algorithm.sort(arr);
    }
}
