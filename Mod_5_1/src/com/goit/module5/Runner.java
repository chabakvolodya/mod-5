package com.goit.module5;

/**
 * Created by Администратор on 24.12.2015.
 */
public class Runner {
    public static void main(String[] args) {

        int[] intArray = {944, 1759, 784, 1, 9, 95, 145, 46, 78, 41, 72};

        System.out.println(ArrayUtils.searchMaxInteger(intArray));

        System.out.println(ArrayUtils.searchMinInteger(intArray));
    }
}
