package com.daxin.generics;

public class GenericTypes {
    public static void main(String[] args) {

        // Box without generic that must only go with Integer
        Box box = new Box();
        box.setObject(123);
        box.setObject("This is string, not supposed to be passed"); // No Compile time check so error won't be found compile
        System.out.println(box.getObject());


        // with generics
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.setT("This is string");
       // genericBox.setT(1234); //C.E here Integer can't go here only String
        System.out.println(genericBox.getT());

    }
}

/**
 * Box without generic
 */
class Box{
    private Object object;

    /**
     *
     * @param object
     */
    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
/**
 * since method accepts and return Object, we are free to pass any object(except primitive types)
 * There is no way to verify it at compile time, how the class is used, one part of code may place Integer and get Integer
 * output while another part of code may mistakenly pass in a String, resulting in a runtime error
 */
}


// Generic version of Box class
class GenericBox<T>{
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}

/**
 * A generic type is a generic class or interface that is parameterized over types
 * Type parameter naming conventions
 * By convention, type parameter names are single, uppercase letters
 * The most commonly used type parameter names are:
 * E - Element (used extensively by the Java Collections Framework)
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 * S, U, V etc. - 2nd, 3rd, 4th types
 */

/**
 * Invoking and instantiating a generic type
 * while invoking he generic type we must replace that TYPE 'T' with actual type, for example :
 * Box<Integer> integerBox = new Box<>();
 *
 * The T in Foo<T> is a type parameter and the String in Foo<String> f is a type argument.
 */
