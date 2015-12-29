package com.goit.module5;

/**
 * Created by Администратор on 24.12.2015.
 */
public class Runner {
    public static void main(String[] args) {

        int[] myArray = {9, 5, 4, 1, 74, 159, 3, 7, 5, 4};
//        int[] myArray = {4, 3, 2, 1};

//        myArray = ArrayUtils.sortMinToMax(myArray);

        myArray = ArrayUtils.sortInsertMinToMax(myArray);

        for(int x : myArray){
            System.out.println(x);
        }
    }
}
