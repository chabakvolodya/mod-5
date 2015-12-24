package com.goit.module5;

/**
 * Created by Администратор on 24.12.2015.
 */
public class ArrayUtils {

    public static int[] sortMinToMax(int[] array){

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

    public static int[] sortInsertMinToMax(int[] array){

        for (int i = 0; i < array.length; i++){

            for (int k = i + 1; k < array.length; k++){

                if(array[i] > array[k]){
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }

        return array;
    }
}
