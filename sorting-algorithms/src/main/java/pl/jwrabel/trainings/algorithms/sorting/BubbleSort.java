package pl.jwrabel.trainings.algorithms.sorting;

import java.util.Arrays;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class BubbleSort implements SortingAlgorithm {
    public static void swap(int[] array, int x, int y) {
        int pom;
        pom = array[x];
        array[x] = array[y];
        array[y] = pom;
    }

    public int[] sort(int[] data) {
        int x=1;
        while(x>0) {
            x=0;
            for (int j = 0; j < data.length-1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                    x++;
                }
            }
        }return data;
    }
        @Override
        public String toString () {
            return "Bubble sort";
        }
    }
