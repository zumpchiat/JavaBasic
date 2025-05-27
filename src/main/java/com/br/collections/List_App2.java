package com.br.collections;

import java.util.List;

public class List_App2 {
    public static void main(String[] args) {
        // Listas imutáveis - criadas com List.of - não add ou remove elementos
        var list = List.of("A", "B", "C", "D");

        for (String s:list){
            System.out.println(s);

        }

    }
}
