package org.example;

import org.example.model.Division;
import org.example.model.IndeterminacionEx;

public class Main {
    public static void main(String[] args) {
        Division division = null;
        try {
            division = new Division(5, 0);
            division.visualizarOperacion();
        } catch (IndeterminacionEx e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        System.out.println("Continuamos con el flujo del programa");

    }
}