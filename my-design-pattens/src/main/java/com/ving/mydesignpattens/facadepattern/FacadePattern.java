package com.ving.mydesignpattens.facadepattern;

public class FacadePattern {
    public static void main(String[] args) {
        System.out.println(new Facade().prove());
    }
}

class SubFlow1 {
    boolean isTrue() {
        return true;
    }
}

class SubFlow2 {
    boolean isOK() {
        return true;
    }
}

class SubFlow3 {
    boolean isGoodMan() {
        return true;
    }
}

class Facade {
    // 外观模式
    // 优点:对用户来说，将实现细节隐藏，只需要操作简单API即可
    // 缺点：违背开闭原则，对扩展开放，对修改关闭。则如果子类有修改，只能修改Facade这个类。
    // （下面的编码，进一步的优化就是，改成面向接口。不能直接直接new，可以改为实例注入）

    SubFlow1 n1 = new SubFlow1();
    SubFlow2 n2 = new SubFlow2();
    SubFlow3 n3 = new SubFlow3();

    boolean prove() {
        return n1.isTrue() && n2.isOK() && n3.isGoodMan();
    }

}