package com.yzb.design_pattern.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by geely
 */
public class Child extends Base {
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行1");
//    }

    public void method(Map map) {
        System.out.println("子类HashMap入参方法被执行2");
    }
}
