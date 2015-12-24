package com.goit.module5;

import java.lang.reflect.Array;

/**
 * Created by Администратор on 24.12.2015.
 */
public class ArrayUtils {

    public static int searchMaxInteger(int[] array){

        int result = array[0];

        for (int i = 0; i < array.length; i++){

            if(result < array[i]){
                result = array[i];
            }
        }

        return result;
    }

    public static int searchMinInteger(int[] array){

//        int result = searchMaxInteger(array);
        int result = array[0];


        for (int i = 0; i < array.length; i++){

            if(result > array[i]){
                result = array[i];
            }
        }

        return result;

    }
}
