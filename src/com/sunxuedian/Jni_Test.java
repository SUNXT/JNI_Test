package com.sunxuedian;

public class Jni_Test {
    static {
        System.loadLibrary("");
    }

    public native String helloWorld();
    public native void setString(String string);
}
