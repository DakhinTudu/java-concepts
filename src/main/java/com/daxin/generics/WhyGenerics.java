package com.daxin.generics;


import java.util.ArrayList;
import java.util.List;

/**
 * References : https://dev.java/learn/language/fp/generics
 */

public class WhyGenerics {
    public static void main(String[] args) {
        withOutGenerics();
        withGenerics();
    }

    /**
     * methods demonstrating without generics that requires casting
     */
    static void withOutGenerics(){
        List list = new ArrayList();
        list.add("String");
//      String s = list.getFirst();  // without cast -> CE
        String s = (String) list.getFirst();  // CE
        System.out.println(s);
    }

    static void withGenerics(){
        List<String> list = new ArrayList<>();
        list.add("String");
        String s = list.getFirst();
        System.out.println(s);
    }
}

/**
 * Why Generics :
 * 1. Generics enables types (classes and interfaces) to be parameters when defining classes, interfaces and methods more like
 * 2. formal parameters used in methods, difference is input to formal parameters are values while input to type parameters are types

 * Benefits :
 * 1. Stronger type check at compile time, it issues error if the code violets type safety. Fixing compile time error is easier then runtime error
 * 2. Elimination of casts
 */
