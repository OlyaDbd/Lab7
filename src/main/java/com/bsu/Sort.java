package com.bsu;

import java.util.Comparator;
import java.util.List;

public class Sort implements Runnable {
    int sortType;
    List<Integer> array;

    Sort(List<Integer> array, int sortType) {
        this.sortType = sortType;
        this.array = array;
    }

    @Override
    public void run() {
        switch (sortType) {
            case 1 -> array.sort(Integer::compareTo);
            case 2 -> array.sort(Comparator.reverseOrder());
            case 3 -> array.sort(Comparator.comparingInt(x -> x.toString().length()));
            case 4 -> array.sort(Comparator.comparingInt(x -> x.toString().length()).reversed());
        }
    }
}
