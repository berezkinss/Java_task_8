package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        MyhashSet<String> myset = new MyhashSet();
        myset.add("Привет");
        myset.contains("Привет");
        myset.isEmpty();
        myset.remove("Привет");
        myset.iterator();


    }
}

