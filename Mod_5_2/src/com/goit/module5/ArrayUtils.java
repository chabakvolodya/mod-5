package com.goit.module5;

/**
 * Created by Администратор on 24.12.2015.
 */
public class ArrayUtils {

    public static int[] sortArray(int[] array){

        boolean act = true;

        while (act){

            act = false;

            for(int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]){
                    int temp = array[i];

                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    act = true;
                }
            }
        }

        return array;
    }
}
