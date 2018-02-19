package com.frenzi.main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        java.io.File folder = new java.io.File("./web/res/Files");
        java.io.File[] files = folder.listFiles();
        for (java.io.File file:
             files) {
            System.out.println(file.getName());
        }
    }
}
