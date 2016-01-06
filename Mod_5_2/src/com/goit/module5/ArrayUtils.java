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

    public static void mergeSort(int[] array){

        if (array.length <= 1){
            return;
        }

        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        for (int i = 0; i < leftSize; i++)  left[i] = array[i];
        for (int i = 0; i < rightSize; i++) right[i] = array[leftSize + i];

        mergeSort(left);
        mergeSort(right);

        mergeSortUtil(array, left, right);

    }

    private static void mergeSortUtil(int[] array, int[] left, int[] right){

        int leftIndex = 0;
        int rightIndex = 0;
        int targetIndex = 0;
        int remaining = left.length + right.length;

        while (remaining > 0){
            if (leftIndex >= left.length){
                array[targetIndex] = right[rightIndex++];
            }
            else if (rightIndex >= right.length){
                array[targetIndex] = left[leftIndex++];
            }
            else if (compareTo(left[leftIndex], right[rightIndex]) < 0){
                array[targetIndex] = left[leftIndex++];
            }
            else {
                array[targetIndex] = right[rightIndex++];
            }

            targetIndex++;
            remaining--;
        }
    }
    private static int compareTo(int x, int y){

        return (x < y)? -1 : 1;
    }
}
