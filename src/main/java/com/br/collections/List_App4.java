package com.br.collections;

import java.util.Arrays;
import java.util.List;

public class List_App4 {
    public static void main(String[] args) {
        // Transformando um array em Lista
        Integer[] array = {1,3,4,5,6};

        List<Integer> list = Arrays.asList(array);

        System.out.println(list);

        // Transformando uma Lista em array
        Integer[] array2 = list.toArray(new Integer[5]);
        System.out.println(Arrays.toString(array2));



    }
}
