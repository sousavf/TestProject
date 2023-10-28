package org.example;

public class CopyFactory {

    public static <A extends Copyable> A of(A  object) {
        return (A) object.copy();
    }

}
