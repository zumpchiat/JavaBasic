package com.br.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class List_App5 {
    //Ordenação de Listas
    public static void main(String[] args) {
        var list = new ArrayList<>(List.of(6,4,6,3,34,13,1,3,2));
        Collections.sort(list);
        System.out.println(list);
    }
}
