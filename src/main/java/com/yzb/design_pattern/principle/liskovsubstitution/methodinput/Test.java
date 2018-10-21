package com.yzb.design_pattern.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
