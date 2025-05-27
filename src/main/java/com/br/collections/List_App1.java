package com.br.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_App1 {
    public static void main(String[] args) {

       // List<Integer> l1 = new ArrayList<>();
        var l1 = new LinkedList<Integer>();

        l1.add(12);
        l1.add(3);
        l1.add(7);
        l1.add(7);
        l1.add(1);

        for (Integer i: l1){
            System.out.println(i);
        }
        l1.remove(1);
        System.out.println("--> " + l1.get(1));
    }
}
