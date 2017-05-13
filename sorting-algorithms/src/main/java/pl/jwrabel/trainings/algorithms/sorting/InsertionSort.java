package pl.jwrabel.trainings.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 16.12.2016.
 */
public class InsertionSort implements SortingAlgorithm {


    public static void swap(int[] array, int x, int y) {
        int pom;
        pom = array[x];
        array[x] = array[y];
        array[y] = pom;
    }

    public int[] sort(int[] data) {
        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if (list.get(j) >= data[i]) {
//                    list.add(j, data[i]);
//                    break;
//                } else {
//                    list.add(j - 1, data[i]);
//                    break;
//                }
//
//            }
//
//
//        }

        for (int number:data) {
            if(list.isEmpty()){
                list.add(number);
            }
            else{
                for(int i=0; i<list.size();i++){
                    if(number<=list.get(i)){
                        list.add(i,number);
                        break;
                    }else if(i==list.size()-1){
                        list.add (number);
                        break;
                    }
                }

            }
        }

        for (int i = 0; i < list.size(); i++) {
            data[i] = (int) list.get(i);
        }
        return data;
    }

    @Override
    public String toString() {
        return "Insertion sort";
    }
}
