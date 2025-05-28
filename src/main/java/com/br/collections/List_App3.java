package com.br.collections;

import java.util.List;

public class List_App3 {
    public static void main(String[] args) {
        //Formas de iterações
        var list = List.of("A", "B", "C", "D", "E");

        for (int i=0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        for (int i=list.size()-1; i >= 0 ; i--){
            String s = list.get(i);
            System.out.println(s);
        }


    }
}
