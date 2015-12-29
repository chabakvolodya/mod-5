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

    public static int[] sortSelectionMinToMax(int[] array){

        for(int i = 0; i < array.length; i++){

            int temp = array[i];
            Integer index = null;

            for(int k = i; k < array.length; k++){
                if(temp > array[k]){
                    temp = array[k];
                    index = k;
                }
            }

            if(index != null){
                int var = array[i];
                array[i] = array[index];
                array[index] = var;
            }
        }

        return array;
    }

    public static int[] sortInsertMinToMax(int[] array){

        for (int i = 0; i < array.length; i++){

            int temp = array[i];

            for (int k = i; k > 0; k--){

                if (temp > array[k - 1])break;  //Якщо array > array[i - 1] виходим з циклу беручи наступний index

                array[k] = array[k - 1];

                if (temp < array[k - 1]){
                    array[k - 1] = temp;    //Вставляєм значення index
                }
            }

        }
        return array;
    }
}
