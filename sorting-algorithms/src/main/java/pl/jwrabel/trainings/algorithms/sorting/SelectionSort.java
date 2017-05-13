package pl.jwrabel.trainings.algorithms.sorting;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class SelectionSort implements SortingAlgorithm {
    public static void swap(int[] array, int x, int y) {
        int pom;
        pom = array[x];
        array[x] = array[y];
        array[y] = pom;
    }
    public int[] sort(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            int minimally=k;
            for (int i = k + 1; i < data.length; i++) {

                if (data[minimally]> data[i])
                    minimally = i;
            }
            swap(data, k, minimally);
        }
        return data;
    }

    @Override
    public String toString() {
        return "Selection sort";
    }
}
